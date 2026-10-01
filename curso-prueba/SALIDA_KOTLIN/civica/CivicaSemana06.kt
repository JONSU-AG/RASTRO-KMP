package civica

object CivicaSemana06 {

    val lessons = listOf(
        LessonNode(
            id = "civ_t06_s01",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Los Derechos Humanos: Concepto, Características y las Cuatro Generaciones",
            theory = LessonTheory(
                content = """# TEMA 06: DERECHOS HUMANOS Y GARANTÍAS CONSTITUCIONALES

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE DERECHOS Y GARANTÍAS

```
                       DERECHOS HUMANOS Y GARANTÍAS CONSTITUCIONALES
                                             │
         ┌───────────────────────────────────┴───────────────────────────────────┐
         ▼                                                                       ▼
  DERECHOS HUMANOS                                                    GARANTÍAS CONSTITUCIONALES
 (Evolución y Atributos)                                                  (Artículo 200° Const.)
         │                                                                       │
 ┌───────┴───────┐                                       ┌───────────────────────┴───────────────────────┐
 ▼               ▼                                       ▼                                               ▼
CARACTERÍSTICAS TRES GENERACIONES (Vasak)          DE TUTELA DE DERECHOS                           DE CONTROL NORMATIVO
• Universales   • 1ra Generación:                   • Hábeas Corpus:                                • Acción de Inconstitu-
• Inalienables    Civiles y Políticos (Libertad)      Libertad individual e                           cionalidad (TC):
• Imprescripti- • 2da Generación:                     integridad física.                              Contra normas con
  bles            Económicos, Sociales y            • Acción de Amparo:                               rango de ley.
• Indivisibles    Culturales (Igualdad)               Demás derechos fundamentales                  • Acción Popular (PJ):
• Inviolables   • 3ra Generación:                     (salud, trabajo, educación).                    Contra normas de
• Progresivos     Pueblos y Solidaridad (Paz)       • Hábeas Data:                                    rango reglamentario.
                • 4ta Generación:                     Información pública y                         • Acción de Cumplimiento:
                  Era digital y ciberderechos         autodeterminación de datos.                     Acatamiento de leyes.
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. Naturaleza y Características de los Derechos Humanos
1. **Concepto**: Facultades, libertades e inmunidades inherentes a todo ser humano por el solo hecho de su dignidad ontológica, indispensables para su desarrollo integral en sociedad.
2. **Hitos Históricos Universales**:
   - Declaración de Derechos de Virginia (1776) y Declaración de los Derechos del Hombre y del Ciudadano (Revolución Francesa, 1789).
   - **Declaración Universal de los Derechos Humanos (DUDH)**: Proclamada por la Asamblea General de las Naciones Unidas en París el **10 de diciembre de 1948**, tras los horrores de la Segunda Guerra Mundial y el Holocausto.
3. **Características Esenciales**:
   - **Universales**: Corresponden a todos los seres humanos sin distinción de etnia, sexo, credo, idioma o condición social.
   - **Inalienables**: No pueden ser vendidos, cedidos, enajenados ni transferidos a terceros.
   - **Imprescriptibles**: No caducan ni se extinguen jamás con el transcurso del tiempo; acompañan a la persona durante toda su vida.
   - **Indivisibles e Interdependientes**: Forman un bloque armónico indisociable; la conculcación de un derecho civil afecta el goce de los derechos sociales y económicos.
   - **Inviolables**: Ningún Estado, ley o particular puede conculcarlos válidamente.
   - **Progresivos / Irrenunciables**: No se puede renunciar a ellos voluntariamente y una vez reconocidos no cabe retroceso alguno en su estándar de protección (*Principio de no regresividad*).



### B. Clasificación de los Derechos Humanos por Generaciones (Teoría de Karel Vasak)
En 1979, el jurista Karel Vasak propuso una célebre clasificación inspirada en el lema de la Revolución Francesa:

#### 1. Primera Generación: Derechos Civiles y Políticos (El Valor Guía: La Libertad)
- **Contexto**: Surgen en los siglos XVII y XVIII con las revoluciones liberales (Independencia de EE. UU. y Revolución Francesa) para frenar el absolutismo monárquico.
- **Titularidad**: Individual.
- **Rol del Estado**: Deber de **abstención o no intervención** (*deber negativo*): el Estado debe abstenerse de vulnerar las libertades de los ciudadanos.
- **Derechos Comprendidos**:
  - *Civiles*: Derecho a la vida, a la integridad física, psíquica y moral, a la libertad personal, a la igualdad ante la ley, a la inviolabilidad del domicilio, a la libertad de pensamiento y de culto, al libre tránsito.
  - *Políticos*: Derecho al sufragio, a elegir y ser elegido, a asociarse en partidos, a la revocatoria de autoridades.

#### 2. Segunda Generación: Derechos Económicos, Sociales y Culturales - DESC (El Valor Guía: La Igualdad)
- **Contexto**: Surgen a fines del siglo XIX y principios del XX tras las luchas del movimiento obrero frente a la explotación de la Revolución Industrial. Consagrados en la Constitución mexicana de Querétaro (1917) y de Weimar (1919).
- **Titularidad**: Colectiva / Social.
- **Rol del Estado**: Deber de **prestación activa y gasto público** (*deber positivo*): el Estado debe intervenir proveyendo servicios públicos y regulando las relaciones laborales para corregir las desigualdades materiales.
- **Derechos Comprendidos**: Derecho al trabajo y remuneración equitativa, jornada laboral de 8 horas, descanso semanal pagado, derecho de huelga y sindicalización, acceso a la salud pública, a la educación gratuita y universal, a la seguridad social y a una vivienda digna.

#### 3. Tercera Generación: Derechos de los Pueblos o de Solidaridad (El Valor Guía: La Fraternidad)
- **Contexto**: Surgen en la segunda mitad del siglo XX tras la Segunda Guerra Mundial, la descolonización afroasiática y la amenaza nuclear y ecológica global.
- **Titularidad**: De pueblos, comunidades y de la humanidad en su conjunto.
- **Rol del Estado**: Cooperación internacional y concertación solidaria entre todos los países.
- **Derechos Comprendidos**: Derecho a la paz mundial, a un medio ambiente sano y ecológicamente equilibrado, al desarrollo socioeconómico sostenible, a la libre autodeterminación de los pueblos y al patrimonio común de la humanidad.

#### 4. Cuarta Generación: Derechos de la Era Digital e Informacional
- **Contexto**: Fines del siglo XX e inicios del siglo XXI con la revolución cibernética y la inteligencia artificial.
- **Derechos Comprendidos**: Acceso universal a internet, libertad digital, protección de la identidad genética y datos biométricos frente a la vigilancia algorítmica, y derecho al olvido digital.



### C. Los Derechos Fundamentales en la Constitución Peruana de 1993
El **Artículo 2°** de la Carta Magna consagra los derechos fundamentales de toda persona, entre los cuales destacan:
- *Inciso 1*: A la vida, a su identidad, a su integridad moral, psíquica y física y a su libre desarrollo y bienestar. **El concebido es sujeto de derecho para todo cuanto le favorece**.
- *Inciso 2*: A la igualdad ante la ley; nadie debe ser discriminado por motivo de origen, raza, sexo, idioma, religión, opinión, condición económica o de cualquiera otra índole.
- *Inciso 4*: A las libertades de información, opinión, expresión y difusión del pensamiento.
- *Inciso 7*: Al honor y a la buena reputación, a la intimidad personal y familiar, así como a la propia voz y a la imagen.
- *Inciso 9*: A la inviolabilidad del domicilio (nadie puede ingresar sin orden judicial o flagrante delito).
- *Inciso 10*: Al secreto y a la inviolabilidad de las comunicaciones y documentos privados.
- *Inciso 12*: A reunirse pacíficamente sin armas.

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia de las Tres Generaciones (Vasak):
> **"1 LIBERTAD (CIVIL), 2 IGUALDAD (SOCIAL), 3 FRATERNIDAD (PUEBLOS)"**
- **1ra**: Siglo XVIII \rightarrow Libertad (Vida, voto, domicilio).
- **2da**: Siglo XX \rightarrow Igualdad (Salud, trabajo, educación).
- **3ra**: Posguerra \rightarrow Fraternidad (Paz, medio ambiente).



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 2: Intermedio / Comprensión de Generaciones
**Enunciado**: Los derechos humanos que tienen como fundamento la justicia social y el principio de igualdad material, exigiendo del Estado una prestación positiva de servicios públicos como la educación gratuita, la salud y la seguridad social, pertenecen a los derechos de:
A) Primera Generación  
B) Segunda Generación  
C) Tercera Generación  
D) Cuarta Generación  
E) Orden supranacional exclusivo  

- **Resolución**: Los derechos de **Segunda Generación** (Económicos, Sociales y Culturales - DESC) nacieron con las luchas obreras para exigir al Estado condiciones materiales de vida digna e igualdad real de oportunidades mediante servicios públicos.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS CÍVICOS
1. **DUDH**: Declaración Universal de los Derechos Humanos, proclamada por la ONU el 10 de diciembre de 1948 en París.
2. **Imprescriptibilidad**: Propiedad de los derechos humanos por la cual su vigencia no caduca ni se extingue jamás por el paso de los años.
3. **Inalienabilidad**: Imposibilidad jurídica de renunciar, vender o despojarse de los derechos inherentes a la condición humana.
4. **Hábeas Corpus**: *"Que tengas tu cuerpo libre"*; garantía procesal de tutela inmediata de la libertad ambulatoria y la integridad física.
5. **Acción de Amparo**: Proceso constitucional que protege todos los derechos fundamentales excepto la libertad física y el hábeas data.
6. **Hábeas Data**: Proceso constitucional que garantiza el acceso a la información pública y la protección de datos personales íntimos.
7. **Acción de Cumplimiento**: Garantía procesal para exigir a una autoridad estatal la ejecución forzosa de una ley o acto administrativo firme.
8. **Acción Popular**: Proceso constitucional de competencia exclusiva del Poder Judicial contra reglamentos y normas infralegales contrarias a la ley.
9. **Acción de Inconstitucionalidad**: Proceso que resuelve el Tribunal Constitucional en única instancia para derogar leyes incompatibles con la Carta Magna.
10. **Autodeterminación Informativa**: Derecho ciudadano a controlar el uso, divulgación y almacenamiento de los propios datos personales en registros informáticos.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuáles son los derechos protegidos por la Acción de Hábeas Corpus?
  - *Reverso*: La libertad individual, la integridad física y los derechos conexos (no tortura, no desaparición forzada, libre tránsito).

- **Flashcard 2**:
  - *Anverso*: ¿Qué órgano resuelve en instancia definitiva la Acción Popular?
  - *Reverso*: El Poder Judicial (Corte Suprema de Justicia); NUNCA va al Tribunal Constitucional.

- **Flashcard 3**:
  - *Anverso*: ¿Qué derechos componen la Primera Generación de los Derechos Humanos?
  - *Reverso*: Los Derechos Civiles y Políticos (inspirados en el valor de la Libertad: vida, propiedad, voto, expresión).

- **Flashcard 4**:
  - *Anverso*: ¿Contra qué normas procede la Acción de Inconstitucionalidad y ante quién se tramita?
  - *Reverso*: Contra normas con rango de ley (leyes, decretos legislativos, ordenanzas); se tramita en única instancia ante el Tribunal Constitucional.

---



### D. Las Seis Garantías Constitucionales (Artículo 200° de la Constitución)
Mecanismos procesales de protección jurisdiccional de urgencia frente a la amenaza o violación de derechos fundamentales o del ordenamiento jurídico:

#### 1. Acción de Hábeas Corpus (Inciso 1)
- **Objeto Tutelado**: La **libertad individual** y los derechos constitucionales conexos a ella (integridad física, no ser víctima de desaparición forzada, no ser detenido arbitrariamente fuera de las 48 horas de flagrancia policial, derecho a no ser torturado, libre tránsito, pase a la frontera).
- **Contra quién procede**: Contra cualquier autoridad, funcionario o persona particular que vulnera o amenaza la libertad física.
- **Trámite Especial**: Se interpone ante cualquier juez penal; puede ser presentado por la propia víctima o por **cualquier persona en su nombre**, a cualquier hora del día o de la noche, de forma verbal, escrita o electrónica, sin necesidad de firma de abogado (*sin formalismos*).

#### 2. Acción de Amparo (Inciso 2)
- **Objeto Tutelado**: Todos los **demás derechos fundamentales consagrados en la Constitución** que NO estén protegidos por el Hábeas Corpus (libertad individual) ni por el Hábeas Data (información pública y datos personales).
- **Ejemplos de Derechos Protegidos**: Derecho al trabajo (despido arbitrario), a la salud, a la educación, a la igualdad y no discriminación, a la propiedad privada, a la libertad de expresión, al debido proceso judicial.
- **Trámite**: Se interpone ante el Juzgado Constitucional o Civil competente; requiere firma de abogado.

#### 3. Acción de Hábeas Data (Inciso 3)
- **Objeto Tutelado**: Protege dos derechos fundamentales específicos consagrados en los incisos 5 y 6 del Artículo 2°:
  1. *Acceso a la Información Pública*: Solicitar y recibir información de cualquier entidad estatal sin expresar causa (salvo secretos de seguridad nacional o reserva tributaria/bancaria).
  2. *Autodeterminación Informativa*: Conocer, actualizar, rectificar o suprimir datos e informaciones personales erróneas almacenadas en bancos de datos públicos o privados (ej. Infocorp, centrales de riesgo, RENIEC).

#### 4. Acción de Cumplimiento (Inciso 6)
- **Objeto Tutelado**: Garantiza la eficacia del ordenamiento legal. Procede contra cualquier autoridad o funcionario renuente a **acatar una norma legal (una ley) o a ejecutar un acto administrativo firme**.
- No tutela directamente un derecho subjetivo lesionado por un particular, sino que obliga a un funcionario público perezoso o negligente a cumplir lo que la ley ya ordena de modo incondicional.

#### 5. Acción Popular (Inciso 5)
- **Objeto Tutelado**: El control difuso y concentrado de la legalidad reglamentaria. Procede por infracción de la Constitución y de la ley, contra los **reglamentos, normas administrativas, decretos supremos y resoluciones de carácter general** de cualquier entidad pública.
- **Órgano Jurisdiccional Exclusivo**: Es la única garantía constitucional que es resuelta **exclusivamente por el Poder Judicial** (Cortes Superiores y Sala de Derecho Constitucional de la Corte Suprema); **NUNCA llega al Tribunal Constitucional**.

#### 6. Acción de Inconstitucionalidad (Inciso 4)
- **Objeto Tutelado**: La supremacía jurídica de la Constitución frente a normas de rango legal. Procede contra las normas que tienen **rango de ley** que contradigan la Constitución en el fondo o en la forma:
  - Leyes ordinarias y orgánicas del Congreso.
  - Decretos Legislativos y Decretos de Urgencia del Ejecutivo.
  - Tratados internacionales que no versen sobre DD.HH.
  - Reglamentos del Congreso.
  - Ordenanzas Regionales y Ordenanzas Municipales.
- **Órgano Jurisdiccional Competente**: Conoce en **instancia única y definitiva el Tribunal Constitucional (TC)**.
- **Legitimidad Activa (¿Quiénes pueden interponerla?)**: Presidente de la República, Fiscal de la Nación, Defensor del Pueblo, 25% del número legal de congresistas, 5000 ciudadanos con firmas válidas, Gobernadores Regionales y Colegios Profesionales en materias de su especialidad.

---



## 4. CUADRO COMPARATIVO: LAS SEIS GARANTÍAS CONSTITUCIONALES DEL PERÚ

| Garantía Constitucional | Derecho / Bien Protegido | Órgano Competente Final | Rasgo Peculiar de Examen |
| :--- | :--- | :--- | :--- |
| **Hábeas Corpus** | Libertad individual e integridad física. | Juez Penal \rightarrow Tribunal Constitucional (apelación).| Sin formalismos; verbal; cualquier persona a cualquier hora. |
| **Acción de Amparo** | Demás derechos fundamentales (salud, trabajo, etc.). | Juez Constitucional \rightarrow Tribunal Constitucional. | Cláusula residual: lo que no protege HC ni HD. |
| **Hábeas Data** | Información pública y rectificación de datos personales.| Juez Constitucional \rightarrow Tribunal Constitucional. | Art. 2° incisos 5 y 6 (entidades públicas y bancos de datos). |
| **Acción de Cumplimiento**| Eficacia de la ley o acto administrativo firme. | Juez Constitucional \rightarrow Tribunal Constitucional. | Obliga a un funcionario renuente a cumplir la ley. |
| **Acción Popular** | Defensa de la jerarquía normativa frente a reglamentos. | **Poder Judicial** (Corte Suprema en definitiva). | **NUNCA va al Tribunal Constitucional**; contra decretos. |
| **Inconstitucionalidad** | Jerarquía constitucional contra normas con rango de ley. | **Tribunal Constitucional** (Instancia única). | Contra leyes, decretos legislativos y ordenanzas. |

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: La garantía constitucional consagrada en el Artículo 200° de la Constitución Política del Perú que procede ante el hecho u omisión que vulnera o amenaza la libertad individual o la integridad física de la persona es el:
A) Recurso de Casación  
B) Proceso de Amparo  
C) Hábeas Corpus  
D) Hábeas Data  
E) Proceso de Cumplimiento  

- **Resolución**: El artículo 200° inciso 1 de la Constitución consagra textualmente la **Acción de Hábeas Corpus** para proteger la libertad individual y los derechos conexos a ella.
- **Clave Correcta**: **C**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Un ciudadano sufre la detención arbitraria de su hermano por parte de efectivos policiales que ingresaron a su vivienda sin orden judicial ni situación de flagrancia delictiva, manteniéndolo incomunicado en una dependencia policial secreta. Al presentarse ante el juzgado para interponer una demanda de Hábeas Corpus en favor de su hermano, el secretario judicial le informa que la demanda es inadmisible porque carece de la firma colegiada de un abogado defensor y porque el juzgado civil competente se encuentra en huelga administrativa. Dicha decisión judicial vulnera el régimen procesal constitucional porque:
A) El Hábeas Corpus solo puede ser presentado personalmente por el Presidente de la República.  
B) La Acción de Hábeas Corpus no requiere formalidad alguna, puede interponerse sin firma de abogado, de forma verbal o por cualquier medio escrito, por la propia persona o por un tercero en su nombre, y los jueces de turno tienen el deber funcional de tramitarlo de inmediato sin dilaciones procesales.  
C) La Policía Nacional goza de inmunidad absoluta para detener personas durante los estados de normalidad constitucional.  
D) La incomunicación de personas detenidas es una atribución discrecional permitida por el Código Penal.  
E) El proceso debe reconducirse obligatoriamente a una Acción Popular ante la Corte Suprema.  

- **Resolución**: De acuerdo con el Código Procesal Constitucional y la doctrina constitucional, el **Hábeas Corpus** es un proceso constitucional de urgencia no sujeto a formalismos: no exige firma de letrado ni tasa judicial, puede interponerse verbalmente o por escrito por cualquier ciudadano en favor de otro, y ningún juez puede suspender su atención argumentando horarios de despacho o huelgas, debiendo constituirse de inmediato en el lugar de detención para verificar la integridad del agraviado.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: El Consejo Municipal de un distrito metropolitano aprueba una **Ordenanza Municipal** que prohíbe la circulación de personas extranjeras por las vías públicas de la jurisdicción a partir de las 20:00 horas, bajo pena de decomiso de sus bienes y expulsión inmediata. Si el Colegio de Abogados de la localidad decide interponer una garantía constitucional para que dicha ordenanza sea expulsada del ordenamiento jurídico por violar derechos fundamentales, la vía procesal constitucional idónea y el órgano ante el cual se tramita son:
A) Acción Popular ante la Sala Constitucional de la Corte Suprema.  
B) Acción de Inconstitucionalidad ante el Tribunal Constitucional.  
C) Acción de Cumplimiento ante el Juzgado de Paz Letrado.  
D) Juicio Político ante la Comisión Permanente del Congreso.  
E) Acción de Amparo ante el Jurado Nacional de Elecciones.  

- **Resolución**: Las Ordenanzas Municipales tienen **rango de ley** según el Artículo 200° inciso 4 de la Constitución. La garantía contra normas con rango de ley contrarias a la Constitución es la **Acción de Inconstitucionalidad**, cuya competencia exclusiva en instancia única corresponde al **Tribunal Constitucional**.
- **Clave Correcta**: **B**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Un ciudadano solicita formalmente a la Municipalidad Provincial de Arequipa una copia del expediente técnico y los presupuestos detallados de una obra vial financiada con fondos públicos. Tras vencerse los plazos legales, la municipalidad se niega arbitrariamente a entregar la documentación alegando que los expedientes son confidenciales. Para tutelar su derecho vulnerado, el ciudadano debe interponer una:
A) Acción de Hábeas Corpus ante la fiscalía de turno  
B) Acción de Hábeas Data ante el juez constitucional  
C) Acción Popular ante la Corte Superior  
D) Demanda de Inconstitucionalidad ante el Tribunal Constitucional  
E) Denuncia penal por delito de traición a la patria  

- **Resolución**: El derecho de acceso a la información pública que obra en poder de entidades estatales (Art. 2° inc. 5 de la Constitución) está tutelado específicamente mediante la **Acción de Hábeas Data** (Art. 200° inc. 3).
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "civ_t06_s01_c01",
                    question = "La Declaración Universal de los Derechos Humanos fue adoptada y proclamada solemnemente por la Asamblea General de la ONU el:",
                    options = listOf(
                        "14 de julio de 1789",
                        "24 de octubre de 1945",
                        "28 de julio de 1993",
                        "10 de diciembre de 1948",
                    ),
                    correctIndex = 3,
                    explanation = "La DUDH fue proclamada en París el 10 de diciembre de 1948, fecha conmemorada anualmente como el Día Internacional de los Derechos Humanos."
                ),
                Challenge(
                    id = "civ_t06_s01_c02",
                    question = "¿Qué característica de los derechos humanos establece que estos no caducan ni se extinguen con el transcurso del tiempo?",
                    options = listOf(
                        "Inalienabilidad",
                        "Imprescriptibilidad",
                        "Indivisibilidad",
                        "Inviolabilidad",
                    ),
                    correctIndex = 1,
                    explanation = "La imprescriptibilidad determina que los derechos humanos permanecen vigentes durante toda la existencia del ser humano sin caducar jamás."
                ),
                Challenge(
                    id = "civ_t06_s01_c03",
                    question = "Los derechos humanos de Primera Generación se caracterizan fundamentalmente por tener como valor guía supremo a:",
                    options = listOf(
                        "La igualdad social de clases",
                        "La libertad individual y política",
                        "El progreso cibernético",
                        "La solidaridad universal",
                    ),
                    correctIndex = 1,
                    explanation = "La Primera Generación (derechos civiles y políticos) nació con las revoluciones liberales teniendo como estandarte la libertad individual."
                ),
                Challenge(
                    id = "civ_t06_s01_c04",
                    question = "El derecho a una remuneración equitativa, a la jornada laboral de ocho horas, a la sindicación y a la educación pública corresponden a la:",
                    options = listOf(
                        "Tercera Generación",
                        "Segunda Generación (DESC)",
                        "Cuarta Generación",
                        "Primera Generación",
                    ),
                    correctIndex = 1,
                    explanation = "Los derechos económicos, sociales y culturales (DESC) pertenecen a la Segunda Generación y demandan prestaciones activas del Estado."
                ),
                Challenge(
                    id = "civ_t06_s01_c05",
                    question = "El derecho a gozar de un medio ambiente sano y ecológicamente equilibrado y el derecho a la paz internacional se clasifican como derechos de:",
                    options = listOf(
                        "Primera Generación",
                        "Segunda Generación",
                        "Cuarta Generación",
                        "Tercera Generación o de Solidaridad",
                    ),
                    correctIndex = 3,
                    explanation = "Pertenecen a la Tercera Generación (derechos de los pueblos o de solidaridad), cuyo valor primordial es la fraternidad universal."
                ),
                Challenge(
                    id = "civ_t06_s01_c06",
                    question = "Frente a los derechos humanos de Primera Generación, ¿cuál es el rol u obligación principal que asume el Estado?",
                    options = listOf(
                        "Deber de abstención o no intromisión en las libertades individuales",
                        "Obligación prestacional de gasto financiero masivo",
                        "Expropiación de medios privados de comunicación",
                        "Supervisión militar de partidos políticos",
                    ),
                    correctIndex = 0,
                    explanation = "En los derechos civiles y políticos el Estado asume una obligación negativa de abstención: no vulnerar ni asediar las libertades del ciudadano."
                ),
                Challenge(
                    id = "civ_t06_s01_c07",
                    question = "El principio según el cual los derechos humanos no pueden ser negociados, transferidos ni vendidos bajo ningún pacto se denomina:",
                    options = listOf(
                        "Progresividad",
                        "Inalienabilidad",
                        "Pluralidad",
                        "Universalidad",
                    ),
                    correctIndex = 1,
                    explanation = "La inalienabilidad implica que ningún individuo puede desprenderse voluntariamente ni transferir sus derechos inherentes a otra persona."
                ),
                Challenge(
                    id = "civ_t06_s01_c08",
                    question = "Según el Artículo 2° inciso 1 de la Constitución del Perú de 1993, el concebido es considerado:",
                    options = listOf(
                        "Ciudadano con plenas facultades electorales",
                        "Persona jurídica patrimonial independiente",
                        "Materia biológica en formación sin protección tutelar",
                        "Sujeto de derecho para todo cuanto le favorece",
                    ),
                    correctIndex = 3,
                    explanation = "La Constitución consagra que el concebido es sujeto de derecho para todo cuanto le favorece desde el instante de la concepción."
                ),
                Challenge(
                    id = "civ_t06_s01_c09",
                    question = "El derecho al acceso universal a las redes informáticas, la protección contra la vigilancia masiva de datos y el derecho al olvido digital pertenecen a la:",
                    options = listOf(
                        "Primera Generación",
                        "Segunda Generación",
                        "Cuarta Generación",
                        "Tercera Generación",
                    ),
                    correctIndex = 2,
                    explanation = "La Cuarta Generación abarca los ciberderechos, la autodeterminación frente a la inteligencia artificial y el entorno digital contemporáneo."
                ),
                Challenge(
                    id = "civ_t06_s01_c10",
                    question = "El principio de no regresividad en materia de derechos fundamentales prescribe formalmente que:",
                    options = listOf(
                        "Una vez alcanzado un nivel de tutela de un derecho humano, el Estado no puede retroceder en su protección",
                        "Las leyes tributarias pueden aplicarse retroactivamente",
                        "Los sentenciados por delitos comunes pueden conmutar sus penas",
                        "Solo los ciudadanos mayores de edad tienen derecho a la integridad",
                    ),
                    correctIndex = 0,
                    explanation = "El principio de progresividad y no regresividad prohíbe retrocesos legislativos que despojen a las personas de derechos ya reconocidos."
                ),
            )
        ),
        LessonNode(
            id = "civ_t06_s02",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Las Seis Garantías Constitucionales: Protección Jurisdiccional de Urgencia",
            theory = LessonTheory(
                content = """# TEMA 06: DERECHOS HUMANOS Y GARANTÍAS CONSTITUCIONALES

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE DERECHOS Y GARANTÍAS

```
                       DERECHOS HUMANOS Y GARANTÍAS CONSTITUCIONALES
                                             │
         ┌───────────────────────────────────┴───────────────────────────────────┐
         ▼                                                                       ▼
  DERECHOS HUMANOS                                                    GARANTÍAS CONSTITUCIONALES
 (Evolución y Atributos)                                                  (Artículo 200° Const.)
         │                                                                       │
 ┌───────┴───────┐                                       ┌───────────────────────┴───────────────────────┐
 ▼               ▼                                       ▼                                               ▼
CARACTERÍSTICAS TRES GENERACIONES (Vasak)          DE TUTELA DE DERECHOS                           DE CONTROL NORMATIVO
• Universales   • 1ra Generación:                   • Hábeas Corpus:                                • Acción de Inconstitu-
• Inalienables    Civiles y Políticos (Libertad)      Libertad individual e                           cionalidad (TC):
• Imprescripti- • 2da Generación:                     integridad física.                              Contra normas con
  bles            Económicos, Sociales y            • Acción de Amparo:                               rango de ley.
• Indivisibles    Culturales (Igualdad)               Demás derechos fundamentales                  • Acción Popular (PJ):
• Inviolables   • 3ra Generación:                     (salud, trabajo, educación).                    Contra normas de
• Progresivos     Pueblos y Solidaridad (Paz)       • Hábeas Data:                                    rango reglamentario.
                • 4ta Generación:                     Información pública y                         • Acción de Cumplimiento:
                  Era digital y ciberderechos         autodeterminación de datos.                     Acatamiento de leyes.
```

---



### D. Las Seis Garantías Constitucionales (Artículo 200° de la Constitución)
Mecanismos procesales de protección jurisdiccional de urgencia frente a la amenaza o violación de derechos fundamentales o del ordenamiento jurídico:

#### 1. Acción de Hábeas Corpus (Inciso 1)
- **Objeto Tutelado**: La **libertad individual** y los derechos constitucionales conexos a ella (integridad física, no ser víctima de desaparición forzada, no ser detenido arbitrariamente fuera de las 48 horas de flagrancia policial, derecho a no ser torturado, libre tránsito, pase a la frontera).
- **Contra quién procede**: Contra cualquier autoridad, funcionario o persona particular que vulnera o amenaza la libertad física.
- **Trámite Especial**: Se interpone ante cualquier juez penal; puede ser presentado por la propia víctima o por **cualquier persona en su nombre**, a cualquier hora del día o de la noche, de forma verbal, escrita o electrónica, sin necesidad de firma de abogado (*sin formalismos*).

#### 2. Acción de Amparo (Inciso 2)
- **Objeto Tutelado**: Todos los **demás derechos fundamentales consagrados en la Constitución** que NO estén protegidos por el Hábeas Corpus (libertad individual) ni por el Hábeas Data (información pública y datos personales).
- **Ejemplos de Derechos Protegidos**: Derecho al trabajo (despido arbitrario), a la salud, a la educación, a la igualdad y no discriminación, a la propiedad privada, a la libertad de expresión, al debido proceso judicial.
- **Trámite**: Se interpone ante el Juzgado Constitucional o Civil competente; requiere firma de abogado.

#### 3. Acción de Hábeas Data (Inciso 3)
- **Objeto Tutelado**: Protege dos derechos fundamentales específicos consagrados en los incisos 5 y 6 del Artículo 2°:
  1. *Acceso a la Información Pública*: Solicitar y recibir información de cualquier entidad estatal sin expresar causa (salvo secretos de seguridad nacional o reserva tributaria/bancaria).
  2. *Autodeterminación Informativa*: Conocer, actualizar, rectificar o suprimir datos e informaciones personales erróneas almacenadas en bancos de datos públicos o privados (ej. Infocorp, centrales de riesgo, RENIEC).

#### 4. Acción de Cumplimiento (Inciso 6)
- **Objeto Tutelado**: Garantiza la eficacia del ordenamiento legal. Procede contra cualquier autoridad o funcionario renuente a **acatar una norma legal (una ley) o a ejecutar un acto administrativo firme**.
- No tutela directamente un derecho subjetivo lesionado por un particular, sino que obliga a un funcionario público perezoso o negligente a cumplir lo que la ley ya ordena de modo incondicional.

#### 5. Acción Popular (Inciso 5)
- **Objeto Tutelado**: El control difuso y concentrado de la legalidad reglamentaria. Procede por infracción de la Constitución y de la ley, contra los **reglamentos, normas administrativas, decretos supremos y resoluciones de carácter general** de cualquier entidad pública.
- **Órgano Jurisdiccional Exclusivo**: Es la única garantía constitucional que es resuelta **exclusivamente por el Poder Judicial** (Cortes Superiores y Sala de Derecho Constitucional de la Corte Suprema); **NUNCA llega al Tribunal Constitucional**.

#### 6. Acción de Inconstitucionalidad (Inciso 4)
- **Objeto Tutelado**: La supremacía jurídica de la Constitución frente a normas de rango legal. Procede contra las normas que tienen **rango de ley** que contradigan la Constitución en el fondo o en la forma:
  - Leyes ordinarias y orgánicas del Congreso.
  - Decretos Legislativos y Decretos de Urgencia del Ejecutivo.
  - Tratados internacionales que no versen sobre DD.HH.
  - Reglamentos del Congreso.
  - Ordenanzas Regionales y Ordenanzas Municipales.
- **Órgano Jurisdiccional Competente**: Conoce en **instancia única y definitiva el Tribunal Constitucional (TC)**.
- **Legitimidad Activa (¿Quiénes pueden interponerla?)**: Presidente de la República, Fiscal de la Nación, Defensor del Pueblo, 25% del número legal de congresistas, 5000 ciudadanos con firmas válidas, Gobernadores Regionales y Colegios Profesionales en materias de su especialidad.

---



## 4. CUADRO COMPARATIVO: LAS SEIS GARANTÍAS CONSTITUCIONALES DEL PERÚ

| Garantía Constitucional | Derecho / Bien Protegido | Órgano Competente Final | Rasgo Peculiar de Examen |
| :--- | :--- | :--- | :--- |
| **Hábeas Corpus** | Libertad individual e integridad física. | Juez Penal \rightarrow Tribunal Constitucional (apelación).| Sin formalismos; verbal; cualquier persona a cualquier hora. |
| **Acción de Amparo** | Demás derechos fundamentales (salud, trabajo, etc.). | Juez Constitucional \rightarrow Tribunal Constitucional. | Cláusula residual: lo que no protege HC ni HD. |
| **Hábeas Data** | Información pública y rectificación de datos personales.| Juez Constitucional \rightarrow Tribunal Constitucional. | Art. 2° incisos 5 y 6 (entidades públicas y bancos de datos). |
| **Acción de Cumplimiento**| Eficacia de la ley o acto administrativo firme. | Juez Constitucional \rightarrow Tribunal Constitucional. | Obliga a un funcionario renuente a cumplir la ley. |
| **Acción Popular** | Defensa de la jerarquía normativa frente a reglamentos. | **Poder Judicial** (Corte Suprema en definitiva). | **NUNCA va al Tribunal Constitucional**; contra decretos. |
| **Inconstitucionalidad** | Jerarquía constitucional contra normas con rango de ley. | **Tribunal Constitucional** (Instancia única). | Contra leyes, decretos legislativos y ordenanzas. |

---



### Nemotecnia de las Garantías que van al TC:
> **"TODAS VAN AL TC EN APELACIÓN, MENOS LA ACCIÓN POPULAR"**
- La **Acción Popular** es patrimonio exclusivo del **Poder Judicial**.
- La **Acción de Inconstitucionalidad** es resuelta por el **TC en única instancia**.
- Las demás (HC, Amparo, HD y Cumplimiento) van al TC si son denegadas en el PJ.

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Hábeas Corpus vs. Amparo**:
   - Si detienen arbitrariamente a alguien en la comisaría \rightarrow **Hábeas Corpus**.
   - Si despiden arbitrariamente a un trabajador o clausuran una escuela \rightarrow **Acción de Amparo**.
2. **Acción Popular vs. Inconstitucionalidad**:
   - Contra una **Ley u Ordenanza Municipal** \rightarrow **Inconstitucionalidad** (va al TC).
   - Contra un **Decreto Supremo o Reglamento Ministerial** \rightarrow **Acción Popular** (va al Poder Judicial).
3. **Formalidades del Hábeas Corpus**:
   - No necesita firma de abogado ni sellos; se puede redactar en un papel simple o hacerse verbalmente ante el juez penal de turno. Si una opción dice *"requiere autorización de un notario público"*, es **falsa**.

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: La garantía constitucional consagrada en el Artículo 200° de la Constitución Política del Perú que procede ante el hecho u omisión que vulnera o amenaza la libertad individual o la integridad física de la persona es el:
A) Recurso de Casación  
B) Proceso de Amparo  
C) Hábeas Corpus  
D) Hábeas Data  
E) Proceso de Cumplimiento  

