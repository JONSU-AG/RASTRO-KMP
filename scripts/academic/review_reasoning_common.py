"""Static authoring output for the two reasoning subjects; no application runtime code."""
from pathlib import Path
import json,shutil,hashlib
from review_physics_practice import N,C,R,s,choices,label,ROOT

def build_bank(subject,prefix,bank,write=False):
    source=ROOT/'shared/src/commonMain/composeResources/files/aprender'/subject
    fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/subject
    preview=[];proofs=[];preserved={}
    for level,tasks in bank.items():
        week,part=map(int,level.split('.'));rel=Path(f'semana{week:02}')/level/'questions.json'
        path=source/rel;old=json.loads(path.read_text(encoding='utf-8-sig'))
        assert len(tasks)==11 and len(old)in(10,11)
        out=[]
        for i,task in enumerate(tasks):
            # These exact questions already received a documented academic review.
            preserve=part==2 and i in(2,3)and week<={'raz_logico':5,'raz_matematico':7}.get(subject,0)
            if preserve:
                q=old[i];assert 'REVISION_ACADEMICA_BLOQUE_02.md'in q['fuente']
                preserved[q['id']]=hashlib.sha256(json.dumps(q,sort_keys=True,ensure_ascii=False).encode()).hexdigest()
                out.append(q);continue
            qid=f'{prefix}_t{week:02}_s{part:02}_c{i+1:02}'
            if 'answer'in task:
                options,key=choices(task['answer'],task['unit'],i%4,integer_only=task.get('integerOnly',False),fractional=task.get('fractional',False),bounds=task.get('bounds'))
                steps=[task['rule'],'Desarrollamos: $'+task['model']+'$.','El resultado es '+label(task['answer'],task['unit'],fractional=task.get('fractional',False))+'.']
                proofs.append(dict(id=qid,model=task['model'],answer=str(task['answer']),calculated=str(task['calculated'])))
            else:
                shift=i%4;options=task['options'][shift:]+task['options'][:shift];key=(task['key']-shift)%4;steps=task['steps']
                if 'proof'in task:proofs.append(dict(id=qid,**task['proof']))
            q=dict(id=qid,concept=f'{level}.{i+1}',type='MULTIPLE_CHOICE',subject=subject,semana=week,
                   statement=task['stem'],options=options,correctIndex=key,explanation='\n'.join(f'{j+1}. {v}'for j,v in enumerate(steps)),
                   fuente=f'Ejercicio original RASTRO; contraste en docs/aprender/{subject}/REVISION_PRACTICA_PENDIENTE.md',pedagogicalTier='aplicación')
            out.append(q)
        assert len({q['statement']for q in out})==11,level
        assert[q['id']for q in old]==[q['id']for q in out[:len(old)]],level
        if write:
            backup=ROOT/f'build/academic-backup-{subject}'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(json.dumps(out,ensure_ascii=False,indent=2)+'\n',encoding='utf8');assert(fixture/rel).exists();shutil.copy2(path,fixture/rel)
        preview.extend(out)
    target=ROOT/f'build/{subject}-pending'
    target.with_name(target.name+'-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    target.with_name(target.name+'-proofs.json').write_text(json.dumps(dict(levels=len(bank),questions=len(preview),preservedQuestions=preserved,proofs=proofs),ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps(dict(subject=subject,levels=len(bank),questions=len(preview),preserved=len(preserved),checks=len(proofs),written=write)))
