## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 2.3. ENERGÍA MECÁNICA Y SUS FORMAS

La energía mecánica es una magnitud escalar asociada al movimiento relativo y a la configuración espacial de un sistema:

#### A. Energía Cinética Traslacional (E_c)
Energía asociada al movimiento de una masa m que se desplaza a una rapidez v:
E_c = \frac{1}{2} m v^2 = \frac{p^2}{2m}
- Siempre es una magnitud no negativa: E_c \ge 0.
- Depende del sistema de referencia inercial elegido (a través de la velocidad).

#### B. Energía Potencial Gravitatoria (E_{pg})
Energía de configuración debida a la atracción gravitatoria mutua entre la Tierra y una masa m situada a una altura h respecto a un **Nivel de Referencia (N.R.)** horizontal arbitrario:
E_{pg} = m \cdot g \cdot h
- Puede ser positiva (si el cuerpo está por encima del N.R.), nula (en el N.R.) o negativa (si se sitúa por debajo del N.R.).

#### C. Energía Potencial Elástica (E_{pe})
Energía interna almacenada en los enlaces interatómicos de un resorte o cuerpo deformable ideal de rigidez k sometido a una deformación (alargamiento o acortamiento) x:
E_{pe} = \frac{1}{2} k x^2
- Siempre es no negativa (E_{pe} \ge 0), independientemente de si el resorte está estirado (x > 0) o comprimido (x < 0).

#### D. Energía Mecánica Total (E_m)
Suma de la energía cinética y las energías potenciales presentes en el sistema:
E_m = E_c + E_p = \frac{1}{2} m v^2 + m g h + \frac{1}{2} k x^2

---

### 2.4. TEOREMAS DE TRABAJO Y ENERGÍA

#### A. Teorema del Trabajo y la Energía Cinética
*"El trabajo neto realizado por todas las fuerzas externas que actúan sobre una partícula es igual al cambio en su energía cinética entre las posiciones inicial y final."*
W_{\text{neto}} = \Delta E_c = E_{cf} - E_{c0} = \frac{1}{2} m v_f^2 - \frac{1}{2} m v_0^2
- Es un teorema universal: **es válido siempre**, tanto para fuerzas conservativas como no conservativas, trayectorias rectilíneas o curvilíneas.

#### B. Fuerzas Conservativas vs. Fuerzas No Conservativas (Disipativas)
1. **Fuerzas Conservativas:**
   - Aquellas en las que el trabajo realizado entre dos puntos depende **únicamente de la posición inicial y final, y es independiente de la trayectoria recorrida**.
   - El trabajo realizado a lo largo de cualquier trayectoria cerrada (ciclo cerrado) es rigurosamente nulo:
     \oint \vec{F}_{\text{cons}} \cdot d\vec{r} = 0
   - Se relacionan con una función de energía potencial mediante: W_{\text{cons}} = -\Delta E_p.
   - *Ejemplos:* Peso (gravedad), fuerza elástica de resortes, fuerza electrostática de Coulomb.
2. **Fuerzas No Conservativas (Disipativas):**
   - Aquellas en las que el trabajo depende de la trayectoria y longitud recorrida; disipan energía mecánica en forma de energía térmica (calor) no recuperable.
   - *Ejemplos:* Fuerza de rozamiento cinético (f_k), resistencia aerodinámica de fluidos, viscosidad, fuerzas aplicadas por motores.

#### C. Principio de Conservación de la Energía Mecánica
Si sobre un sistema actúan **únicamente fuerzas conservativas** (o las fuerzas no conservativas presentes no realizan trabajo mecánico, como la fuerza normal que es perpendicular al movimiento):
W_{\text{neto}} = W_{\text{cons}} \implies \Delta E_c = -\Delta E_p \implies \Delta E_c + \Delta E_p = 0
\Delta E_m = 0 \implies \mathbf{E_{m,\text{inicial}} = E_{m,\text{final}}}
E_{c1} + E_{pg1} + E_{pe1} = E_{c2} + E_{pg2} + E_{pe2}

#### D. Teorema General de la Energía con Fuerzas No Conservativas
Si en el sistema actúan fuerzas disipativas (como la fricción con el piso o el aire):
W_{\text{neto}} = W_{\text{cons}} + W_{FNC}
\Delta E_c = -\Delta E_p + W_{FNC} \implies \mathbf{W_{FNC} = \Delta E_m = E_{mf} - E_{m0}}
Como habitualmente el trabajo de las fuerzas disipativas es negativo (W_{FNC} < 0):
E_{mf} = E_{m0} - |W_{\text{fricción}}|
La diferencia de energía mecánica se transforma íntegramente en calor disipado (Q = |W_{f_k}|).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
3. **Energías Mecánicas:**
   E_c = \frac{1}{2} m v^2 = \frac{p^2}{2m}
   E_{pg} = mgh
   E_{pe} = \frac{1}{2} k x^2