- **Resolución**: El artículo 200° inciso 1 de la Constitución consagra textualmente la **Acción de Hábeas Corpus** para proteger la libertad individual y los derechos conexos a ella.
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Un ciudadano solicita formalmente a la Municipalidad Provincial de Arequipa una copia del expediente técnico y los presupuestos detallados de una obra vial financiada con fondos públicos. Tras vencerse los plazos legales, la municipalidad se niega arbitrariamente a entregar la documentación alegando que los expedientes son confidenciales. Para tutelar su derecho vulnerado, el ciudadano debe interponer una:
A) Acción de Hábeas Corpus ante la fiscalía de turno  
B) Acción de Hábeas Data ante el juez constitucional  
C) Acción Popular ante la Corte Superior  
D) Demanda de Inconstitucionalidad ante el Tribunal Constitucional  
E) Denuncia penal por delito de traición a la patria  

- **Resolución**: El derecho de acceso a la información pública que obra en poder de entidades estatales (Art. 2° inc. 5 de la Constitución) está tutelado específicamente mediante la **Acción de Hábeas Data** (Art. 200° inc. 3).
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: El Consejo Municipal de un distrito metropolitano aprueba una **Ordenanza Municipal** que prohíbe la circulación de personas extranjeras por las vías públicas de la jurisdicción a partir de las 20:00 horas, bajo pena de decomiso de sus bienes y expulsión inmediata. Si el Colegio de Abogados de la localidad decide interponer una garantía constitucional para que dicha ordenanza sea expulsada del ordenamiento jurídico por violar derechos fundamentales, la vía procesal constitucional idónea y el órgano ante el cual se tramita son:
A) Acción Popular ante la Sala Constitucional de la Corte Suprema.  
B) Acción de Inconstitucionalidad ante el Tribunal Constitucional.  
C) Acción de Cumplimiento ante el Juzgado de Paz Letrado.  
D) Juicio Político ante la Comisión Permanente del Congreso.  
E) Acción de Amparo ante el Jurado Nacional de Elecciones.  

