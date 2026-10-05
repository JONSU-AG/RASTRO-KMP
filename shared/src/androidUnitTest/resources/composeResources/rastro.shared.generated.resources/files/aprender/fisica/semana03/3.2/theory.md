## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     Donde \mu_k es el coeficiente de rozamiento cinético.
   - *Relación física fundamental:* \mu_s > \mu_k \implies f_{s,\max} > f_k. Cuesta más iniciar el deslizamiento que mantenerlo.

---

### 2.4. DINÁMICA RECTILÍNEA Y MÉTODOS DE RESOLUCIÓN

1. **Diagrama de Cuerpo Libre (DCL):**
   Aislamiento imaginario de un cuerpo o subsistema del resto del universo, graficando todas las fuerzas externas que actúan directamente sobre él (peso, normales, tensiones, elásticas, fricción).
2. **Método de los Sistemas Compuestos:**
   Para un sistema de varios cuerpos rígidamente conectados que se desplazan con la misma aceleración lineal común a:
   a = \frac{\sum F_{\text{externas a favor de } a} - \sum F_{\text{externas en contra de } a}}{\sum m_{\text{total}}}
   - *Máquina de Atwood:* Dos masas m_1 > m_2 unidas por una cuerda inextensible sobre una polea fija ideal:
     a = g \left( \frac{m_1 - m_2}{m_1 + m_2} \right), \quad T = \frac{2 m_1 m_2}{m_1 + m_2} g
3. **Plano Inclinado con Ángulo \theta:**
   Descomposición del peso en ejes paralelo (\parallel) y perpendicular (\perp) al plano:
   P_\perp = mg \cos\theta \implies N = mg \cos\theta
   P_\parallel = mg \sin\theta
   - Si no hay fricción (\mu = 0): a = g \sin\theta (independiente de la masa del bloque).
   - Si desciende con fricción (\mu_k):
     F_R = mg \sin\theta - f_k = mg \sin\theta - \mu_k (mg \cos\theta) \implies a = g(\sin\theta - \mu_k \cos\theta)
   - *Ángulo de reposo crítico (\theta_c):* Ángulo máximo de inclinación sin deslizar:
     \tan\theta_c = \mu_s

---

### 2.5. DINÁMICA CIRCULAR

Cuando una partícula describe una trayectoria curva de radio de curvatura R, experimenta necesariamente una aceleración normal o centrípeta orientada radialmente hacia el centro de giro. Por la segunda ley de Newton, debe existir una fuerza neta en esa misma dirección:

#### A. La Fuerza Centrípeta (F_c)
**¡La fuerza centrípeta NO es una fuerza física nueva o independiente!** Es simplemente la resultante vectorial de todas las fuerzas reales existentes que apuntan radialmente hacia el centro de curvatura menos aquellas que apuntan hacia afuera:
F_c = \sum F_{\text{hacia el centro}} - \sum F_{\text{hacia afuera}} = m a_c
F_c = m \frac{v_t^2}{R} = m \omega^2 R

#### B. Movimiento Circular en Plano Vertical (Masa atada a una cuerda de longitud L)
1. **En el Punto Más Bajo de la Trayectoria (A):**
   La tensión \vec{T} apunta hacia el centro (arriba) y el peso m\vec{g} hacia afuera (abajo):
   F_c = T_A - mg = m \frac{v_A^2}{L} \implies T_A = mg + m \frac{v_A^2}{L} \quad (\text{Tensión MÁXIMA})
2. **En el Punto Más Alto de la Trayectoria (B):**
   Tanto la tensión \vec{T} como el peso m\vec{g} apuntan hacia el centro (abajo):
   F_c = T_B + mg = m \frac{v_B^2}{L} \implies T_B = m \frac{v_B^2}{L} - mg \quad (\text{Tensión MÍNIMA})
   - *Rapidez Crítica para completar la vuelta vertical (T_B \ge 0):*
     La cuerda apenas permanece tensa en la cúspide cuando T_B = 0:
     mg = m \frac{v_{\text{crítica}}^2}{L} \implies v_{\text{crítica}} = \sqrt{g L}

#### C. Curvas y Peralte de Carreteras
1. **Curva Plana Horizontal con Rozamiento (Peralte \theta = 0^\circ):**
   La única fuerza que proporciona la aceleración centrípeta hacia el centro de la curva es la fuerza de rozamiento estático lateral de los neumáticos:
   f_s = F_c \implies \mu_s N = m \frac{v^2}{R} \implies \mu_s (mg) = m \frac{v^2}{R} \implies v_{\max} = \sqrt{\mu_s g R}
2. **Curva con Ángulo de Peralte \theta sin Rozamiento:**
   La componente horizontal de la normal provee la fuerza centrípeta:
   N \cos\theta = mg \implies N = \frac{mg}{\cos\theta}
   N \sin\theta = F_c = m \frac{v^2}{R}
   Dividiendo ambas ecuaciones:
   \tan\theta = \frac{v^2}{g R} \implies v_{\text{óptima}} = \sqrt{g R \tan\theta}
