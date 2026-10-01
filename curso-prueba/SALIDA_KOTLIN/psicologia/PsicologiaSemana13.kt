package psicologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object PsicologiaSemana13 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "psi_t13_s01",
            title = "3.1. Enfoque de Riesgo, Tipologías de Violencia, Ciclo de Walker y Acoso Escolar",
            theory = LessonTheory(
                title = "Enfoque de Riesgo, Tipologías de Violencia, Ciclo de Walker y Acoso Escolar",
                content = """# TEMA 13: FACTORES DE RIESGO: VIOLENCIA, CONDUCTA ANTISOCIAL Y ADICCIONES

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[FACTORES DE RIESGO] --> B[Violencia y Vulnerabilidad]
    A --> C[Conductas Delictivas y Pandillaje]
    A --> D[Sustancias Psicoactivas y Adicciones]

    B --> B1[Tipos: Física, Psicológica, Sexual, Económica]
    B --> B2[Ciclo de la Violencia de Leonor Walker]
    B --> B3[Bullying y Cyberbullying: Agresor, Víctima, Espectador]

    C --> C1[Conducta Antisocial en la Adolescencia]
    C --> C2[Presión de Pares y Disfunción Familiar]
    C --> C3[Ausencia de Proyecto de Vida y Deserción]

    D --> D1[Clasificación: Depresoras, Estimulantes, Alucinógenas]
    D --> D2[Proceso Adictivo: Experimental -> Abuso -> Dependencia]
    D --> D3[Fenómenos: Tolerancia, Dependencia Física/Psicológica y Abstinencia]
```

---



## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Concepto y Enfoque de Riesgo Psicosocial
- **Factor de Riesgo:** Toda variable, circunstancia biológica, psicológica, conductual o ambiental cuya presencia incrementa estadísticamente la probabilidad de que un individuo o grupo sufra un daño físico o psicológico, desarrolle un trastorno mental o incurra en conductas autodestructivas o transgresoras de la ley.
- **Vulnerabilidad vs. Riesgo:** La vulnerabilidad es la susceptibilidad intrínseca del sujeto (baja autoestima, impulsividad, predisposición genética); el factor de riesgo es la condición precipitante del entorno (disponibilidad de drogas, violencia doméstica, exclusión social).



### 3.2. Manifestaciones de la Violencia
Uso intencional de la fuerza o el poder físico, de hecho o como amenaza, contra uno mismo, otra persona o un grupo, que cause o tenga muchas probabilidades de causar lesiones, muerte, daño psicológico, trastornos del desarrollo o privaciones (OMS).
1. **Tipologías de la Violencia:**
   - **Física:** Toda acción deliberada que causa daño, dolor o lesión corporal (golpes, empujones, quemaduras).
   - **Psicológica o Emocional:** Conductas orientadas a denigrar, humillar, intimidar, amenazar, aislar o controlar a una persona mediante insultos, descalificaciones, silencios punitivos o celopatía.
   - **Sexual:** Todo acto o tentativa sexual no consentida, tocamientos indebidos, acoso, explotación o imposición mediante coacción, amenaza o abuso de poder.
   - **Económica o Patrimonial:** Control abusivo o privación intencional de recursos económicos, retención de documentos de identidad, bienes o manutención básica para someter a la víctima.

2. **Ciclo de la Violencia Intrafamiliar (Leonor Walker):**
   Explica por qué las víctimas permanecen atrapadas en relaciones de pareja abusivas:
   - **Fase 1: Acumulación de Tensión:** Crecimiento gradual de hostilidad, irritabilidad, reproches y microagresiones verbales. La víctima intenta calmar al agresor y se culpa a sí misma.
   - **Fase 2: Explosión o Descarga Agresiva:** Pérdida absoluta de control del agresor; ocurre el episodio de violencia física, verbal o sexual grave.
   - **Fase 3: Luna de Miel o Reconciliación:** El agresor pide perdón con aparente arrepentimiento sincero, jura que nunca volverá a ocurrir, hace regalos y muestra gran afecto, reforzando la dependencia emocional de la víctima. El ciclo se repite con intervalos cada vez más cortos y mayor letalidad.

3. **Acoso Escolar (*Bullying*) y Acoso Cibernético (*Cyberbullying*):**
   - Conducta de persecución física o psicológica deliberada y repetida en el tiempo que un estudiante o grupo ejerce contra otro más débil, mediada por un **desequilibrio de poder**.
   - **Triángulo del Bullying:**
     - *Agresor:* Personalidad dominante, baja empatía, necesidad de control, agresividad reactiva.
     - *Víctima:* Vulnerable, tímida, con baja autoestima o con alguna característica diferencial visible.
     - *Espectadores (*Bystanders*):* Quienes presencian el acoso; su silencio, risa o indiferencia legitima y perpetúa la agresión.
   - *Cyberbullying:* Hostigamiento sistemático mediante redes sociales, mensajería instantánea o videojuegos en línea; se caracteriza por su alcance masivo, permanencia digital (huella digital) y la sensación de impunidad por el anonimato virtual.

---



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (¿El alcohol es estimulante o depresor?):** ¡La clásica trampa de admisión! La gente cree vulgarmente que el alcohol es "estimulante" porque al inicio desinhibe y vuelve conversadora a la persona. Científicamente, **el alcohol es un DEPRESOR del SNC**: lo primero que deprime e inhibe es la corteza prefrontal (el centro del autocontrol moral y la vergüenza), liberando conductas impulsivas; a dosis mayores deprime los centros motores y el tronco encefálico.
- **Trampa 2 (Tolerancia vs. Abstinencia):**
  - **Tolerancia:** Necesitar *MÁS* dosis para sentir lo mismo.
  - **Abstinencia:** Sufrir *DOLOR* y pánico cuando falta la dosis.
- **Trampa 3 (El espectador en el Bullying):** En preguntas DECO de acoso escolar, el rol del **espectador indiferente o cómplice pasivo** suele ser la clave: no agredir directamente no exime de responsabilidad, pues el silencio refuerza el poder del agresor.

---



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Ciclo de la Violencia de Leonor Walker (Nivel Básico)
**Enunciado:** Tras golpear violentamente a su pareja causándole hematomas en el rostro, Alberto cae de rodillas llorando, le pide perdón desesperadamente, le lleva un ramo de rosas y le jura por sus hijos que *"cambiará para siempre y jamás volverá a tocarla"*. Conmovida por sus palabras y creyendo en su arrepentimiento, la víctima retira la denuncia policial. ¿En qué fase del ciclo de la violencia de Leonor Walker se encuentra esta pareja?
A) Fase de acumulación de tensión  
B) Fase de explosión o agresión  
C) Fase de luna de miel o reconciliación  
D) Fase de resolución asertiva  
E) Fase de violencia vicaria  

**Solución paso a paso:**
1. El agresor manifiesta un arrepentimiento aparente, pide perdón con muestras afectivas exageradas y promete no reincidir para restablecer el vínculo y evitar consecuencias legales.
2. Esta conducta define con absoluta precisión la **Fase de Luna de Miel o Reconciliación**, etapa que precede a un nuevo ciclo de acumulación de tensión.

**Respuesta:** C) Fase de luna de miel o reconciliación.

---



### Problema 4: Dinámica del Bullying y Enfoque DECO (Nivel Avanzado)
**Enunciado:** En un colegio secundario de Arequipa, un grupo de cuatro estudiantes toma fotos a escondidas a un compañero con sobrepeso en los baños, crea una página falsa de Instagram con apodos denigrantes y comparte memes burlones sobre su aspecto físico. Cerca de cuarenta compañeros de clase dan "me gusta" a las publicaciones y comentan con risas, mientras que ninguno se atreve a denunciar la página por temor a convertirse en el nuevo blanco de burlas. Este caso ilustra:
A) Un conflicto motivacional de atracción-atracción.  
B) Un episodio de cyberbullying donde la complicidad activa y el silencio de los espectadores refuerzan y perpetúan el acoso.  
C) Un juego social adaptativo propio de la etapa de moratoria de James Marcia.  
D) Una manifestación de la función socializadora de la familia.  
E) Violencia económica patrimonial sin repercusión psicológica.  

**Solución paso a paso:**
1. Se utiliza la tecnología digital e internet para hostigar, humillar y difamar de manera continua a una víctima vulnerable: **Cyberbullying**.
2. Los compañeros que se ríen, comparten o callan por temor asumen el rol de **espectadores cómplices**, legitimando el poder abusivo de los agresores y desprotegiendo a la víctima.

**Respuesta:** B) Un episodio de cyberbullying donde la complicidad activa y el silencio de los espectadores refuerzan y perpetúan el acoso.

---



### Problema 5: Intervención Multidimensional ante Factores de Riesgo (Boss Challenge)
**Enunciado:** Un programa de prevención de la delincuencia juvenil en zonas periurbanas de alta criminalidad diseña una estrategia comunitaria. En lugar de limitarse a patrullajes policiales punitivos, implementan:
1. Escuelas de padres para capacitar en estilos de crianza democráticos y comunicación asertiva.
2. Talleres de tutoría vocacional y becas para asegurar la culminación de la secundaria.
3. Creación de escuelas deportivas y talleres de música urbana en polideportivos barriales.
Desde la psicología comunitaria y la epidemiología social, la efectividad superior de este programa se debe a que:
A) Sustituye el castigo negativo por el condicionamiento clásico aversivo.  
B) Reduce la vulnerabilidad psicosocial fortaleciendo factores de protección en los tres microentornos fundamentales: la familia, la escuela y la comunidad.  
C) Aplica la introspección experimental de Wundt a nivel masivo.  
D) Elimina la necesidad biológica de pertenencia social en los adolescentes.  
E) Fomenta la difusión de identidad según Erikson.  

**Solución paso a paso:**
1. Los factores de riesgo de la violencia y la delincuencia juvenil no son individuales aislados, sino ecológicos y sistémicos (modelo ecológico de Bronfenbrenner).
2. Intervenir simultáneamente en la **Familia** (crianza democrática), la **Escuela** (retención escolar y proyecto de vida) y la **Comunidad** (deporte, arte y cohesión) crea una red sólida de **factores de protección** que neutralizan el riesgo y activan la resiliencia comunitaria.

**Respuesta:** B) Reduce la vulnerabilidad psicosocial fortaleciendo factores de protección en los tres microentornos fundamentales: la familia, la escuela y la comunidad.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué psicóloga norteamericana formuló la teoría del "Ciclo de la Violencia" compuesta por las fases de tensión, agresión y reconciliación?
   - *Pista:* Autora de *The Battered Woman*.
   - *Clave:* Leonor Walker.

2. ¿Cuál es la categoría farmacológica de drogas a la que pertenecen la cocaína, la pasta básica de cocaína y las anfetaminas, caracterizadas por acelerar el sistema nervioso central?
   - *Pista:* Drogas que activan y sobreexcitan.
   - *Clave:* Estimulantes.

3. ¿Cómo se denomina el fenómeno neurobiológico por el cual un consumidor necesita dosis cada vez mayores de droga para experimentar el mismo efecto psicoactivo inicial?
   - *Pista:* Adaptación celular del organismo.
   - *Clave:* Tolerancia.

4. En el acoso escolar (*bullying*), ¿qué rol asumen aquellos estudiantes que presencian las agresiones y callan o celebran los abusos por miedo o complicidad?
   - *Pista:* Quienes observan sin intervenir.
   - *Clave:* Espectadores (o *bystanders*).

5. ¿Qué tipo de violencia intrafamiliar se manifiesta cuando un progenitor o cónyuge retiene las tarjetas bancarias, prohíbe trabajar a su pareja o destruye intencionalmente sus herramientas de trabajo?
   - *Pista:* Violencia ligada a recursos materiales.
   - *Clave:* Violencia económica (o patrimonial).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Factor de Riesgo:** Condición o variable biológica, psicológica o social que incrementa la probabilidad de desarrollar problemas conductuales, físicos o de salud mental.
2. **Violencia Psicológica:** Agresión invisible dirigida a deteriorar la autoestima, estabilidad emocional y dignidad de una persona mediante humillaciones, amenazas y control.
3. **Ciclo de la Violencia:** Dinámica circular relacional de maltrato intrafamiliar caracterizada por la alternancia periódica de acumulación de tensión, agresión y luna de miel.
4. **Cyberbullying:** Acoso sistemático, intencional y reiterado realizado a través de plataformas digitales, redes sociales y medios telemáticos.
5. **Drogas Depresoras:** Sustancias químicas que desaceleran el funcionamiento del sistema nervioso central, induciendo sedación y relajación motora.
6. **Drogas Estimulantes:** Sustancias que excitan el sistema nervioso central, elevando el estado de vigilia, la frecuencia cardíaca y la actividad dopaminérgica.
7. **Tolerancia:** Disminución progresiva de la respuesta biológica a una droga que exige elevar la dosis para conseguir el efecto original.
8. **Síndrome de Abstinencia:** Reacción psicofisiológica aversiva y dolorosa desencadenada por la suspensión abrupta del consumo de una sustancia en un organismo farmacodependiente.
9. **Craving (Anhelo Compulsivo):** Deseo imperioso, obsesivo e incontrolable de consumir una sustancia psicoactiva.
10. **Deserción Escolar:** Abandono prematuro del sistema educativo formal, constituyendo uno de los factores de riesgo más graves para la marginalidad y la delincuencia.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuáles son las tres fases del ciclo de la violencia de Leonor Walker?**
  *R: 1) Fase de acumulación de tensión; 2) Fase de explosión o agresión; 3) Fase de luna de miel o reconciliación.*
- **P: ¿Por qué el alcohol se clasifica científicamente como un depresor y no como un estimulante?**
  *R: Porque frena y deprime la actividad del sistema nervioso central; la desinhibición inicial ocurre porque deprime el área prefrontal encargada del autocontrol moral.*
- **P: ¿Qué es la tolerancia a una sustancia psicoactiva?**
  *R: La adaptación neuroquímica que exige dosis cada vez mayores para alcanzar el mismo efecto que antes se lograba con dosis menores.*
- **P: ¿Qué distingue al cyberbullying del bullying tradicional presencial?**
  *R: El cyberbullying se realiza a través de medios digitales, tiene potencial de difusión masiva viral, permanece en la red y se ampara en el anonimato virtual.*
- **P: ¿Qué es el síndrome de abstinencia?**
  *R: El conjunto de síntomas físicos y psicológicos angustiantes que padece un adicto cuando se interrumpe bruscamente el ingreso de la droga a su organismo.*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurobiología de las Adicciones:** El consumo crónico de drogas secuestra el **circuito de recompensa mesolímbico** (área tegmental ventral \to núcleo accumbens \to corteza prefrontal), destruyendo la densidad de receptores dopaminérgicos D_2 y provocando anhedonia (incapacidad de disfrutar los placeres naturales de la vida).
- **Criminología y Políticas Públicas:** El enfoque de justicia restaurativa juvenil en el Perú busca la rehabilitación psicosocial de infractores mediante reparación del daño a la comunidad y deshabituación de drogas, superando el modelo penitenciario puramente carcelario.
- **Medicina Legal y Forense:** El peritaje psicológico forense evalúa el daño psíquico en víctimas de violencia intrafamiliar mediante la detección de estrés postraumático (TEPT), depresión reactiva y síndrome de indefensión aprendida.

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Las 3 Fases del Ciclo de la Violencia:**
   > **"T-E-L"** \implies **T**ensión acumulada \to **E**xplosión agresiva \to **L**una de miel.
2. **Las 3 Familias de Drogas:**
   > **"D-E-A"** \implies **D**epresoras (bajan), **E**stimulantes (suben), **A**lucinógenas (distorsionan).
3. **Alcohol y Tabaco:**
   > El alcohol es el rey de las **depresoras**; el tabaco (nicotina) y la cocaína son **estimulantes**.

---



### 4.1. Conductas Delictivas y Factores Asociados
- **Conducta Antisocial y Delincuencia Juvenil:** Trasgresión deliberada de las normas sociales y las leyes penales vigentes (robos, agresiones armadas, extorsión, homicidios).
- **Determinantes Psicosociales:**
  - Deserción escolar temprana y analfabetismo funcional.
  - Crianza bajo estilos negligentes o violencia parental severa.
  - Ausencia de un proyecto de vida estructurado y vacío existencial.
  - **Presión de Pares en Pandillas:** La pandilla juvenil opera como una "familia sustituta" distorsionada que brinda falso sentido de pertenencia, respeto y protección a cambio de la comisión de delitos.



### 4.2. Sustancias Psicoactivas (Drogas) y Neurobiología de la Adicción
Toda sustancia química de origen natural o sintético que, al ingresar al organismo por cualquier vía, altera el funcionamiento del sistema nervioso central (SNC), modificando la percepción, el estado de ánimo, la cognición y la conducta.

1. **Clasificación Farmacológica según sus Efectos en el SNC:**

| Categoría | Efecto en el Sistema Nervioso Central | Sustancias Principales | Consecuencias Clínicas |
| :--- | :--- | :--- | :--- |
| **Depresoras** | Disminuyen, atenúan o frenan la actividad del encéfalo; inducen relajación, sedación y torpeza motora. | **Alcohol etílico**, benzodiacepinas (ansiolíticos), barbitúricos, opiáceos (morfina, heroína). | Lentitud de reflejos, descoordinación, coma y paro respiratorio por sobredosis. |
| **Estimulantes** | Aceleran y sobreexcitan la actividad neuronal; aumentan el estado de vigilia, la energía y la frecuencia cardíaca. | **Cocaína**, pasta básica de cocaína (PBC), anfetaminas, metanfetamina, **nicotina**, cafeína. | Taquicardia, paranoia, psicosis cocaínica, infarto de miocardio, hipertermia. |
| **Alucinógenas (Perturbadoras)** | Distorsionan profundamente la percepción sensorial, el pensamiento y el sentido del tiempo y espacio; causan alucinaciones. | **LSD**, psilocibina (hongos), mezcalina (San Pedro/peyote), **marihuana (THC a dosis altas)**, éxtasis (MDMA). | Despersonalización, ataques de pánico (*mal viaje*), brotes psicóticos duraderos. |

2. **Fases del Proceso Adictivo:**
   \text{Fase Experimental} \longrightarrow \text{Uso Social / Recreativo} \longrightarrow \text{Uso Habitual / Abuso} \longrightarrow \text{Dependencia (Adicción)}
3. **Conceptos Clave de la Farmacodependencia:**
   - **Tolerancia Neuroquímica:** Necesidad adaptativa del cerebro de consumir dosis progresivamente mayores de la sustancia para experimentar el mismo efecto psicoactivo inicial (debido a la desensibilización o reducción de receptores en el circuito de recompensa dopaminérgico).
   - **Dependencia Física:** Adaptación fisiológica del organismo a la presencia continua de la droga, de tal modo que su supresión súbita desencadena graves alteraciones corporales.
   - **Dependencia Psicológica:** Compulsión, anhelo obsesivo (*craving*) y necesidad subjetiva irrefrenable de consumir la droga para experimentar placer o aliviar el malestar emocional.
   - **Síndrome de Abstinencia:** Conjunto agudo y doloroso de síntomas físicos y psicológicos angustiantes (temblores, sudoración, vómitos, convulsiones, taquicardia, pánico) que se desata cuando un individuo dependiente interrumpe bruscamente el consumo.

---



### Problema 3: Neurobiología de la Adicción (Nivel Intermedio-Avanzado)
**Enunciado:** Diego comenzó fumando un cigarrillo al día durante las reuniones sociales. Con el paso de los meses, para experimentar la misma sensación de relajación y placer que sentía al inicio, necesita consumir una cajetilla completa de veinte cigarrillos diarios. Asimismo, si pasa más de cuatro horas sin fumar, experimenta irritabilidad insoportable, temblores en las manos, taquicardia y una intensa ansiedad. En el cuadro de Diego se evidencian claramente los fenómenos farmacológicos de:
A) Sensibilización motora y alucinación refleja.  
B) Tolerancia y síndrome de abstinencia.  
C) Resiliencia física y dependencia cultural.  
D) Intoxicación paradójica y amnesia retrógrada.  
E) Neuroticismo primario y catarsis.  

**Solución paso a paso:**
1. El hecho de requerir una cantidad progresivamente mayor (de 1 a 20 cigarrillos) para sentir el mismo efecto placentero inicial define la **Tolerancia**.
2. El surgimiento de síntomas físicos y psicológicos desagradables (temblor, irritabilidad, taquicardia, angustia) al interrumpir o demorar el consumo define el **Síndrome de Abstinencia**.

**Respuesta:** B) Tolerancia y síndrome de abstinencia.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t13_s01_c01",
                    question = "En la psicología de la salud y prevención comunitaria, un 'Factor de Riesgo Psicosocial' se define formalmente como:",
                    options = listOf(
                        "Una técnica psicoterapéutica empleada exclusivamente en el tratamiento hospitalario de urgencia.",
                        "Una manifestación biológica inmutable que predetermina genéticamente el destino social de un sujeto.",
                        "El conjunto de normas jurídicas que tipifican los delitos cometidos por menores infractores.",
                        "Toda variable personal o ambiental cuya presencia incrementa estadísticamente la probabilidad de daño físico o psicológico."
                    ),
                    correctIndex = 3,
                    explanation = "Un factor de riesgo es cualquier condición o variable biopsicosocial que eleva la probabilidad estadística de que una persona o colectivo sufra un daño, trastorno o conducta desadaptativa."
                ),
                Challenge(
                    id = "psi_t13_s01_c02",
                    question = "La distinción conceptual entre 'Vulnerabilidad' y 'Factor de Riesgo' radica en que:",
                    options = listOf(
                        "La vulnerabilidad atañe únicamente a factores económicos externos y el riesgo a rasgos somáticos hereditarios.",
                        "La vulnerabilidad es la susceptibilidad intrínseca del sujeto, mientras que el factor de riesgo es la condición precipitante del entorno.",
                        "Ambos términos constituyen sinónimos exactos e intercambiables en todos los modelos epidemiológicos.",
                        "El factor de riesgo depende de la voluntad consciente y la vulnerabilidad de leyes orgánicas estatales."
                    ),
                    correctIndex = 1,
                    explanation = "La vulnerabilidad refiere a predisposiciones o fragilidades individuales internas (impulsividad, baja autoestima), mientras los factores de riesgo son agentes o contingencias del entorno que facilitan el daño."
                ),
                Challenge(
                    id = "psi_t13_s01_c03",
                    question = "Cuando un agresor retiene los documentos de identidad, despoja de sus ingresos laborales o impide deliberadamente el acceso al sustento material de su pareja, incurre en violencia:",
                    options = listOf(
                        "Física contingente.",
                        "Psicológica verbal.",
                        "Económica o patrimonial.",
                        "Institucional procesal."
                    ),
                    correctIndex = 2,
                    explanation = "La violencia económica o patrimonial implica el menoscabo, control abusivo o privación intencionada de recursos económicos, bienes o documentos personales para someter a la víctima."
                ),
                Challenge(
                    id = "psi_t13_s01_c04",
                    question = "En el 'Ciclo de la Violencia' intrafamiliar formulado por Leonor Walker, la fase en que el agresor manifiesta arrepentimiento aparente, entrega obsequios y promete solemnemente no volver a agredir se denomina:",
                    options = listOf(
                        "Fase de acumulación de tensión.",
                        "Fase de catarsis reactiva.",
                        "Fase de explosión agresiva.",
                        "Fase de luna de miel o reconciliación."
                    ),
                    correctIndex = 3,
                    explanation = "La fase de 'luna de miel' o reconciliación genera una ilusión de cambio en la víctima, fortaleciendo la dependencia afectiva antes de reiniciar la acumulación de tensiones."
                ),
                Challenge(
                    id = "psi_t13_s01_c05",
                    question = "Durante la 'Fase de Acumulación de Tensión' del ciclo de Leonor Walker, la dinámica cotidiana de la pareja se caracteriza por:",
                    options = listOf(
                        "Incremento progresivo de hostilidad, descalificaciones, reproches y actitud apaciguadora y culpable en la víctima.",
                        "Estallido súbito de golpes y lesiones corporales de máxima gravedad hospitalaria.",
                        "Acuerdos democráticos pacíficos mediante mediación judicial profesional extrajudicial.",
                        "Aislamiento absoluto en que ambas partes conviven de manera armoniosa y desinteresada."
                    ),
                    correctIndex = 0,
                    explanation = "En la acumulación de tensión aumentan las microagresiones y fricciones cotidianas; la víctima suele intentar apaciguar al cónyuge asumiendo erróneamente la culpa del malestar."
                ),
                Challenge(
                    id = "psi_t13_s01_c06",
                    question = "Para que un acto de agresión entre estudiantes sea tipificado rigurosamente como Acoso Escolar (*Bullying*), deben concurrir de forma obligatoria tres criterios:",
                    options = listOf(
                        "Violencia accidental, igualdad de fuerzas físicas e intervención docente inmediata.",
                        "Carácter recreativo, aprobación unánime de los padres y ambiente lúdico supervisado.",
                        "Uso de armas punzocortantes, denuncia penal formal y deserción escolar consumada.",
                        "Intencionalidad de dañar, reiteración a lo largo del tiempo y desequilibrio de poder entre agresor y víctima."
                    ),
                    correctIndex = 3,
                    explanation = "El bullying se define por el daño deliberado, la persistencia temporal sistemática y una marcada asimetría de poder que impide a la víctima defenderse por sí misma."
                ),
                Challenge(
                    id = "psi_t13_s01_c07",
                    question = "Dentro de la tríada o triángulo del bullying, el papel que cumplen los 'Espectadores' (*bystanders*) resulta decisivo debido a que:",
                    options = listOf(
                        "Son los encargados de redactar el acta de conciliación y aplicar las sanciones punitivas escolares.",
                        "Carecen de toda repercusión emocional o moral frente al sufrimiento presenciado en las aulas.",
                        "Asumen la tutela económica y pedagógica obligatoria de la víctima ante la dirección escolar.",
                        "Su silencio, risas o indiferencia pasiva otorgan legitimidad social y refuerzo continuo al comportamiento del agresor."
                    ),
                    correctIndex = 3,
                    explanation = "Los espectadores sostienen la dinámica del acoso: al callar, reír o no intervenir, validan implícitamente el poder del hostigador y perpetúan el aislamiento de la víctima."
                ),
                Challenge(
                    id = "psi_t13_s01_c08",
                    question = "Una característica distintiva primordial del *Cyberbullying* o acoso cibernético en comparación con el bullying presencial es:",
                    options = listOf(
                        "El alcance potencialmente masivo, la permanencia de la huella digital y la sensación de impunidad bajo el anonimato virtual.",
                        "La restricción estricta de la agresión al horario diurno dentro de los recintos escolares.",
                        "La inmediata reparación física espontánea del daño psicológico producido a la víctima.",
                        "La imposibilidad técnica de emplear textos, fotografías o videos grabados por dispositivos móviles."
                    ),
                    correctIndex = 0,
                    explanation = "El ciberacoso trasciende los muros escolares (24/7), viraliza contenidos difamatorios que perduran en la red y cobija al agresor tras el anonimato virtual."
                ),
                Challenge(
                    id = "psi_t13_s01_c09",
                    question = "¿Cuál de las siguientes conductas parentales o familiares constituye un factor de riesgo psicosocial primario para el desarrollo de conductas violentas en los hijos?",
                    options = listOf(
                        "El fomento sistemático del pensamiento crítico, la autonomía y la tolerancia hacia las diferencias.",
                        "La comunicación empática y la resolución reflexiva y dialógica de los desacuerdos hogareños.",
                        "La exposición habitual a castigos físicos severos, maltrato verbal continuo o estilos de crianza negligentes.",
                        "El establecimiento de límites claros, afectuosos y coherentes en la convivencia doméstica."
                    ),
                    correctIndex = 2,
                    explanation = "Crecer en hogares violentos o con negligencia parental severa socializa al menor en patrones de coerción y hostilidad, multiplicando el riesgo de replicar la violencia en sus relaciones sociales."
                ),
                Challenge(
                    id = "psi_t13_s01_c10",
                    question = "En las relaciones interpersonales, la conducta caracterizada por denigrar, aislar de amistades y familiares, someter a humillaciones sistemáticas y celotipia obsesiva constituye violencia:",
                    options = listOf(
                        "Biológica adaptativa.",
                        "Económica indirecta.",
                        "Psicológica o emocional.",
                        "Accidental no dolosa."
                    ),
                    correctIndex = 2,
                    explanation = "La violencia psicológica busca anular la autoestima, autodeterminación y seguridad emocional del individuo mediante manipulación, control celoso y descalificación continua."
                )
            )
        ),
        LessonNode(
            id = "psi_t13_s02",
            title = "4.1. Conductas Delictivas Juveniles, Sustancias Psicoactivas y Farmacodependencia",
            theory = LessonTheory(
                title = "Conductas Delictivas Juveniles, Sustancias Psicoactivas y Farmacodependencia",
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[FACTORES DE RIESGO] --> B[Violencia y Vulnerabilidad]
    A --> C[Conductas Delictivas y Pandillaje]
    A --> D[Sustancias Psicoactivas y Adicciones]

    B --> B1[Tipos: Física, Psicológica, Sexual, Económica]
    B --> B2[Ciclo de la Violencia de Leonor Walker]
    B --> B3[Bullying y Cyberbullying: Agresor, Víctima, Espectador]

    C --> C1[Conducta Antisocial en la Adolescencia]
    C --> C2[Presión de Pares y Disfunción Familiar]
    C --> C3[Ausencia de Proyecto de Vida y Deserción]

    D --> D1[Clasificación: Depresoras, Estimulantes, Alucinógenas]
    D --> D2[Proceso Adictivo: Experimental -> Abuso -> Dependencia]
    D --> D3[Fenómenos: Tolerancia, Dependencia Física/Psicológica y Abstinencia]
```

---



### 4.1. Conductas Delictivas y Factores Asociados
- **Conducta Antisocial y Delincuencia Juvenil:** Trasgresión deliberada de las normas sociales y las leyes penales vigentes (robos, agresiones armadas, extorsión, homicidios).
- **Determinantes Psicosociales:**
  - Deserción escolar temprana y analfabetismo funcional.
  - Crianza bajo estilos negligentes o violencia parental severa.
  - Ausencia de un proyecto de vida estructurado y vacío existencial.
  - **Presión de Pares en Pandillas:** La pandilla juvenil opera como una "familia sustituta" distorsionada que brinda falso sentido de pertenencia, respeto y protección a cambio de la comisión de delitos.



### 4.2. Sustancias Psicoactivas (Drogas) y Neurobiología de la Adicción
Toda sustancia química de origen natural o sintético que, al ingresar al organismo por cualquier vía, altera el funcionamiento del sistema nervioso central (SNC), modificando la percepción, el estado de ánimo, la cognición y la conducta.

1. **Clasificación Farmacológica según sus Efectos en el SNC:**

| Categoría | Efecto en el Sistema Nervioso Central | Sustancias Principales | Consecuencias Clínicas |
| :--- | :--- | :--- | :--- |
| **Depresoras** | Disminuyen, atenúan o frenan la actividad del encéfalo; inducen relajación, sedación y torpeza motora. | **Alcohol etílico**, benzodiacepinas (ansiolíticos), barbitúricos, opiáceos (morfina, heroína). | Lentitud de reflejos, descoordinación, coma y paro respiratorio por sobredosis. |
| **Estimulantes** | Aceleran y sobreexcitan la actividad neuronal; aumentan el estado de vigilia, la energía y la frecuencia cardíaca. | **Cocaína**, pasta básica de cocaína (PBC), anfetaminas, metanfetamina, **nicotina**, cafeína. | Taquicardia, paranoia, psicosis cocaínica, infarto de miocardio, hipertermia. |
| **Alucinógenas (Perturbadoras)** | Distorsionan profundamente la percepción sensorial, el pensamiento y el sentido del tiempo y espacio; causan alucinaciones. | **LSD**, psilocibina (hongos), mezcalina (San Pedro/peyote), **marihuana (THC a dosis altas)**, éxtasis (MDMA). | Despersonalización, ataques de pánico (*mal viaje*), brotes psicóticos duraderos. |

2. **Fases del Proceso Adictivo:**
   \text{Fase Experimental} \longrightarrow \text{Uso Social / Recreativo} \longrightarrow \text{Uso Habitual / Abuso} \longrightarrow \text{Dependencia (Adicción)}
3. **Conceptos Clave de la Farmacodependencia:**
   - **Tolerancia Neuroquímica:** Necesidad adaptativa del cerebro de consumir dosis progresivamente mayores de la sustancia para experimentar el mismo efecto psicoactivo inicial (debido a la desensibilización o reducción de receptores en el circuito de recompensa dopaminérgico).
   - **Dependencia Física:** Adaptación fisiológica del organismo a la presencia continua de la droga, de tal modo que su supresión súbita desencadena graves alteraciones corporales.
   - **Dependencia Psicológica:** Compulsión, anhelo obsesivo (*craving*) y necesidad subjetiva irrefrenable de consumir la droga para experimentar placer o aliviar el malestar emocional.
   - **Síndrome de Abstinencia:** Conjunto agudo y doloroso de síntomas físicos y psicológicos angustiantes (temblores, sudoración, vómitos, convulsiones, taquicardia, pánico) que se desata cuando un individuo dependiente interrumpe bruscamente el consumo.

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Las 3 Fases del Ciclo de la Violencia:**
   > **"T-E-L"** \implies **T**ensión acumulada \to **E**xplosión agresiva \to **L**una de miel.
2. **Las 3 Familias de Drogas:**
   > **"D-E-A"** \implies **D**epresoras (bajan), **E**stimulantes (suben), **A**lucinógenas (distorsionan).
3. **Alcohol y Tabaco:**
   > El alcohol es el rey de las **depresoras**; el tabaco (nicotina) y la cocaína son **estimulantes**.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (¿El alcohol es estimulante o depresor?):** ¡La clásica trampa de admisión! La gente cree vulgarmente que el alcohol es "estimulante" porque al inicio desinhibe y vuelve conversadora a la persona. Científicamente, **el alcohol es un DEPRESOR del SNC**: lo primero que deprime e inhibe es la corteza prefrontal (el centro del autocontrol moral y la vergüenza), liberando conductas impulsivas; a dosis mayores deprime los centros motores y el tronco encefálico.
- **Trampa 2 (Tolerancia vs. Abstinencia):**
  - **Tolerancia:** Necesitar *MÁS* dosis para sentir lo mismo.
  - **Abstinencia:** Sufrir *DOLOR* y pánico cuando falta la dosis.
- **Trampa 3 (El espectador en el Bullying):** En preguntas DECO de acoso escolar, el rol del **espectador indiferente o cómplice pasivo** suele ser la clave: no agredir directamente no exime de responsabilidad, pues el silencio refuerza el poder del agresor.

---



### Problema 2: Clasificación Farmacológica de Sustancias (Nivel Intermedio)
**Enunciado:** Un paciente ingresa a la sala de emergencias de un hospital con pupilas puntiformes (miosis extrema), respiración lenta y superficial (bradipnea severa de 6 respiraciones por minuto), bradicardia e inconsciencia total tras consumir una sustancia ilícita. Por sus efectos de sedación extrema y colapso del sistema respiratorio, la sustancia causante de la intoxicación pertenece a la categoría de:
A) Estimulantes del sistema nervioso  
B) Alucinógenos sintéticos puros  
C) Drogas depresoras del sistema nervioso central (opiáceos)  
D) Fármacos nootrópicos  
E) Vitaminas liposolubles  

**Solución paso a paso:**
1. La sustancia causó depresión profunda de los centros vitales del tronco encefálico (respiración y frecuencia cardíaca lenta, sedación y coma).
2. Estas manifestaciones clínicas corresponden a una intoxicación aguda por **sustancias depresoras**, específicamente sobredosis por **opiáceos** (como morfina o heroína).

**Respuesta:** C) Drogas depresoras del sistema nervioso central (opiáceos).

---



### Problema 3: Neurobiología de la Adicción (Nivel Intermedio-Avanzado)
**Enunciado:** Diego comenzó fumando un cigarrillo al día durante las reuniones sociales. Con el paso de los meses, para experimentar la misma sensación de relajación y placer que sentía al inicio, necesita consumir una cajetilla completa de veinte cigarrillos diarios. Asimismo, si pasa más de cuatro horas sin fumar, experimenta irritabilidad insoportable, temblores en las manos, taquicardia y una intensa ansiedad. En el cuadro de Diego se evidencian claramente los fenómenos farmacológicos de:
A) Sensibilización motora y alucinación refleja.  
B) Tolerancia y síndrome de abstinencia.  
C) Resiliencia física y dependencia cultural.  
D) Intoxicación paradójica y amnesia retrógrada.  
E) Neuroticismo primario y catarsis.  

**Solución paso a paso:**
1. El hecho de requerir una cantidad progresivamente mayor (de 1 a 20 cigarrillos) para sentir el mismo efecto placentero inicial define la **Tolerancia**.
2. El surgimiento de síntomas físicos y psicológicos desagradables (temblor, irritabilidad, taquicardia, angustia) al interrumpir o demorar el consumo define el **Síndrome de Abstinencia**.

**Respuesta:** B) Tolerancia y síndrome de abstinencia.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué psicóloga norteamericana formuló la teoría del "Ciclo de la Violencia" compuesta por las fases de tensión, agresión y reconciliación?
   - *Pista:* Autora de *The Battered Woman*.
   - *Clave:* Leonor Walker.

2. ¿Cuál es la categoría farmacológica de drogas a la que pertenecen la cocaína, la pasta básica de cocaína y las anfetaminas, caracterizadas por acelerar el sistema nervioso central?
   - *Pista:* Drogas que activan y sobreexcitan.
   - *Clave:* Estimulantes.

3. ¿Cómo se denomina el fenómeno neurobiológico por el cual un consumidor necesita dosis cada vez mayores de droga para experimentar el mismo efecto psicoactivo inicial?
   - *Pista:* Adaptación celular del organismo.
   - *Clave:* Tolerancia.

4. En el acoso escolar (*bullying*), ¿qué rol asumen aquellos estudiantes que presencian las agresiones y callan o celebran los abusos por miedo o complicidad?
   - *Pista:* Quienes observan sin intervenir.
   - *Clave:* Espectadores (o *bystanders*).

5. ¿Qué tipo de violencia intrafamiliar se manifiesta cuando un progenitor o cónyuge retiene las tarjetas bancarias, prohíbe trabajar a su pareja o destruye intencionalmente sus herramientas de trabajo?
   - *Pista:* Violencia ligada a recursos materiales.
   - *Clave:* Violencia económica (o patrimonial).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Factor de Riesgo:** Condición o variable biológica, psicológica o social que incrementa la probabilidad de desarrollar problemas conductuales, físicos o de salud mental.
2. **Violencia Psicológica:** Agresión invisible dirigida a deteriorar la autoestima, estabilidad emocional y dignidad de una persona mediante humillaciones, amenazas y control.
3. **Ciclo de la Violencia:** Dinámica circular relacional de maltrato intrafamiliar caracterizada por la alternancia periódica de acumulación de tensión, agresión y luna de miel.
4. **Cyberbullying:** Acoso sistemático, intencional y reiterado realizado a través de plataformas digitales, redes sociales y medios telemáticos.
5. **Drogas Depresoras:** Sustancias químicas que desaceleran el funcionamiento del sistema nervioso central, induciendo sedación y relajación motora.
6. **Drogas Estimulantes:** Sustancias que excitan el sistema nervioso central, elevando el estado de vigilia, la frecuencia cardíaca y la actividad dopaminérgica.
7. **Tolerancia:** Disminución progresiva de la respuesta biológica a una droga que exige elevar la dosis para conseguir el efecto original.
8. **Síndrome de Abstinencia:** Reacción psicofisiológica aversiva y dolorosa desencadenada por la suspensión abrupta del consumo de una sustancia en un organismo farmacodependiente.
9. **Craving (Anhelo Compulsivo):** Deseo imperioso, obsesivo e incontrolable de consumir una sustancia psicoactiva.
10. **Deserción Escolar:** Abandono prematuro del sistema educativo formal, constituyendo uno de los factores de riesgo más graves para la marginalidad y la delincuencia.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuáles son las tres fases del ciclo de la violencia de Leonor Walker?**
  *R: 1) Fase de acumulación de tensión; 2) Fase de explosión o agresión; 3) Fase de luna de miel o reconciliación.*
- **P: ¿Por qué el alcohol se clasifica científicamente como un depresor y no como un estimulante?**
  *R: Porque frena y deprime la actividad del sistema nervioso central; la desinhibición inicial ocurre porque deprime el área prefrontal encargada del autocontrol moral.*
- **P: ¿Qué es la tolerancia a una sustancia psicoactiva?**
  *R: La adaptación neuroquímica que exige dosis cada vez mayores para alcanzar el mismo efecto que antes se lograba con dosis menores.*
- **P: ¿Qué distingue al cyberbullying del bullying tradicional presencial?**
  *R: El cyberbullying se realiza a través de medios digitales, tiene potencial de difusión masiva viral, permanece en la red y se ampara en el anonimato virtual.*
- **P: ¿Qué es el síndrome de abstinencia?**
  *R: El conjunto de síntomas físicos y psicológicos angustiantes que padece un adicto cuando se interrumpe bruscamente el ingreso de la droga a su organismo.*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurobiología de las Adicciones:** El consumo crónico de drogas secuestra el **circuito de recompensa mesolímbico** (área tegmental ventral \to núcleo accumbens \to corteza prefrontal), destruyendo la densidad de receptores dopaminérgicos D_2 y provocando anhedonia (incapacidad de disfrutar los placeres naturales de la vida).
- **Criminología y Políticas Públicas:** El enfoque de justicia restaurativa juvenil en el Perú busca la rehabilitación psicosocial de infractores mediante reparación del daño a la comunidad y deshabituación de drogas, superando el modelo penitenciario puramente carcelario.
- **Medicina Legal y Forense:** El peritaje psicológico forense evalúa el daño psíquico en víctimas de violencia intrafamiliar mediante la detección de estrés postraumático (TEPT), depresión reactiva y síndrome de indefensión aprendida.

---



### 3.1. Concepto y Enfoque de Riesgo Psicosocial
- **Factor de Riesgo:** Toda variable, circunstancia biológica, psicológica, conductual o ambiental cuya presencia incrementa estadísticamente la probabilidad de que un individuo o grupo sufra un daño físico o psicológico, desarrolle un trastorno mental o incurra en conductas autodestructivas o transgresoras de la ley.
- **Vulnerabilidad vs. Riesgo:** La vulnerabilidad es la susceptibilidad intrínseca del sujeto (baja autoestima, impulsividad, predisposición genética); el factor de riesgo es la condición precipitante del entorno (disponibilidad de drogas, violencia doméstica, exclusión social).



### Problema 5: Intervención Multidimensional ante Factores de Riesgo (Boss Challenge)
**Enunciado:** Un programa de prevención de la delincuencia juvenil en zonas periurbanas de alta criminalidad diseña una estrategia comunitaria. En lugar de limitarse a patrullajes policiales punitivos, implementan:
1. Escuelas de padres para capacitar en estilos de crianza democráticos y comunicación asertiva.
2. Talleres de tutoría vocacional y becas para asegurar la culminación de la secundaria.
3. Creación de escuelas deportivas y talleres de música urbana en polideportivos barriales.
Desde la psicología comunitaria y la epidemiología social, la efectividad superior de este programa se debe a que:
A) Sustituye el castigo negativo por el condicionamiento clásico aversivo.  
B) Reduce la vulnerabilidad psicosocial fortaleciendo factores de protección en los tres microentornos fundamentales: la familia, la escuela y la comunidad.  
C) Aplica la introspección experimental de Wundt a nivel masivo.  
D) Elimina la necesidad biológica de pertenencia social en los adolescentes.  
E) Fomenta la difusión de identidad según Erikson.  

**Solución paso a paso:**
1. Los factores de riesgo de la violencia y la delincuencia juvenil no son individuales aislados, sino ecológicos y sistémicos (modelo ecológico de Bronfenbrenner).
2. Intervenir simultáneamente en la **Familia** (crianza democrática), la **Escuela** (retención escolar y proyecto de vida) y la **Comunidad** (deporte, arte y cohesión) crea una red sólida de **factores de protección** que neutralizan el riesgo y activan la resiliencia comunitaria.

**Respuesta:** B) Reduce la vulnerabilidad psicosocial fortaleciendo factores de protección en los tres microentornos fundamentales: la familia, la escuela y la comunidad.

---



### 3.2. Manifestaciones de la Violencia
Uso intencional de la fuerza o el poder físico, de hecho o como amenaza, contra uno mismo, otra persona o un grupo, que cause o tenga muchas probabilidades de causar lesiones, muerte, daño psicológico, trastornos del desarrollo o privaciones (OMS).
1. **Tipologías de la Violencia:**
   - **Física:** Toda acción deliberada que causa daño, dolor o lesión corporal (golpes, empujones, quemaduras).
   - **Psicológica o Emocional:** Conductas orientadas a denigrar, humillar, intimidar, amenazar, aislar o controlar a una persona mediante insultos, descalificaciones, silencios punitivos o celopatía.
   - **Sexual:** Todo acto o tentativa sexual no consentida, tocamientos indebidos, acoso, explotación o imposición mediante coacción, amenaza o abuso de poder.
   - **Económica o Patrimonial:** Control abusivo o privación intencional de recursos económicos, retención de documentos de identidad, bienes o manutención básica para someter a la víctima.

2. **Ciclo de la Violencia Intrafamiliar (Leonor Walker):**
   Explica por qué las víctimas permanecen atrapadas en relaciones de pareja abusivas:
   - **Fase 1: Acumulación de Tensión:** Crecimiento gradual de hostilidad, irritabilidad, reproches y microagresiones verbales. La víctima intenta calmar al agresor y se culpa a sí misma.
   - **Fase 2: Explosión o Descarga Agresiva:** Pérdida absoluta de control del agresor; ocurre el episodio de violencia física, verbal o sexual grave.
   - **Fase 3: Luna de Miel o Reconciliación:** El agresor pide perdón con aparente arrepentimiento sincero, jura que nunca volverá a ocurrir, hace regalos y muestra gran afecto, reforzando la dependencia emocional de la víctima. El ciclo se repite con intervalos cada vez más cortos y mayor letalidad.

3. **Acoso Escolar (*Bullying*) y Acoso Cibernético (*Cyberbullying*):**
   - Conducta de persecución física o psicológica deliberada y repetida en el tiempo que un estudiante o grupo ejerce contra otro más débil, mediada por un **desequilibrio de poder**.
   - **Triángulo del Bullying:**
     - *Agresor:* Personalidad dominante, baja empatía, necesidad de control, agresividad reactiva.
     - *Víctima:* Vulnerable, tímida, con baja autoestima o con alguna característica diferencial visible.
     - *Espectadores (*Bystanders*):* Quienes presencian el acoso; su silencio, risa o indiferencia legitima y perpetúa la agresión.
   - *Cyberbullying:* Hostigamiento sistemático mediante redes sociales, mensajería instantánea o videojuegos en línea; se caracteriza por su alcance masivo, permanencia digital (huella digital) y la sensación de impunidad por el anonimato virtual.

---



### Problema 1: Ciclo de la Violencia de Leonor Walker (Nivel Básico)
**Enunciado:** Tras golpear violentamente a su pareja causándole hematomas en el rostro, Alberto cae de rodillas llorando, le pide perdón desesperadamente, le lleva un ramo de rosas y le jura por sus hijos que *"cambiará para siempre y jamás volverá a tocarla"*. Conmovida por sus palabras y creyendo en su arrepentimiento, la víctima retira la denuncia policial. ¿En qué fase del ciclo de la violencia de Leonor Walker se encuentra esta pareja?
A) Fase de acumulación de tensión  
B) Fase de explosión o agresión  
C) Fase de luna de miel o reconciliación  
D) Fase de resolución asertiva  
E) Fase de violencia vicaria  

**Solución paso a paso:**
1. El agresor manifiesta un arrepentimiento aparente, pide perdón con muestras afectivas exageradas y promete no reincidir para restablecer el vínculo y evitar consecuencias legales.
2. Esta conducta define con absoluta precisión la **Fase de Luna de Miel o Reconciliación**, etapa que precede a un nuevo ciclo de acumulación de tensión.

**Respuesta:** C) Fase de luna de miel o reconciliación.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t13_s02_c01",
                    question = "Una sustancia química natural o sintética se define formalmente como 'Psicoactiva' cuando al ingresar al organismo:",
                    options = listOf(
                        "Altera el funcionamiento del Sistema Nervioso Central modificando la percepción, el ánimo, la cognición y la conducta.",
                        "Incrementa de forma permanente la capacidad de regeneración celular de los músculos esqueléticos.",
                        "Cura definitivamente cualquier predisposición genética a enfermedades cardiovasculares crónicas.",
                        "Inmuniza de por vida el sistema linfático contra bacterias patógenas de transmisión respiratoria."
                    ),
                    correctIndex = 0,
                    explanation = "Las sustancias psicoactivas o drogas son aquellas que atraviesan la barrera hematoencefálica y perturban las funciones neurocognitivas y afectivas del Sistema Nervioso Central."
                ),
                Challenge(
                    id = "psi_t13_s02_c02",
                    question = "Las drogas que disminuyen la actividad neurofisiológica del encéfalo, induciendo sedación, relajación muscular y lentitud de reflejos, se clasifican como:",
                    options = listOf(
                        "Estimulantes psicomotores.",
                        "Depresoras del SNC.",
                        "Anestésicas locales puras.",
                        "Alucinógenas o perturbadoras."
                    ),
                    correctIndex = 1,
                    explanation = "Las sustancias depresoras atenúan la actividad del SNC, reduciendo el ritmo cardíaco, la coordinación motriz y la vigilia (ej. alcohol etílico, benzodiacepinas, opiáceos)."
                ),
                Challenge(
                    id = "psi_t13_s02_c03",
                    question = "Científicamente, el alcohol etílico es catalogado farmacológicamente como una sustancia:",
                    options = listOf(
                        "Estimulante primaria del sistema dopaminérgico motor estriatal.",
                        "Antipsicótica de acción prolongada sin potencial adictivo alguno.",
                        "Depresora del Sistema Nervioso Central, cuya aparente euforia inicial deriva de la inhibición de la corteza prefrontal.",
                        "Alucinógena de alta potencia que suprime el pensamiento abstracto y visual."
                    ),
                    correctIndex = 2,
                    explanation = "El alcohol es un depresor: desinhibe al principio porque deprime las áreas corticales encargadas del autocontrol y la censura moral, deprimiendo luego centros motores y vitales."
                ),
                Challenge(
                    id = "psi_t13_s02_c04",
                    question = "Sustancias como la cocaína, las anfetaminas y la nicotina pertenecen a la categoría de:",
                    options = listOf(
                        "Depresoras de acción lenta.",
                        "Sedantes hipnóticos no narcóticos.",
                        "Estimulantes del SNC.",
                        "Alucinógenos disociativos mayores."
                    ),
                    correctIndex = 2,
                    explanation = "Los estimulantes aceleran el funcionamiento neuronal, provocando hiperalerta, taquicardia, dilatación pupilar y supresión del cansancio y del apetito."
                ),
                Challenge(
                    id = "psi_t13_s02_c05",
                    question = "En el estudio de las drogodependencias, el fenómeno neuroadaptativo de la 'Tolerancia' se constata cuando:",
                    options = listOf(
                        "El individuo necesita dosis progresivamente mayores de la droga para conseguir los efectos psicoactivos iniciales.",
                        "El consumidor experimenta asco inmediato ante cualquier contacto visual con la sustancia psicoactiva.",
                        "La persona logra suspender voluntariamente el consumo sin experimentar ningún tipo de malestar somático.",
                        "El cuerpo metaboliza la droga destruyéndola al instante sin permitir su absorción plasmática."
                    ),
                    correctIndex = 0,
                    explanation = "La tolerancia es la adaptación fisiológica por la cual el organismo desensibiliza receptores, requiriendo cantidades crecientes para alcanzar la misma intensidad de efecto."
                ),
                Challenge(
                    id = "psi_t13_s02_c06",
                    question = "El 'Síndrome de Abstinencia' en un individuo farmacodependiente consiste en:",
                    options = listOf(
                        "La habilidad adquirida para rechazar ofertas sociales de consumo de alcohol en reuniones festivas.",
                        "El conjunto agudo de manifestaciones fisiológicas y psicológicas angustiantes desatadas al interrumpir o reducir el consumo brusco de la droga.",
                        "El estado de bienestar y relajación absoluta alcanzado al consumir una dosis letal de sedantes.",
                        "La creencia delirante de que todas las leyes prohibitivas del país han quedado derogadas."
                    ),
                    correctIndex = 1,
                    explanation = "La abstinencia manifiesta el sufrimiento del organismo que se acostumbró a la presencia de la sustancia (dependencia física), provocando taquicardia, temblores, ansiedad o convulsiones."
                ),
                Challenge(
                    id = "psi_t13_s02_c07",
                    question = "¿Cuál es la secuencia correlativa de las fases del proceso adictivo?",
                    options = listOf(
                        "Dependencia -> Abstinencia -> Fase Experimental -> Uso Recreativo.",
                        "Abuso -> Dependencia -> Tolerancia Inversa -> Fase Social.",
                        "Uso Habitual -> Síndrome Agudo -> Fase Experimental -> Abstinencia.",
                        "Fase Experimental -> Uso Social/Recreativo -> Uso Habitual/Abuso -> Dependencia."
                    ),
                    correctIndex = 3,
                    explanation = "La adicción es un continuum que transita de la experimentación curiosa al uso social, derivando en el abuso habitual y desembocando en la dependencia psicofísica compulsiva."
                ),
                Challenge(
                    id = "psi_t13_s02_c08",
                    question = "En la psicología de la delincuencia juvenil, la pandilla transgresora suele operar en la vida del adolescente como:",
                    options = listOf(
                        "Una entidad oficial tutelar que fiscaliza el rendimiento escolar y premia los méritos cívicos.",
                        "Una familia sustituta distorsionada que provee falso sentido de pertenencia, lealtad y protección a cambio de la comisión de ilícitos.",
                        "Una cooperativa de ahorro comunal orientada a la capacitación técnica de jóvenes talentos.",
                        "Un grupo de estudio formal que prepara a los estudiantes para los exámenes de admisión universitaria."
                    ),
                    correctIndex = 1,
                    explanation = "Ante la fractura familiar y la exclusión, la pandilla cubre necesidades de pertenencia e identidad, exigiendo en contrapartida fidelidad ciega y conductas delictivas."
                ),
                Challenge(
                    id = "psi_t13_s02_c09",
                    question = "La 'Dependencia Psicológica' hacia una sustancia psicoactiva se distingue de la física porque la primera se manifiesta principalmente como:",
                    options = listOf(
                        "Un reflejo condicionado motor puramente espinal inmune a la voluntad de la corteza cerebral.",
                        "Deseo compulsivo obsesivo (*craving*) y necesidad subjetiva irrefrenable de consumir para sentir bienestar o evitar el displacer.",
                        "Espasmos musculares involuntarios y sudoración profusa provocados por daño periférico.",
                        "Una inflamación hepática diagnosticable mediante análisis de sangre y ecografía abdominal."
                    ),
                    correctIndex = 1,
                    explanation = "La dependencia psicológica reside en el anhelo psíquico obsesivo (*craving*), donde el individuo siente que no puede funcionar o estar tranquilo sin la sustancia."
                ),
                Challenge(
                    id = "psi_t13_s02_c10",
                    question = "¿Cuál de los siguientes factores constituye un determinante psicosocial estrechamente asociado a las conductas delictivas juveniles?",
                    options = listOf(
                        "La deserción escolar temprana, el vacío en el proyecto de vida y la presión de pares en entornos de vulnerabilidad.",
                        "El aprendizaje temprano de idiomas extranjeros y la afición a la lectura de clásicos universales.",
                        "La práctica habitual de deportes colectivos bajo el auspicio de ligas infantiles acreditadas.",
                        "La posesión de altas habilidades metacognitivas y empatía comunitaria madura."
                    ),
                    correctIndex = 0,
                    explanation = "El abandono de los estudios, la carencia de metas de futuro y la presión coercitiva del grupo de pares marginales confluyen como factores criminógenos de primer orden."
                )
            )
        )
    )
}