4. **Teoremas Clave de Conservación:**
   W_{\text{neto}} = \Delta E_c
   E_{m1} = E_{m2} \quad (\text{Sin fricción})
   W_{FNC} = \Delta E_m = E_{m2} - E_{m1}
   W_{f_k} = -f_k \cdot d

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Trabajo de la Fuerza Normal:** En la inmensa mayoría de problemas preuniversitarios, la fuerza normal es perpendicular al desplazamiento instantáneo de la superficie, por lo que **su trabajo mecánico es CERO (W_N = 0)**. ¡Cuidado! La normal solo realiza trabajo si la superficie de apoyo se desplaza aceleradamente (como en un ascensor o cuña móvil).
* **Nivel de Referencia (N.R.) en Energía Potencial:** La energía potencial gravitatoria no tiene un valor absoluto único; depende de dónde coloques el Nivel de Referencia horizontal (h = 0). Una vez fijado el N.R. al inicio del problema, **debes mantenerlo constante para todos los puntos del análisis**.
* **El Trabajo del Rozamiento no es Función de Estado:** El trabajo de la fricción cinética depende de la longitud total recorrida de la trayectoria, no del vector desplazamiento: W_{f_k} = -f_k \cdot d_{\text{trayectoria}}.
* **Potencia y Velocidad en Subidas:** Para subir un vehículo a velocidad constante por una pendiente inclinada, la fuerza motriz del motor debe equilibrar al componente del peso paralelo a la pendiente más la fricción: F_{\text{motor}} = mg\sin\theta + f_k \implies P = (mg\sin\theta + f_k)v.
* **El Teorema de las Fuerzas Vivas no Requiere Masa en Caída Libre:** Al aplicar W_{\text{neto}} = \Delta E_c a un objeto que cae en el vacío: mgh = \frac{1}{2}mv_f^2 \implies v_f = \sqrt{2gh}, independiente de la masa.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Signo del Trabajo según el Ángulo:**
   > **"AGUDO AYUDA (+), RECTO NO HACE NADA (0), OBTUSO SE OPONE (-)"**
   - \theta < 90^\circ: Trabajo Positivo (Motor).
   - \theta = 90^\circ: Trabajo Nulo (W = 0).
   - \theta > 90^\circ: Trabajo Negativo (Resistente).

2. **Teorema de Fuerzas Vivas:**
   > **"NETO ES CINÉTICO"**
   W_{\text{neto}} = \Delta E_c
   *(El trabajo neto de TODAS las fuerzas solo cambia la energía cinética).*

3. **Fuerzas No Conservativas:**
   > **"LA FRICCIÓN SE ROBA LA MECÁNICA"**
   W_{FNC} = E_{m,\text{final}} - E_{m,\text{inicial}}

4. **Potencia con Velocidad:**
   > **"PAVO"**
   \mathbf{P} = \mathbf{F} \cdot \mathbf{v}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Hidroeléctrica (Central de Charcani V en Arequipa):** La generación de energía eléctrica en presas y centrales hidroeléctricas aprovecha la transformación de energía potencial gravitatoria del agua embalsada (mgh) en energía cinética de chorros a alta presión que mueven turbinas Pelton. La potencia hidráulica generada se modela directamente como P = \eta \cdot \rho Q g h, donde \eta es la eficiencia combinada de la turbina y el generador sincrónico.
* **Fisiología del Esfuerzo y Ergometría Médica:** En pruebas de esfuerzo cardíaco (ergometría en cinta rodante o cicloergómetro), se mide la potencia mecánica disipada por el cuerpo humano en watts (P = \vec{F} \cdot \vec{v}). La relación entre la potencia mecánica externa y la tasa metabólica basal (consumo de oxígeno, \text{VO}_2\max) refleja la eficiencia muscular del organismo, que oscila típicamente entre el 18\% y el 25\%.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Energético: Montaña Rusa y Fuerza de Apoyo)
En un parque de atracciones se diseña una montaña rusa de rieles lisos (sin fricción). Un carrito de masa m = 200\text{ kg} parte del reposo desde una plataforma elevada en el punto A situado a una altura H sobre el suelo y desciende por una pendiente para ingresar a un rizo vertical (*looping*) circular de radio R = 8\text{ metros}. Si los diseñadores requieren que en el punto más alto del rizo (punto C, a una altura de 2R = 16\text{ m} sobre el suelo) la fuerza normal que los rieles ejercen sobre las ruedas del carrito sea igual al propio peso del carrito (N_C = mg) para garantizar la seguridad de los pasajeros sin descarrilamiento, ¿desde qué altura mínima H debe soltarse el carrito en el punto A? (Considere g = 10\text{ m/s}^2).
A) 16\text{ m}  
B) 20\text{ m}  
C) 24\text{ m}  
D) 28\text{ m}  
E) 32\text{ m}  

