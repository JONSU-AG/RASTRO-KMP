package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.pager.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.google.firebase.auth.FirebaseAuth
import com.jonsuapps.rastro.auth.AdminConfig
import com.jonsuapps.rastro.data.AprenderRepository
import com.jonsuapps.rastro.model.*
import com.jonsuapps.rastro.theme.accentText
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.android.ui.components.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged

@Composable
fun MaterialReaderDialog(initialSubjectId: String,onDismiss: () -> Unit,onPractice: (String) -> Unit) {
    val auth=remember { FirebaseAuth.getInstance() }
    var account by remember { mutableStateOf(auth.currentUser) }
    DisposableEffect(auth) {
        val listener=FirebaseAuth.AuthStateListener { account=it.currentUser }
        auth.addAuthStateListener(listener)
        onDispose { auth.removeAuthStateListener(listener) }
    }
    val uid=account?.takeUnless { it.isAnonymous }?.uid ?: "guest"
    key(uid) { MaterialReaderSession(initialSubjectId,uid,onDismiss,onPractice) }
}

@Composable
private fun MaterialReaderSession(initialSubjectId: String,uid: String,onDismiss: () -> Unit,onPractice: (String) -> Unit) {
    val context=LocalContext.current
    val theme=ThemeManager.currentTheme
    val store=remember(uid) { MaterialReaderStore(context,uid) }
    val subject=initialSubjectId
    var selection by remember(subject) { mutableStateOf(store.selection(subject)) }
    var setup by rememberSaveable { mutableStateOf(false) }
    var indexOpen by rememberSaveable { mutableStateOf(false) }
    var retry by remember { mutableIntStateOf(0) }
    var loading by remember(subject) { mutableStateOf(true) }
    var error by remember(subject) { mutableStateOf(false) }
    val lessons by produceState<List<LessonNode>>(emptyList(),subject,retry) {
        loading=true;error=false;value=emptyList()
        try { value=withContext(Dispatchers.IO) { AprenderRepository.getLessonsForSubject(subject) } }
        catch (e: CancellationException) { throw e }
        catch (_: Exception) { error=true }
        finally { loading=false }
    }
    var resourceWarning by remember { mutableStateOf(false) }
    val visuals by produceState<List<EducationalVisual>?>(null) {
        value = try { withContext(Dispatchers.IO) { EducationalVisualRegistry.load(context) } }
        catch(e: CancellationException) {throw e}
        catch(_: Exception) {resourceWarning=true;emptyList()}
    }
    var anchorId by remember { mutableStateOf<String?>(null) }
    var anchorLesson by remember { mutableStateOf<String?>(null) }
    var preparedKey by remember { mutableStateOf<String?>(null) }
    val requestedKey = "$subject|$selection"
    var allUnits by remember { mutableStateOf<List<MaterialUnit>>(emptyList()) }
    var preparing by remember { mutableStateOf(false) }
    val preparedCourse by produceState<List<MaterialUnit>?>(null,subject,lessons,visuals,loading) {
        value=null
        if (lessons.isNotEmpty() && visuals!=null)
            value=withContext(Dispatchers.Default) { materialUnits(lessons,MaterialSelection(),visuals.orEmpty()) }
        else if (!loading && visuals!=null) value=emptyList()
    }
    LaunchedEffect(preparedCourse,selection) {
        preparing=true; preparedKey=null
        val course=preparedCourse
        if(course!=null) {
            allUnits=filterMaterialUnits(course,selection)
            preparedKey=requestedKey
        }
        preparing=false
    }
    var adminUid by remember { mutableStateOf<String?>(null) }
    LaunchedEffect(uid) {
        adminUid=null
        val user=FirebaseAuth.getInstance().currentUser
        if (user != null && !user.isAnonymous && user.uid==uid) user.getIdToken(false).addOnSuccessListener { token ->
            if (FirebaseAuth.getInstance().currentUser?.uid==uid && token.claims["email_verified"]==true &&
                AdminConfig.isEffectiveAdmin(token.claims["email"] as? String)) adminUid=uid
        }
    }
    val canReview=adminUid==uid && FirebaseAuth.getInstance().currentUser?.uid==uid &&
        AdminConfig.isEffectiveAdmin(FirebaseAuth.getInstance().currentUser?.email)
    var marks by remember(uid) { mutableStateOf(store.marks()) }
    var reviewFilter by remember { mutableStateOf(MaterialReview.ALL) }
    var reviewMode by remember { mutableStateOf(false) }
    var markedUnit by remember { mutableStateOf<MaterialUnit?>(null) }
    val units=remember(allUnits,marks,reviewFilter,canReview,preparedKey,requestedKey) {
        if (preparedKey!=requestedKey) emptyList() else if (!canReview || reviewFilter==MaterialReview.ALL) allUnits else allUnits.filter { materialStatus(it,marks[it.id])==reviewFilter }
    }
    val saved=remember(subject,selection,units) { store.position(subject,selection) }
    val start=remember(units,saved) { materialRestoreIndex(units,saved.first) }
    val list=rememberLazyListState()
    val pager=rememberPagerState(pageCount={ units.size })
    val scope=rememberCoroutineScope()
    var restored by remember(subject,selection,units) { mutableStateOf(false) }
    LaunchedEffect(units,selection) {
        if (units.isNotEmpty()) {
            val anchor = units.indexOfFirst { it.id == anchorId }.takeIf { it>=0 }
                ?: units.indexOfFirst { it.lesson.id == anchorLesson }.takeIf { it>=0 }
            val target = anchor ?: start
            list.scrollToItem(target,if(anchor==null) saved.second else 0)
            pager.scrollToPage(target)
            anchorId=null;anchorLesson=null
        }
        restored=true
    }
    LaunchedEffect(subject,selection,units,restored) {
        if (!restored || units.isEmpty()) return@LaunchedEffect
        snapshotFlow {
            if (selection.navigation==MaterialNavigation.VERTICAL) list.firstVisibleItemIndex to list.firstVisibleItemScrollOffset
            else pager.currentPage to 0
        }.distinctUntilChanged().collectLatest { (i,offset) ->
            delay(400)
            units.getOrNull(i)?.let { store.savePosition(subject,selection,it.id,offset) }
        }
    }
    DisposableEffect(subject,selection,units) {
        val oldSubject=subject;val oldSelection=selection
        onDispose {
            val i=if (oldSelection.navigation==MaterialNavigation.VERTICAL) list.firstVisibleItemIndex else pager.currentPage
            units.getOrNull(i)?.let { store.savePosition(oldSubject,oldSelection,it.id,if(oldSelection.navigation==MaterialNavigation.VERTICAL) list.firstVisibleItemScrollOffset else 0) }
        }
    }
    val currentIndex=if(selection.navigation==MaterialNavigation.VERTICAL) list.firstVisibleItemIndex else pager.currentPage
    val current=units.getOrNull(currentIndex)
    fun jump(i: Int) { if(units.isNotEmpty()) scope.launch {
        val target=i.coerceIn(units.indices)
        if(selection.navigation==MaterialNavigation.VERTICAL) list.scrollToItem(target) else pager.animateScrollToPage(target)
    } }
    Dialog(onDismissRequest=onDismiss,properties=DialogProperties(usePlatformDefaultWidth=false,decorFitsSystemWindows=false)) {
        Surface(Modifier.fillMaxSize(),color=theme.background) {
MaterialNotebook("material:$subject:${current?.id}",materialCanDraw(current)) {
                Column(Modifier.fillMaxSize().safeDrawingPadding().padding(horizontal=12.dp)) {
                Row(verticalAlignment=Alignment.CenterVertically) {
                    IconButton(onClick=onDismiss) { Icon(Icons.AutoMirrored.Rounded.ArrowBack,"Cerrar Material",tint=theme.textPrimary) }
                    Text("Material · ${AprenderRepository.getSubjectById(subject)?.name.orEmpty()}",Modifier.weight(1f),fontWeight=FontWeight.Black,color=theme.textPrimary)
                    TextButton(onClick={ indexOpen=true }) { Text("Temas",color=theme.accentText);Icon(Icons.Rounded.ExpandMore,null,tint=theme.accentText) }
                    if (materialCanDraw(current)) PizarraAccessButton()
                }
                Text(listOfNotNull(AprenderRepository.getSubjectById(subject)?.name,current?.let { "Tema ${it.lesson.semana}" },current?.lesson?.subtema,current?.title).joinToString(" → "),
                    style=MaterialTheme.typography.labelMedium,color=theme.textSecondary,maxLines=3)
                Row(Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically,horizontalArrangement=Arrangement.SpaceBetween) {
                    IconButton(onClick={ jump(currentIndex-1) },enabled=currentIndex>0) { Icon(Icons.AutoMirrored.Rounded.ArrowBack,"Contenido anterior") }
                    Text(if(units.isEmpty()) "" else "${currentIndex+1} / ${units.size}",style=MaterialTheme.typography.labelSmall,color=theme.textSecondary)
                    IconButton(onClick={ jump(currentIndex+1) },enabled=currentIndex<units.lastIndex) { Icon(Icons.AutoMirrored.Rounded.ArrowForward,"Contenido siguiente") }
                }
                if(resourceWarning) Text("Los recursos visuales no están disponibles; puedes continuar con el texto.",color=theme.textSecondary)

                when {
                    error -> Column { Text("No se pudo cargar el material.",color=theme.textPrimary); TextButton(onClick={retry++}) { Text("Reintentar") } }
                    loading || preparing || visuals==null || preparedKey!=requestedKey -> Box(Modifier.fillMaxSize(),contentAlignment=Alignment.Center) { CircularProgressIndicator() }

                    units.isEmpty() -> Text("No hay contenido disponible para esta selección.",color=theme.textPrimary)
                    selection.navigation==MaterialNavigation.VERTICAL -> LazyColumn(state=list,modifier=Modifier.weight(1f),verticalArrangement=Arrangement.spacedBy(14.dp),contentPadding=PaddingValues(bottom=24.dp)) {
                        items(units,key={it.id}) { unit -> MaterialUnitView(unit,canReview && reviewMode,marks[unit.id],{markedUnit=unit}) { onDismiss();onPractice(unit.lesson.id) } }
                    }
                    else -> HorizontalPager(state=pager,modifier=Modifier.weight(1f),key={units[it].id},beyondViewportPageCount=0) { i ->
                        val unit=units[i]
                        val pageList=rememberLazyListState()
                        LazyColumn(state=pageList,verticalArrangement=Arrangement.spacedBy(12.dp),contentPadding=PaddingValues(bottom=24.dp)) {
                            item(key=unit.id) { MaterialUnitView(unit,canReview && reviewMode,marks[unit.id],{markedUnit=unit}) { onDismiss();onPractice(unit.lesson.id) } }
                        }
                    }
                }
            }
    }
        }
    }
    if((setup || indexOpen) && !loading) MaterialSetup(lessons,selection,canReview,reviewMode,reviewFilter,
        {reviewMode=it;if(!it) reviewFilter=MaterialReview.ALL},{reviewFilter=it},
        {setup=false;indexOpen=false}) { next ->
        if(next.week==selection.week && next.lessonId==selection.lessonId) {anchorId=current?.id;anchorLesson=current?.lesson?.id}
        else {anchorId=null;anchorLesson=null}
        selection=next;store.saveSelection(subject,next);setup=false;indexOpen=false
    }
    if(canReview && markedUnit!=null) {
        val unit=markedUnit!!
        var note by remember(unit.id) { mutableStateOf(marks[unit.id]?.note.orEmpty()) }
        AlertDialog(onDismissRequest={markedUnit=null},title={Text("Revisión local")},text={Column {
            Text("${unit.lesson.subjectId} · tema ${unit.lesson.semana} · ${unit.lesson.subtema}\n${unit.title}\n${unit.id}")
            OutlinedTextField(note,{note=it.take(1000)},label={Text("Qué necesita corrección")})
            Text("Se guarda en este dispositivo; no edita ni publica contenido.",style=MaterialTheme.typography.labelSmall)
        }},confirmButton={TextButton(onClick={if(canReview) { val m=store.mark(unit,MaterialReview.FLAGGED,note);marks=marks+(unit.id to m) };markedUnit=null}){Text("Marcar error")}},
            dismissButton={TextButton(onClick={if(canReview) {val m=store.mark(unit,MaterialReview.REVIEWED,note);marks=marks+(unit.id to m)};markedUnit=null}){Text("Marcar revisado")}})
    }
}