3. **Péndulo Cónico:**
   Masa m atada a una cuerda de longitud L girando en un círculo horizontal de radio R = L\sin\theta con ángulo constante \theta con la vertical:
   T \cos\theta = mg, \quad T \sin\theta = m \omega^2 R
   \tan\theta = \frac{\omega^2 R}{g} \implies \omega = \sqrt{\frac{g}{L \cos\theta}}, \quad \text{Periodo } T_p = 2\pi \sqrt{\frac{L \cos\theta}{g}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   F_c = m \frac{v^2}{R} = m \omega^2 R
   v_{\text{curva sin peralte}} = \sqrt{\mu_s g R}
   \tan\theta_{\text{peralte}} = \frac{v^2}{g R}
   v_{\text{crítica cúspide vertical}} = \sqrt{g R}

4. **Fórmula de Aceleración en Máquina de Atwood:**
   a = g \left( \frac{m_1 - m_2}{m_1 + m_2} \right)
   T = \frac{2 m_1 m_2}{m_1 + m_2} g

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **La Fuerza Normal NO SIEMPRE es igual al Peso:** Afirmar que N = mg es un error habitual. Si una fuerza tira oblicuamente hacia arriba con ángulo \alpha: N = mg - F\sin\alpha. En un plano inclinado: N = mg\cos\theta. En un ascensor acelerando hacia arriba: N = m(g + a).
* **La Falsa Fuerza Centrífuga en Sistemas Inerciales:** En un marco de referencia inercial (en reposo respecto a tierra), la fuerza centrífuga **NO EXISTE**. Es una fuerza ficticia o inercial que solo aparece si el observador se sitúa dentro del sistema no inercial en rotación.
* **El Rozamiento Estático es Variable:** La fuerza de rozamiento estático **no vale siempre \mu_s N**. Ese es su valor *máximo*. Si empujas una caja de 100\text{ kg} con una fuerza minúscula de 2\text{ N} y no se mueve, la fricción estática vale exactamente 2\text{ N}, no \mu_s N.
* **Pares de Acción y Reacción:** Pregunta clásica: *"¿Son el peso y la normal un par de acción y reacción?"* **¡NO!** El peso es la atracción de la Tierra sobre el cuerpo; su reacción está aplicada en el centro de la Tierra. La normal es el contacto de la mesa sobre el cuerpo; su reacción es la fuerza del cuerpo sobre la mesa. Ambas actúan sobre el mismo cuerpo, por lo que jamás pueden ser un par acción-reacción de Newton.
* **Tensión en una Cuerda que une dos bloques acelerados:** Jamás igualar la tensión al peso de uno de los bloques si el sistema está acelerado. Siempre aplicar la segunda ley de Newton a cada bloque por separado mediante su DCL.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Segunda Ley de Newton:**
   > **"FAMA"**
   \mathbf{F} = \mathbf{m} \cdot \mathbf{a}
   *(La Fuerza Resultante crea la Fama de mover masas).*

2. **Componentes del Peso en el Plano Inclinado:**
   > **"SENO SE DESLIZA, COSENO CONTRA EL PLANO"**
   - Paralelo al plano (el que desliza): P_\parallel = mg \mathbf{\sin}\theta.
   - Perpendicular al plano (el que comprime): P_\perp = mg \mathbf{\cos}\theta.

3. **Condición de Peralte sin Fricción:**
   > **"TANTO VUELO SOBRE GR"**
   \mathbf{\tan\theta} = \frac{v^2}{g R}

4. **Tensión en Circunferencia Vertical:**
   > **"ABAJO PESA MÁS (SUMA), ARRIBA ALIVIA (RESTA)"**
   - Abajo: T = mg + \frac{mv^2}{R}
   - Arriba: T = \frac{mv^2}{R} - mg

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Aeroespacial y Fuerza G:** Durante el despegue de un cohete espacial o maniobras en cazas supersónicos, los astronautas experimentan aceleraciones lineales extremas hacia arriba (a). Por la segunda ley de Newton, la fuerza normal de soporte del asiento sobre el cuerpo del piloto alcanza varias veces su peso natural (N = m(g + a) = n \cdot mg). Esto induce el drenaje de sangre de la cabeza hacia las extremidades inferiores, pudiendo causar pérdida de conciencia por hipoxia cerebral inducida por fuerza G (*G-LOC*).
* **Biomecánica y Aparato Locomotor:** En la marcha humana, el pie ejerce una fuerza muscular oblicua hacia atrás contra el piso; por la tercera ley de Newton, el suelo responde con una fuerza de reacción de igual magnitud dirigida hacia adelante y hacia arriba (fuerza de reacción del suelo, GRF), permitiendo la propulsión cinemática del centro de gravedad corporal.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Fisiológico y Dinámica en Ascensores)
Un estudiante de física de masa m = 60\text{ kg} se coloca sobre una balanza de resorte graduada en newtons dentro de la cabina de un ascensor en un edificio de Yanahuara. Al iniciar el movimiento, la balanza registra una lectura transitoria de 720\text{ N} durante los primeros 3\text{ segundos}, luego marca 600\text{ N} durante los siguientes 10\text{ segundos}, y finalmente registra 450\text{ N} antes de detenerse. Considerando g = 10\text{ m/s}^2, ¿cuál es la descripción cinemática y dinámica correcta del movimiento del ascensor durante la primera y tercera etapa?
A) Etapa 1: Acelera hacia arriba con a = 2\text{ m/s}^2; Etapa 3: Desacelera frenando hacia arriba con a = 2.5\text{ m/s}^2.  
B) Etapa 1: Cae en caída libre; Etapa 3: Sube con velocidad constante.  
C) Etapa 1: Acelera hacia abajo con a = 1.2\text{ m/s}^2; Etapa 3: Acelera hacia arriba.  
D) Etapa 1: Permanece en reposo; Etapa 3: Cae con velocidad terminal.  
E) Etapa 1: Desacelera con a = 5\text{ m/s}^2; Etapa 3: Acelera con a = 2\text{ m/s}^2.  