- **Resolución**: Las Ordenanzas Municipales tienen **rango de ley** según el Artículo 200° inciso 4 de la Constitución. La garantía contra normas con rango de ley contrarias a la Constitución es la **Acción de Inconstitucionalidad**, cuya competencia exclusiva en instancia única corresponde al **Tribunal Constitucional**.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Un ciudadano sufre la detención arbitraria de su hermano por parte de efectivos policiales que ingresaron a su vivienda sin orden judicial ni situación de flagrancia delictiva, manteniéndolo incomunicado en una dependencia policial secreta. Al presentarse ante el juzgado para interponer una demanda de Hábeas Corpus en favor de su hermano, el secretario judicial le informa que la demanda es inadmisible porque carece de la firma colegiada de un abogado defensor y porque el juzgado civil competente se encuentra en huelga administrativa. Dicha decisión judicial vulnera el régimen procesal constitucional porque:
A) El Hábeas Corpus solo puede ser presentado personalmente por el Presidente de la República.  
B) La Acción de Hábeas Corpus no requiere formalidad alguna, puede interponerse sin firma de abogado, de forma verbal o por cualquier medio escrito, por la propia persona o por un tercero en su nombre, y los jueces de turno tienen el deber funcional de tramitarlo de inmediato sin dilaciones procesales.  
C) La Policía Nacional goza de inmunidad absoluta para detener personas durante los estados de normalidad constitucional.  
D) La incomunicación de personas detenidas es una atribución discrecional permitida por el Código Penal.  
E) El proceso debe reconducirse obligatoriamente a una Acción Popular ante la Corte Suprema.  