@Composable
private fun MaterialSetup(lessons: List<LessonNode>,initial: MaterialSelection,canReview: Boolean,reviewMode: Boolean,
    reviewFilter: MaterialReview,onReviewMode:(Boolean)->Unit,onFilter:(MaterialReview)->Unit,
    onDismiss:()->Unit,onStart:(MaterialSelection)->Unit) {
    var draft by remember(initial) { mutableStateOf(initial) }
    var more by remember {mutableStateOf(false)}
    val theme=ThemeManager.currentTheme
    StudyOptionsDialog("Material",onDismiss) {
        StudyChoiceField("Tema",listOf<Int?>(null)+lessons.map {it.semana}.distinct().sorted(),draft.week,
            {it?.let {"Tema $it"}?:"Todo el curso"}){draft=draft.copy(week=it,lessonId=null)}
        if(draft.week!=null) StudyChoiceField("Subtema",listOf<String?>(null)+lessons.filter {it.semana==draft.week}.map {it.id},draft.lessonId,
            {id->id?.let {key->lessons.firstOrNull {it.id==key}?.let {"${it.subtema} · ${it.title}"}}?:"Todo el tema"}){draft=draft.copy(lessonId=it)}
        StudyChoiceField("Ver",MaterialKind.entries,draft.kind,{it.label}){draft=draft.copy(kind=it)}
        TextButton(onClick={more=!more}){Text("Más opciones",color=theme.textSecondary);Icon(if(more) Icons.Rounded.ExpandLess else Icons.Rounded.ExpandMore,null)}
        if(more) {
            StudyChoiceField("Lectura",MaterialNavigation.entries,draft.navigation,{it.label}){draft=draft.copy(navigation=it)}
            if(canReview) {
                Row(verticalAlignment=Alignment.CenterVertically){Text("Revisión del administrador",Modifier.weight(1f),color=theme.textPrimary);Switch(reviewMode,onReviewMode)}
                if(reviewMode) StudyChoiceField("Mostrar",MaterialReview.entries,reviewFilter,{it.label},onFilter)
            }
        }
        Sticker3dButton(onClick={onStart(draft)},modifier=Modifier.fillMaxWidth(),containerColor=theme.accent,contentPadding=PaddingValues(14.dp)){Text("Ver material",fontWeight=FontWeight.Bold)}
    }
}

