import urllib.request, json, pathlib, concurrent.futures, xml.etree.ElementTree as ET
root=pathlib.Path(__file__).resolve().parents[2]
groups={
'biology':'dna dna-off microscope leaf sprout flower-2 tree-pine trees brain heart-pulse bone fish bird bug snail turtle rabbit shell biohazard syringe droplet circle-dot network layers',
'physics':'atom magnet zap orbit satellite rocket gauge waves-horizontal thermometer sun eclipse lightbulb radio circuit-board weight scale move compass timer wind',
'chemistry':'flask-conical flask-round test-tube test-tubes pipette beaker bubbles hexagon diamond gem flame snowflake radiation',
'history':'scroll scroll-text crown columns-3 landmark castle shield swords ship anchor amphora hourglass flag map pin',
'literature':'book book-open book-bookmark library-big notebook-pen feather pen-tool drama quote text-initial speech languages newspaper',
'math':'pi sigma radical divide percent ruler triangle square circle pentagon chart-line chart-bar chart-pie binary infinity calculator draft­ing-compass',
'generic':'puzzle target graduation-cap globe earth mountain telescope book-check lightbulb compass message-circle handshake eye scale route'}
groups['math']=groups['math'].replace('draft­ing-compass','drafting-compass')
names=sorted(set(' '.join(groups.values()).split()))
commit='500620a2e8123f8d1db191538886dc0c223f69a9'
base=f'https://raw.githubusercontent.com/lucide-icons/lucide/{commit}/'
tree=json.load(urllib.request.urlopen(f'https://api.github.com/repos/lucide-icons/lucide/git/trees/{commit}?recursive=1'))
available={e['path'][6:-4] for e in tree['tree'] if e['path'].startswith('icons/') and e['path'].endswith('.svg')}
print('Unavailable names:',set(names)-available,flush=True)
assert set(names) <= available, 'Fix unavailable icon names before generating'
assets=root/'androidApp/src/main/assets/trail'; assets.mkdir(parents=True,exist_ok=True)
draw=root/'androidApp/src/main/res/drawable'
(assets/'LICENSE.txt').write_bytes(urllib.request.urlopen(base+'LICENSE').read())
def convert(name):
    raw=urllib.request.urlopen(base+'icons/'+name+'.svg').read().decode()
    svg=ET.fromstring(raw); paths=[]
    for e in svg:
        t=e.tag.split('}')[-1]; a=e.attrib
        if t=='path': d=a['d']
        elif t=='circle':
            x,y,r=map(float,(a['cx'],a['cy'],a['r'])); d=f'M {x-r},{y} a {r},{r} 0 1,0 {r*2},0 a {r},{r} 0 1,0 {-r*2},0'
        elif t=='line': d=f'M{a["x1"]},{a["y1"]} L{a["x2"]},{a["y2"]}'
        elif t in ('polyline','polygon'): d='M'+a['points']+(' Z' if t=='polygon' else '')
        elif t=='rect':
            x,y,w,h=map(float,(a.get('x',0),a.get('y',0),a['width'],a['height'])); r=float(a.get('rx',0))
            d=f'M{x+r},{y} H{x+w-r} Q{x+w},{y} {x+w},{y+r} V{y+h-r} Q{x+w},{y+h} {x+w-r},{y+h} H{x+r} Q{x},{y+h} {x},{y+h-r} V{y+r} Q{x},{y} {x+r},{y} Z'
        else: raise ValueError((name,t))
        paths.append(f'    <path android:pathData="{d}" android:fillColor="#00000000" android:strokeColor="#292524" android:strokeWidth="2.4" android:strokeLineCap="round" android:strokeLineJoin="round"/>')
    # Local SVG source is the actual adapted artwork, not an Internet runtime dependency.
    raw=raw.replace('stroke-width="2"','stroke-width="2.4"').replace('stroke="currentColor"','stroke="#292524"')
    (assets/(name+'.svg')).write_text(raw,encoding='utf-8')
    (draw/('trail_'+name.replace('-','_')+'.xml')).write_text('<vector xmlns:android="http://schemas.android.com/apk/res/android" android:width="24dp" android:height="24dp" android:viewportWidth="24" android:viewportHeight="24">\n'+'\n'.join(paths)+'\n</vector>\n',encoding='utf-8')
    return name
with concurrent.futures.ThreadPoolExecutor(max_workers=10) as pool:
    results=list(pool.map(convert,names))
(assets/'SOURCE.json').write_text(json.dumps({'repository':'https://github.com/lucide-icons/lucide','commit':commit,'license':'ISC + MIT (Feather derivatives); see LICENSE.txt','groups':groups},indent=2),encoding='utf-8')
kt=root/'androidApp/src/main/kotlin/com/jonsuapps/rastro/android/ui/screens/TrailIllustrationResources.kt'
kt.write_text('package com.jonsuapps.rastro.android.ui.screens\n\nimport com.jonsuapps.rastro.R\n\ninternal val trailIllustrationResources = mapOf(\n'+',\n'.join(f'    "{n}" to R.drawable.trail_{n.replace("-","_")}' for n in names)+'\n)\n',encoding='utf-8')
print(f'{len(results)} illustrations saved; source pin to {commit}')