* **Resolución:**
1. *Dinámica circular en la cúspide del rizo (punto C):*
   En el punto más alto, tanto la fuerza normal \vec{N}_C como el peso m\vec{g} apuntan verticalmente hacia el centro del rizo (hacia abajo), suministrando la fuerza centrípeta:
   F_c = N_C + mg = m \frac{v_C^2}{R}
   El enunciado establece como condición de diseño que N_C = mg:
   mg + mg = m \frac{v_C^2}{R} \implies 2mg = m \frac{v_C^2}{R} \implies v_C^2 = 2gR
2. *Conservación de la energía mecánica entre el punto inicial A y la cúspide C:*
   Dado que los rieles son lisos y la normal no realiza trabajo mecánico, la energía mecánica se conserva:
   E_{mA} = E_{mC}
   Tomando como Nivel de Referencia el suelo horizontal:
   - En el punto A (reposo, v_A = 0):
     E_{mA} = mgH
   - En el punto C (altura 2R y velocidad v_C):
     E_{mC} = \frac{1}{2} m v_C^2 + mg(2R) = \frac{1}{2} m (2gR) + 2mgR = mgR + 2mgR = 3mgR
3. Igualamos ambas energías mecánicas:
   mgH = 3mgR \implies H = 3R
4. Reemplazamos el valor del radio del rizo (R = 8\text{ m}):
   H = 3(8\text{ m}) = 24\text{ metros}
- El carrito debe soltarse desde una altura mínima de **24\text{ metros}**.  
* **Respuesta:** C

---

### Pregunta 2 (Caso de Seguridad Industrial: Frenado de Emergencia en Minas)
En un pique inclinado de una mina subterránea en Caylloma que desciende con un ángulo de 37^\circ respecto a la horizontal, un carro minero de masa m = 500\text{ kg} se suelta accidentalmente por la rotura de un cable. El carro desliza libremente por la pendiente lisa a lo largo de d_1 = 20\text{ metros} y luego ingresa a una rampa horizontal de arena de seguridad de longitud L dotada de un coeficiente de fricción cinética \mu_k = 0.60 diseñada para frenar carritos desbocados. Determine la longitud horizontal mínima L que debe tener la rampa de arena para detener por completo al carro minero. (\sin 37^\circ = 0.6, \cos 37^\circ = 0.8, g = 10\text{ m/s}^2).
A) 10\text{ m}  
B) 15\text{ m}  
C) 20\text{ m}  
D) 25\text{ m}  
E) 30\text{ m}  

* **Resolución:**
1. Establecemos el Nivel de Referencia (N.R.) en la rampa horizontal de arena.
2. Calculamos la altura vertical inicial h desde la cual se desprendió el carro:
   h = d_1 \sin 37^\circ = (20\text{ m}) \times (0.6) = 12\text{ metros}
3. Estado inicial 1 (reposo a altura h = 12\text{ m}):
   E_{m1} = mgh = (500\text{ kg})(10\text{ m/s}^2)(12\text{ m}) = 60\ 000\text{ J}
4. Estado final 2 (detenido en la rampa horizontal, v_2 = 0, h_2 = 0):
   E_{m2} = 0
5. En la rampa horizontal actúa la fricción no conservativa de la arena sobre una distancia L:
   - Fuerza normal: N = mg = (500)(10) = 5000\text{ N}.
   - Fuerza de fricción: f_k = \mu_k N = (0.60)(5000\text{ N}) = 3000\text{ N}.
   - Trabajo de la fuerza de fricción:
     W_{FNC} = -f_k \cdot L = -3000 L
6. Aplicamos el Teorema de las Fuerzas No Conservativas:
   W_{FNC} = E_{m2} - E_{m1} \implies -3000 L = 0 - 60\ 000
   3000 L = 60\ 000 \implies L = \frac{60\ 000}{3000} = 20\text{ metros}
- La rampa de arena debe medir como mínimo **20\text{ metros}**.  
* **Respuesta:** C

---

## Teorema trabajo-energía

El trabajo neto realizado sobre un cuerpo equivale al cambio de su energía cinética: W_neto = K_final − K_inicial. Trabajo positivo aumenta K; negativo la reduce. La fórmula W = Fd cos θ corresponde a fuerza constante y desplazamiento rectilíneo; una fuerza perpendicular al desplazamiento no realiza trabajo en ese movimiento.

Si actúan fuerzas conservativas, puede introducirse energía potencial. La energía mecánica K + U permanece constante cuando el trabajo de fuerzas no conservativas es nulo. Con rozamiento, la energía no desaparece: se transforma y el sistema elegido permite contabilizarla. La potencia mide la rapidez de transferencia de energía, no la cantidad total de trabajo por sí sola.