- **Resolución**: De acuerdo con el Código Procesal Constitucional y la doctrina constitucional, el **Hábeas Corpus** es un proceso constitucional de urgencia no sujeto a formalismos: no exige firma de letrado ni tasa judicial, puede interponerse verbalmente o por escrito por cualquier ciudadano en favor de otro, y ningún juez puede suspender su atención argumentando horarios de despacho o huelgas, debiendo constituirse de inmediato en el lugar de detención para verificar la integridad del agraviado.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS CÍVICOS
1. **DUDH**: Declaración Universal de los Derechos Humanos, proclamada por la ONU el 10 de diciembre de 1948 en París.
2. **Imprescriptibilidad**: Propiedad de los derechos humanos por la cual su vigencia no caduca ni se extingue jamás por el paso de los años.
3. **Inalienabilidad**: Imposibilidad jurídica de renunciar, vender o despojarse de los derechos inherentes a la condición humana.
4. **Hábeas Corpus**: *"Que tengas tu cuerpo libre"*; garantía procesal de tutela inmediata de la libertad ambulatoria y la integridad física.
5. **Acción de Amparo**: Proceso constitucional que protege todos los derechos fundamentales excepto la libertad física y el hábeas data.
6. **Hábeas Data**: Proceso constitucional que garantiza el acceso a la información pública y la protección de datos personales íntimos.
7. **Acción de Cumplimiento**: Garantía procesal para exigir a una autoridad estatal la ejecución forzosa de una ley o acto administrativo firme.
8. **Acción Popular**: Proceso constitucional de competencia exclusiva del Poder Judicial contra reglamentos y normas infralegales contrarias a la ley.
9. **Acción de Inconstitucionalidad**: Proceso que resuelve el Tribunal Constitucional en única instancia para derogar leyes incompatibles con la Carta Magna.
10. **Autodeterminación Informativa**: Derecho ciudadano a controlar el uso, divulgación y almacenamiento de los propios datos personales en registros informáticos.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuáles son los derechos protegidos por la Acción de Hábeas Corpus?
  - *Reverso*: La libertad individual, la integridad física y los derechos conexos (no tortura, no desaparición forzada, libre tránsito).