* **Resolución:**
1. El peso real del estudiante es:
   P = mg = (60\text{ kg})(10\text{ m/s}^2) = 600\text{ N}
   La balanza registra la fuerza normal N que el piso ejerce sobre los pies del estudiante.
2. *Etapa 1 (N = 720\text{ N}):*
   Como N > P \implies La fuerza resultante apunta hacia arriba:
   F_R = N - mg = m \cdot a \implies 720 - 600 = 60 \cdot a \implies 120 = 60a \implies a = 2\text{ m/s}^2 \text{ (hacia arriba)}
   El ascensor sube acelerando con a = 2\text{ m/s}^2.
3. *Etapa 2 (N = 600\text{ N}):*
   N = P \implies a = 0. El ascensor sube con velocidad constante (MRU).
4. *Etapa 3 (N = 450\text{ N}):*
   Como N < P \implies La fuerza resultante apunta hacia abajo (frenado):
   mg - N = m \cdot a \implies 600 - 450 = 60 \cdot a \implies 150 = 60a \implies a = 2.5\text{ m/s}^2 \text{ (hacia abajo)}
   El ascensor sigue subiendo pero desacelera (frena) con a = 2.5\text{ m/s}^2 hasta detenerse.  
* **Respuesta:** A

---

### Pregunta 2 (Caso de Seguridad Vial y Rozamiento en Pavimento)
Un camión de carga pesada transita a 72\text{ km/h} (20\text{ m/s}) por una curva horizontal no peraltada en la variante de Uchumayo. El radio de curvatura de la pista es de R = 80\text{ m}. Si repentinamente cae una lluvia torrencial que reduce el coeficiente de fricción estática entre las llantas y el pavimento húmedo a \mu_s = 0.35, ¿qué ocurrirá con el camión al ingresar a la curva con esa rapidez y cuál es la rapidez máxima segura sin derrapar? (g = 10\text{ m/s}^2).
A) No derrapa; la rapidez máxima segura es de 25\text{ m/s}.  
B) Derrapa saliéndose tangencialmente de la pista porque su rapidez de 20\text{ m/s} supera la rapidez máxima admisible de \approx 16.7\text{ m/s}.  
C) El camión vuelca sobre su eje porque la aceleración centrípeta es nula.  
D) El rozamiento cinético empuja al camión hacia el centro de curvatura.  
E) No derrapa porque el peso del camión cancela la aceleración centrípeta.  

* **Resolución:**
1. En una curva horizontal sin peralte, la única fuerza que suministra la aceleración centrípeta para mantener al vehículo en la trayectoria circular es la fuerza de rozamiento estático máxima transversal de los neumáticos:
   F_c \le f_{s,\max} \implies m \frac{v^2}{R} \le \mu_s N
2. Como N = mg:
   m \frac{v^2}{R} \le \mu_s (mg) \implies v^2 \le \mu_s g R \implies v_{\max} = \sqrt{\mu_s g R}
3. Calculamos la rapidez máxima segura permitida por el asfalto mojado:
   v_{\max} = \sqrt{(0.35)(10\text{ m/s}^2)(80\text{ m})} = \sqrt{280} \approx 16.73\text{ m/s} \quad (60.2\text{ km/h})
4. Como el camión viaja a v = 20\text{ m/s} > 16.73\text{ m/s}, la fuerza centrípeta requerida para curvar la trayectoria excede la fricción máxima disponible en el piso mojado. El vehículo **derrapa lateralmente y pierde el control por inercia**.  
* **Respuesta:** B

---

## Sistema físico, masa y peso

Un sistema físico es la parte del universo que se elige estudiar; lo demás es su entorno. La frontera puede admitir intercambio de energía y materia según el modelo. Elegir el sistema antes de dibujar fuerzas evita incluir fuerzas internas como si fueran externas.

La masa mide inercia y se expresa en kilogramos. El peso es una fuerza gravitatoria y, cerca de la superficie terrestre, se calcula P = mg en newtons. Una persona conserva aproximadamente su masa al cambiar de planeta, pero cambia su peso. La fuerza normal no siempre es igual al peso: depende de otras fuerzas y de la aceleración. En un ascensor acelerado, la balanza refleja una fuerza de apoyo que puede diferir de mg.