@Composable
private fun MaterialUnitView(unit: MaterialUnit,canReview: Boolean,mark: MaterialMark?,onMark: ()->Unit,onPractice: ()->Unit) {
    val theme=ThemeManager.currentTheme
    Sticker3dCard(modifier=Modifier.fillMaxWidth(),shape=RoundedCornerShape(20.dp),containerColor=theme.surface,strokeColor=theme.strokeBorder) {
        Column(Modifier.fillMaxWidth().padding(14.dp),verticalArrangement=Arrangement.spacedBy(10.dp)) {
            if(unit.section==null) Text("${unit.lesson.subtema} · ${AcademicPresentationText.clean(unit.title)}",fontWeight=FontWeight.ExtraBold,color=theme.accentText)
            unit.visual?.let { EducationalVisualCard(it) }
            unit.section?.let { AcademicSectionView(it,theme) }
            unit.section?.let { section -> algebraStudyGraphic(unit.lesson.subjectId,section.title)?.let {AlgebraRealLineCard(it)} }
            unit.diagram?.let { AcademicSourceMap(it) }
            unit.table?.let { ScientificMath(emptyList(),theme.textPrimary,theoryStyle=true,tables=listOf(it)) }
            if(unit.paragraph.isNotBlank()) AcademicText(text=unit.paragraph,theoryStyle=true,color=theme.textPrimary)
            unit.challenge?.let { question ->
                var answer by rememberSaveable(unit.id) { mutableStateOf(false) }
                AcademicText(text=question.statement,color=theme.textPrimary)
                question.angleDegrees?.let { AngularConversionCard(it) }
                question.instruction?.let {AcademicText(text=it,color=theme.textSecondary)}
                question.formula?.let {ScientificMath(listOf(it),theme.textPrimary)}
                question.options.forEachIndexed { i,value -> AcademicText(text="${('A'.code+i).toChar()}. $value",color=theme.textPrimary) }
                if(question.type==ChallengeType.MATCH_PAIRS) {
                    question.pairs.forEach {AcademicText(text=it.left,color=theme.textPrimary)}
                    Text("Elementos para relacionar",color=theme.textSecondary)
                    question.rightOptions.forEach {AcademicText(text=it.text,color=theme.textPrimary)}
                }
                if(question.type==ChallengeType.FILL_BLANK) {
                    question.textTemplate?.let {AcademicText(text=it,color=theme.textPrimary)}
                    listOfNotNull(question.sentenceBefore,question.sentenceAfter).forEach {AcademicText(text=it,color=theme.textPrimary)}
                    (question.chips+question.blanks.flatMap {it.options}).distinct().forEach {AcademicText(text=it,color=theme.textSecondary)}
                }
                TextButton(onClick={answer=!answer}) {Text(if(answer) "Ocultar respuesta" else "Ver respuesta y explicación")}
                if(answer) {
                    materialAnswer(question).forEach {AcademicText(text=it,color=theme.accentText)}
                    if(question.explanation.isNotBlank()) AcademicText(text=question.explanation,color=theme.textPrimary)
                    else Text("Esta pregunta todavía no tiene explicación.",color=theme.textSecondary)
                }
                TextButton(onClick=onPractice){Text("Practicar este subtema")}
            }
            if(canReview) TextButton(onClick=onMark){Text("${materialStatus(unit,mark).label} · Revisar / marcar")}
        }
    }
}

/** Theory must neither expose drawing controls nor keep an open ink layer from a question. */
@Composable
private fun MaterialNotebook(contentKey:String,enabled:Boolean,content:@Composable ()->Unit) {
    if(enabled) StudyNotebookHost(contentKey,content=content) else content()
}