- **Flashcard 2**:
  - *Anverso*: ¿Qué órgano resuelve en instancia definitiva la Acción Popular?
  - *Reverso*: El Poder Judicial (Corte Suprema de Justicia); NUNCA va al Tribunal Constitucional.

- **Flashcard 3**:
  - *Anverso*: ¿Qué derechos componen la Primera Generación de los Derechos Humanos?
  - *Reverso*: Los Derechos Civiles y Políticos (inspirados en el valor de la Libertad: vida, propiedad, voto, expresión).

- **Flashcard 4**:
  - *Anverso*: ¿Contra qué normas procede la Acción de Inconstitucionalidad y ante quién se tramita?
  - *Reverso*: Contra normas con rango de ley (leyes, decretos legislativos, ordenanzas); se tramita en única instancia ante el Tribunal Constitucional.

---



### A. Naturaleza y Características de los Derechos Humanos
1. **Concepto**: Facultades, libertades e inmunidades inherentes a todo ser humano por el solo hecho de su dignidad ontológica, indispensables para su desarrollo integral en sociedad.
2. **Hitos Históricos Universales**:
   - Declaración de Derechos de Virginia (1776) y Declaración de los Derechos del Hombre y del Ciudadano (Revolución Francesa, 1789).
   - **Declaración Universal de los Derechos Humanos (DUDH)**: Proclamada por la Asamblea General de las Naciones Unidas en París el **10 de diciembre de 1948**, tras los horrores de la Segunda Guerra Mundial y el Holocausto.
