## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química de Disoluciones
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Molaridad, Normalidad, Molalidad, Dilución y Mezcla de soluciones)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.9 / 10 (Fijo en los exámenes de Ciencias Biomédicas e Ingenierías)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              SISTEMAS DISPERSOS
                                      │
         ┌────────────────────────────┼────────────────────────────┐
         ▼                            ▼                            ▼
   SUSPENSIONES                   COLOIDES                    SOLUCIONES
(Diámetro > 1000 nm,          (1 nm a 1000 nm,            (Diámetro < 1 nm,
 sedimentan, opacas)          Efecto Tyndall, Browniano)   monofásica, homogénea)
                                                                   │
         ┌─────────────────────────────────────────────────────────┴────────────────────────┐
         ▼                                                                                  ▼
UNIDADES FÍSICAS DE CONCENTRACIÓN                                  UNIDADES QUÍMICAS DE CONCENTRACIÓN
• Porcentaje en masa: \%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100     • Molaridad: M = \frac{n_{\text{sto}}}{V_{\text{sol(L)}}} = \frac{m_{\text{sto}}}{\overline{M} \cdot V}
• Porcentaje en volumen: \%v/v = \frac{V_{\text{sto}}}{V_{\text{sol}}} \times 100 • Normalidad: N = \frac{\#Eq\text{-}g}{V_{\text{sol(L)}}} = M \cdot \theta
• Porcentaje masa-volumen: \%m/v = \frac{m_{\text{sto}}}{V_{\text{sol}}} \times 100 • Molalidad: m = \frac{n_{\text{sto}}}{m_{\text{ste(kg)}}}
• Partes por millón: ppm = \frac{mg_{\text{sto}}}{kg_{\text{sol}}} = \frac{mg_{\text{sto}}}{L_{\text{sol}}} • Fracción Molar: x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{total}}}
                                                                                            │
         ┌──────────────────────────────────────────────────────────────────────────────────┘
         ▼
OPERACIONES CON SOLUCIONES
• Dilución:  C_1 \cdot V_1 = C_2 \cdot V_2  (M_1 V_1 = M_2 V_2)
• Mezcla de Soluciones del mismo soluto:  C_1 V_1 + C_2 V_2 = C_F V_F
• Neutralización Estequiométrica:  \#Eq\text{-}g(\text{Ácido}) = \#Eq\text{-}g(\text{Base}) \implies N_A \cdot V_A = N_B \cdot V_B
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Clasificación Comparativa de los Sistemas Dispersos
Un sistema disperso consta de una **Fase Dispersa** (análoga al soluto) distribuida en el seno de una **Fase Dispersante** (medio continuo, análogo al solvente):

| Propiedad | Suspensión | Coloide | Solución Verdadera |
| :--- | :--- | :--- | :--- |
| **Tamaño de partícula** | > 1000\text{ nm} (> 10\,000\text{ Å}) | 1\text{ nm} - 1000\text{ nm} | < 1\text{ nm} (< 10\text{ Å}) |
| **Homogeneidad** | Heterogéneo (2 fases visibles) | Heterogéneo (microscópicamente) | Homogéneo (monofásico) |
| **Sedimentación** | Sedimentan por gravedad | No sedimentan espontáneamente | No sedimentan jamás |
| **Filtrabilidad** | Retenidas por papel de filtro común | Atraviesan filtro común, retenidas por ultrafiltros | No se separan por membranas |
| **Efecto Tyndall** | No aplica (opacas o traslúcidas) | **Presente** (dispersan el haz de luz) | **Ausente** (ópticamente transparentes) |
| **Ejemplos** | Jugo de papaya, leche de magnesia | Mayonesa, gelatina, niebla, humo, sangre | Salmuera, vinagre, aire filtrado, alcohol 70° |

### 3.2. Componentes y Clasificación de las Soluciones
1. **Componentes:**
   * **Soluto (sto):** Sustancia que se disuelve y se halla generalmente en menor proporción molar. Determina el nombre y la reactividad química de la solución. Puede ser uno o más.
   * **Solvente o Disolvente (ste):** Medio dispersante que disuelve al soluto. El agua (H_2O) es el solvente universal por su elevada constante dieléctrica (\epsilon \approx 80) y momento dipolar.
   * **Masa de la solución:**
     m_{\text{solución}} = m_{\text{soluto}} + m_{\text{solvente}}
2. **Clasificación por la Capacidad de Solubilidad (S a una temperatura dada):**
   * *Solubilidad (S):* Cantidad máxima de soluto en gramos que puede disolverse en 100\text{ g} de solvente a una temperatura fija.
   * *Solución Diluida / Concentrada:* Clasificación cualitativa según la proporción relativa de soluto.
   * *Solución Insaturada:* Contiene menos soluto que la máxima cantidad permitida por la curva de solubilidad (m_{\text{sto}} < S).
   * *Solución Saturada:* Contiene exactamente la máxima cantidad disuelta en equilibrio termodinámico dinámico (m_{\text{sto}} = S).
   * *Solución Sobresaturada:* Sistema termodinámicamente inestable que contiene más soluto disuelto que el permitido por la saturación a esa temperatura. Precipita inmediatamente ante una perturbación mecánica o adición de un cristal de siembra.

### 3.3. Unidades Físicas de Concentración
1. **Porcentaje en Masa (\%m/m o \%P/P):**
   \%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100\% = \frac{m_{\text{sto}}}{m_{\text{sto}} + m_{\text{ste}}} \times 100\%
2. **Porcentaje en Volumen (\%v/v o Grado Alcohólico ^\circ\text{GL}):**
   \%v/v = \frac{V_{\text{sto}}}{V_{\text{sol}}} \times 100\%
3. **Porcentaje Masa en Volumen (\%m/v):**
   \%m/v = \frac{m_{\text{sto}}(\text{g})}{V_{\text{sol}}(\text{mL})} \times 100\%
4. **Partes por Millón (ppm):** Usada para soluciones extremadamente diluidas (contaminación, trazas de metales pesados en agua):
   ppm = \frac{mg_{\text{sto}}}{kg_{\text{sol}}} \approx \frac{mg_{\text{sto}}}{L_{\text{solución acuosa}}}

### 3.4. Unidades Químicas de Concentración

#### A. Molaridad (M)
Número de moles de soluto disueltas por cada litro de solución:
M = \frac{n_{\text{sto}}}{V_{\text{sol}}(\text{L})} = \frac{m_{\text{sto}}(\text{g})}{\overline{M}_{\text{sto}}(\text{g/mol}) \cdot V_{\text{sol}}(\text{L})}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. DENSIDAD Y FACTORES DE CONVERSIÓN
\rho_{\text{solución}} = \frac{m_{\text{solución}}}{V_{\text{solución}}}
* La densidad del agua líquida se asume habitualmente como \rho_{H_2O} \approx 1.0\text{ g/mL} = 1.0\text{ g/cm}^3 = 1000\text{ kg/m}^3.

## COMPLEMENTO OFICIAL: Líquido, sólido y disolución
- **Líquido:** tensión superficial (cohesión que sostiene insectos), viscosidad (resistencia a fluir: miel > agua), presión de vapor y ebullición.
- **Sólido:** cristalinos (red ordenada: NaCl, diamante) frente a amorfos (desordenados: vidrio, plásticos).
- **Disolución:** el soluto se rodea de solvente (solvatación/hidratación); depende de temperatura, agitación y superficie de contacto. "Lo semejante disuelve lo semejante": polar con polar.
- Trampa: disolver NO es fundir ni reaccionar; la sal en agua se disocia, no se derrite.
