## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

---

### 3.3 Variaciones Porcentuales en Magnitudes Geométricas
Para calcular la variación porcentual de una fórmula o magnitud dependiente (área, volumen):
1. Se asume que el valor inicial de cada variable independiente es 100\% o una base numérica cómoda (10 o 1).
2. Se ignoran los factores constantes multiplicativos (\pi, \frac{1}{2}, \frac{4}{3}, etc.), pues no alteran la tasa de cambio porcentual.
3. Se calcula el valor porcentual final y se compara con el 100\% inicial.

---

### 3.4 Aplicaciones Comerciales
En las transacciones mercantiles intervienen variables monetarias estandarizadas:

| Elemento Comercial | Notación | Definición Formal y Convención |
| :--- | :---: | :--- |
| **Precio de Costo** | P_c | Inversión total realizada para adquirir o fabricar el bien. |
| **Precio de Venta** | P_v | Importe real pagado por el comprador final. |
| **Ganancia (Utilidad)** | G | Margen positivo (P_v > P_c). Por defecto se calcula como un porcentaje del **Precio de Costo** (G = r\% P_c). |
| **Pérdida** | P | Margen negativo (P_v < P_c). Por defecto se calcula sobre el **Precio de Costo** (P = r\% P_c). |
| **Precio Fijado / de Lista** | P_f o P_L | Precio exhibido al público antes de aplicar promociones o rebajas. |
| **Descuento Comercial** | D | Rebaja efectuada sobre el precio de lista. Por defecto se calcula sobre el **Precio Fijado** (D = r\% P_f). |
| **Gastos Operativos** | g | Costos adicionales de transporte, almacenamiento o impuestos. |
| **Ganancia Neta** | G_n | Utilidad líquida real que percibe el comerciante tras descontar gastos. |

#### Ecuaciones Fundamentales del Comercio:
1. **En una transacción con ganancia:**
   P_v = P_c + G
2. **En una transacción con pérdida:**
   P_v = P_c - P
3. **En relación con el precio fijado o de catálogo:**
   P_v = P_f - D
   P_f = P_c + \text{Aumento inicial}
4. **Relación entre ganancia bruta y ganancia neta:**
   G_{\text{bruta}} = G_{\text{neta}} + \text{Gastos}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Ecuación de Venta con Ganancia** | P_v = P_c + G \quad (\text{Si no se especifica, } G = r\% P_c) |
| **Ecuación de Venta con Pérdida** | P_v = P_c - P \quad (\text{Si no se especifica, } P = r\% P_c) |
| **Ecuación del Precio Fijado** | P_v = P_f - D \quad (\text{Si no se especifica, } D = r\% P_f) |
| **Identidad Comercial Maestra** | P_f - D = P_c + G_b \implies P_f (1 - d\%) = P_c (1 + g\%) |
| **Desglose de Ganancia** | G_b = G_n + \text{Gastos} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: La Regla del "100" en Geometría
¿En qué porcentaje varía el área de un círculo si su radio aumenta en un 20\%?
* **Fórmula:** \text{Área} = \pi \cdot R^2 \implies \text{Área} \propto R^2.
* Asignamos al radio inicial el valor cómodo R_1 = 10:
  \text{Área}_1 = (10)^2 = 100
* El radio aumenta 20\%: R_2 = 10 + 2 = 12:
  \text{Área}_2 = (12)^2 = 144
* **Variación Inmediata:** De 100 pasa a 144, lo que representa directamente un **aumento del 44\%** sin necesidad de plantear ecuaciones con x ni arrastrar \pi.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Bases por Defecto: "¿Sobre Qué se Aplica el Porcentaje?"
* **Gana sobre el Costo:** Si el problema dice *"se gana el 20%"*, es **20\% P_c**.
* **Pierde sobre el Costo:** Si dice *"se pierde el 15%"*, es **15\% P_c**.
* **Descuenta sobre la Lista:** Si dice *"se hace un descuento del 10%"*, es **10\% P_f**.
* **Mnemotecnia:** *"El comerciante siempre piensa en lo que le costó (P_c), pero al cliente le descuenta de lo que marcó en la etiqueta (P_f)"*.

### 2. Descuento Único: "Suma Menos Producto"
* D_u = \text{Suma} - \frac{\text{Producto}}{100}
* Para dos descuentos del 20\% y 30\%:
  \text{Suma} = 20 + 30 = 50
  \text{Producto} = \frac{20 \times 30}{100} = 6
  D_u = 50 - 6 = 44\%

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Ganancia Calculada sobre el Precio de Venta
> Lee cuidadosamente el texto del problema. Si dice explícitamente:
> *"Se vendió un artículo ganando el 20\% del precio de venta (P_v)"*:
> - **Planteo Correcto:** P_v = P_c + 20\% P_v \implies 80\% P_v = P_c \implies P_v = \frac{P_c}{0.80} = 1.25 P_c.
> - **Error Fatal:** Plantear P_v = 1.20 P_c. ¡Esto conduce directamente a la alternativa distractora A!

> [!WARNING]
> ### Trampa 2: Descuento Sucesivo no es Adición Lineal
> Un descuento del 20\% seguido de otro del 20\% **NO** equivale a un descuento del 40\%.
> Equivale a:
> D_u = 20 + 20 - \frac{20 \times 20}{100} = 40 - 4 = 36\%
> Si marcas 40\%, habrás caído en el distractor más antiguo de los exámenes de admisión.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Liquidación de Inventarios y Márgenes Comerciales en el Mall Aventura Arequipa
Las cadenas departamentales (Ripley, Falabella) anuncian promociones del tipo: *"40% de descuento + 20% adicional con tarjeta de la tienda"*.
El descuento real no es 60\%, sino:
D_u = 40 + 20 - \frac{40 \times 20}{100} = 60 - 8 = 52\%
El cliente paga el 48\% del precio de lista. Conocer la matemática comercial permite auditar contratos de consumo, facturación con IGV (18\%) y calcular la tasa real de rentabilidad sobre el capital invertido.

---