3. **Características Esenciales**:
   - **Universales**: Corresponden a todos los seres humanos sin distinción de etnia, sexo, credo, idioma o condición social.
   - **Inalienables**: No pueden ser vendidos, cedidos, enajenados ni transferidos a terceros.
   - **Imprescriptibles**: No caducan ni se extinguen jamás con el transcurso del tiempo; acompañan a la persona durante toda su vida.
   - **Indivisibles e Interdependientes**: Forman un bloque armónico indisociable; la conculcación de un derecho civil afecta el goce de los derechos sociales y económicos.
   - **Inviolables**: Ningún Estado, ley o particular puede conculcarlos válidamente.
   - **Progresivos / Irrenunciables**: No se puede renunciar a ellos voluntariamente y una vez reconocidos no cabe retroceso alguno en su estándar de protección (*Principio de no regresividad*).



### B. Clasificación de los Derechos Humanos por Generaciones (Teoría de Karel Vasak)
En 1979, el jurista Karel Vasak propuso una célebre clasificación inspirada en el lema de la Revolución Francesa:

#### 1. Primera Generación: Derechos Civiles y Políticos (El Valor Guía: La Libertad)
- **Contexto**: Surgen en los siglos XVII y XVIII con las revoluciones liberales (Independencia de EE. UU. y Revolución Francesa) para frenar el absolutismo monárquico.
- **Titularidad**: Individual.
- **Rol del Estado**: Deber de **abstención o no intervención** (*deber negativo*): el Estado debe abstenerse de vulnerar las libertades de los ciudadanos.
- **Derechos Comprendidos**:
  - *Civiles*: Derecho a la vida, a la integridad física, psíquica y moral, a la libertad personal, a la igualdad ante la ley, a la inviolabilidad del domicilio, a la libertad de pensamiento y de culto, al libre tránsito.
  - *Políticos*: Derecho al sufragio, a elegir y ser elegido, a asociarse en partidos, a la revocatoria de autoridades.

#### 2. Segunda Generación: Derechos Económicos, Sociales y Culturales - DESC (El Valor Guía: La Igualdad)
- **Contexto**: Surgen a fines del siglo XIX y principios del XX tras las luchas del movimiento obrero frente a la explotación de la Revolución Industrial. Consagrados en la Constitución mexicana de Querétaro (1917) y de Weimar (1919).
- **Titularidad**: Colectiva / Social.
- **Rol del Estado**: Deber de **prestación activa y gasto público** (*deber positivo*): el Estado debe intervenir proveyendo servicios públicos y regulando las relaciones laborales para corregir las desigualdades materiales.
- **Derechos Comprendidos**: Derecho al trabajo y remuneración equitativa, jornada laboral de 8 horas, descanso semanal pagado, derecho de huelga y sindicalización, acceso a la salud pública, a la educación gratuita y universal, a la seguridad social y a una vivienda digna.

#### 3. Tercera Generación: Derechos de los Pueblos o de Solidaridad (El Valor Guía: La Fraternidad)
- **Contexto**: Surgen en la segunda mitad del siglo XX tras la Segunda Guerra Mundial, la descolonización afroasiática y la amenaza nuclear y ecológica global.
- **Titularidad**: De pueblos, comunidades y de la humanidad en su conjunto.
- **Rol del Estado**: Cooperación internacional y concertación solidaria entre todos los países.
- **Derechos Comprendidos**: Derecho a la paz mundial, a un medio ambiente sano y ecológicamente equilibrado, al desarrollo socioeconómico sostenible, a la libre autodeterminación de los pueblos y al patrimonio común de la humanidad.

#### 4. Cuarta Generación: Derechos de la Era Digital e Informacional
- **Contexto**: Fines del siglo XX e inicios del siglo XXI con la revolución cibernética y la inteligencia artificial.
- **Derechos Comprendidos**: Acceso universal a internet, libertad digital, protección de la identidad genética y datos biométricos frente a la vigilancia algorítmica, y derecho al olvido digital.



### C. Los Derechos Fundamentales en la Constitución Peruana de 1993
El **Artículo 2°** de la Carta Magna consagra los derechos fundamentales de toda persona, entre los cuales destacan:
- *Inciso 1*: A la vida, a su identidad, a su integridad moral, psíquica y física y a su libre desarrollo y bienestar. **El concebido es sujeto de derecho para todo cuanto le favorece**.
- *Inciso 2*: A la igualdad ante la ley; nadie debe ser discriminado por motivo de origen, raza, sexo, idioma, religión, opinión, condición económica o de cualquiera otra índole.
- *Inciso 4*: A las libertades de información, opinión, expresión y difusión del pensamiento.
- *Inciso 7*: Al honor y a la buena reputación, a la intimidad personal y familiar, así como a la propia voz y a la imagen.
- *Inciso 9*: A la inviolabilidad del domicilio (nadie puede ingresar sin orden judicial o flagrante delito).
- *Inciso 10*: Al secreto y a la inviolabilidad de las comunicaciones y documentos privados.
- *Inciso 12*: A reunirse pacíficamente sin armas.

---



### Nivel 2: Intermedio / Comprensión de Generaciones
**Enunciado**: Los derechos humanos que tienen como fundamento la justicia social y el principio de igualdad material, exigiendo del Estado una prestación positiva de servicios públicos como la educación gratuita, la salud y la seguridad social, pertenecen a los derechos de:
A) Primera Generación  
B) Segunda Generación  
C) Tercera Generación  
D) Cuarta Generación  
E) Orden supranacional exclusivo  

- **Resolución**: Los derechos de **Segunda Generación** (Económicos, Sociales y Culturales - DESC) nacieron con las luchas obreras para exigir al Estado condiciones materiales de vida digna e igualdad real de oportunidades mediante servicios públicos.
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "civ_t06_s02_c01",
                    question = "La garantía constitucional que procede ante la vulneración o amenaza de la libertad individual y la integridad física se denomina:",
                    options = listOf(
                        "Acción de Cumplimiento",
                        "Acción de Amparo",
                        "Acción de Hábeas Data",
                        "Acción de Hábeas Corpus",
                    ),
                    correctIndex = 3,
                    explanation = "El Hábeas Corpus (Art. 200° inc. 1) tutela la libertad individual y los derechos conexos como la integridad física."
                ),
                Challenge(
                    id = "civ_t06_s02_c02",
                    question = "¿Cuál de las siguientes garantías constitucionales se tramita sin formalismos, a cualquier hora y no requiere firma de abogado?",
                    options = listOf(
                        "Acción de Inconstitucionalidad",
                        "Acción Popular",
                        "Acción de Cumplimiento",
                        "Acción de Hábeas Corpus",
                    ),
                    correctIndex = 3,
                    explanation = "El Hábeas Corpus es de naturaleza antiformalista: puede interponerse verbalmente por cualquier persona a cualquier hora."
                ),
                Challenge(
                    id = "civ_t06_s02_c03",
                    question = "Si una persona es despedida arbitrariamente de su centro de trabajo vulnerando su derecho al trabajo y debido proceso, la garantía constitucional idónea es:",
                    options = listOf(
                        "Acción de Hábeas Data",
                        "Acción de Inconstitucionalidad",
                        "Acción de Amparo",
                        "Acción Popular",
                    ),
                    correctIndex = 2,
                    explanation = "La Acción de Amparo protege los derechos fundamentales distintos a la libertad física, como el derecho al trabajo y debido proceso."
                ),
                Challenge(
                    id = "civ_t06_s02_c04",
                    question = "La garantía constitucional que faculta al ciudadano a solicitar información a entidades públicas o rectificar datos falsos en centrales de riesgo es:",
                    options = listOf(
                        "Acción de Amparo",
                        "Acción de Cumplimiento",
                        "Acción de Hábeas Data",
                        "Acción Popular",
                    ),
                    correctIndex = 2,
                    explanation = "El Hábeas Data tutela el acceso a la información pública y la autodeterminación informativa (rectificación de bancos de datos)."
                ),
                Challenge(
                    id = "civ_t06_s02_c05",
                    question = "¿Qué garantía constitucional procede contra un funcionario público que se niega renuentemente a acatar una ley o un acto administrativo firme?",
                    options = listOf(
                        "Acción de Hábeas Corpus",
                        "Acción de Cumplimiento",
                        "Acción Popular",
                        "Acción de Amparo",
                    ),
                    correctIndex = 1,
                    explanation = "La Acción de Cumplimiento (Art. 200° inc. 6) obliga a autoridades o funcionarios renuentes a cumplir lo ordenado por una ley o acto firme."
                ),
                Challenge(
                    id = "civ_t06_s02_c06",
                    question = "La Acción Popular se caracteriza por ser la única garantía constitucional cuya resolución definitiva compete con exclusividad a:",
                    options = listOf(
                        "El Poder Judicial (Corte Suprema de Justicia)",
                        "La Defensoría del Pueblo",
                        "La Junta Nacional de Justicia",
                        "El Tribunal Constitucional",
                    ),
                    correctIndex = 0,
                    explanation = "La Acción Popular es resuelta con exclusividad por el Poder Judicial y jamás llega al Tribunal Constitucional."
                ),
                Challenge(
                    id = "civ_t06_s02_c07",
                    question = "La Acción de Inconstitucionalidad procede formalmente contra las normas que ostentan:",
                    options = listOf(
                        "Rango infralegal y resoluciones administrativas",
                        "Carácter de contratos de derecho privado",
                        "Rango de ley (leyes, decretos legislativos, ordenanzas) que contravengan la Constitución",
                        "Sentencias firmes dictadas por juzgados de paz",
                    ),
                    correctIndex = 2,
                    explanation = "La Acción de Inconstitucionalidad procede exclusivamente contra normas con rango de ley contrarias a la Constitución."
                ),
                Challenge(
                    id = "civ_t06_s02_c08",
                    question = "¿Cuál es el órgano estatal competente para resolver en única instancia la demanda de Acción de Inconstitucionalidad?",
                    options = listOf(
                        "El Congreso de la República",
                        "El Jurado Nacional de Elecciones",
                        "El Tribunal Constitucional",
                        "La Sala Plena de la Corte Suprema",
                    ),
                    correctIndex = 2,
                    explanation = "El Tribunal Constitucional conoce en instancia única e inapelable la demanda de Acción de Inconstitucionalidad."
                ),
                Challenge(
                    id = "civ_t06_s02_c09",
                    question = "Si un ministerio aprueba un decreto supremo que viola flagrantemente una ley del Congreso y la Constitución, la garantía aplicable para expulsar ese reglamento es:",
                    options = listOf(
                        "Acción Popular",
                        "Acción de Inconstitucionalidad",
                        "Acción de Hábeas Corpus",
                        "Acción de Cumplimiento",
                    ),
                    correctIndex = 0,
                    explanation = "La Acción Popular se interpone contra reglamentos, decretos supremos y normas administrativas de alcance general contrarias a la ley."
                ),
                Challenge(
                    id = "civ_t06_s02_c10",
                    question = "En los procesos de Hábeas Corpus, Amparo y Hábeas Data, si una demanda es denegada en segunda instancia judicial, el demandante puede recurrir en última instancia ante:",
                    options = listOf(
                        "El Tribunal Constitucional mediante Recurso de Agravio Constitucional",
                        "La Corte Penal Internacional",
                        "La Defensoría del Pueblo",
                        "La Junta de Fiscales Supremos",
                    ),
                    correctIndex = 0,
                    explanation = "El Tribunal Constitucional conoce en última y definitiva instancia las resoluciones denegatorias de Hábeas Corpus, Amparo y Hábeas Data."
                ),
            )
        )
    )
}
