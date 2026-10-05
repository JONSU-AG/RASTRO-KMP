## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 08 - MECÁNICA DE FLUIDOS (HIDROSTÁTICA E HIDRODINÁMICA)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 4 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), PRINCIPIOS FÍSICOS Y FLUIDODINÁMICA
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[MECÁNICA DE FLUIDOS] --> B[Hidrostática]
    A --> C[Hidrodinámica]
    A --> D[Fenómenos de Superficie]

    B --> B1[Presión: P = F_perp / A]
    B --> B2[Principio Fundamental: ΔP = ρ g Δh]
    B --> B3[Principio de Pascal: Prensa Hidráulica F1/A1 = F2/A2]
    B --> B4[Principio de Arquímedes: E = ρ_liq g V_sum]

    C --> C1[Flujo Ideal: Incompresible, No Viscoso, Irrotacional]
    C --> C2[Caudal y Continuidad: Q = Av = cte]
    C --> C3[Ecuación de Bernoulli: P + 1/2 ρ v² + ρgh = cte]
    C --> C4[Efecto Venturi y Teorema de Torricelli v = √(2gh)]

    D --> D1[Tensión Superficial: γ = F / L]
    D --> D2[Capilaridad: Ley de Jurin]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Propiedades Fundamentales de los Fluidos
- **Fluido:** Sustancia que se deforma continuamente bajo la acción de un esfuerzo cortante o tangencial, sin importar cuán pequeño sea. Comprende líquidos y gases.
- **Densidad Absoluta (\rho):** Magnitud escalar definida como la masa por unidad de volumen:
  \rho = \frac{dm}{dV} \quad \left[\frac{\text{kg}}{\text{m}^3}\right] \quad \left(\rho_{\text{agua}} = 1000\ \frac{\text{kg}}{\text{m}^3} = 1\ \frac{\text{g}}{\text{cm}^3}\right)
- **Peso Específico (\gamma):**
  \gamma = \frac{W}{V} = \rho g \quad \left[\frac{\text{N}}{\text{m}^3}\right]
- **Densidad Relativa (\rho_{\text{rel}}):**
  \rho_{\text{rel}} = \frac{\rho_{\text{sustancia}}}{\rho_{\text{agua a } 4^\circ\text{C}}}

### 3.2. Hidrostática: Presión y Principios Fundamentales
1. **Presión (P):** Componente normal de la fuerza por unidad de área:
   P = \lim_{\Delta A \to 0} \frac{\Delta F_\perp}{\Delta A} \quad \left[\text{Pa} = \frac{\text{N}}{\text{m}^2}\right]
   - Equivalencias comunes:
     1\text{ atm} = 1.013 \times 10^5\text{ Pa} = 760\text{ mmHg} = 10.33\text{ m H}_2\text{O} \approx 10^5\text{ Pa} = 1\text{ bar}
2. **Presión Hidrostática (P_h):** Presión ejercida por una columna de líquido en reposo a una profundidad h:
   P_h = \rho_L g h
   - *Isotropía:* La presión hidrostática actúa perpendicularmente a cualquier superficie sumergida y con igual intensidad en todas las direcciones a una misma profundidad.
3. **Presión Total o Absoluta (P_{\text{abs}}):**
   P_{\text{abs}} = P_{\text{atm}} + P_h = P_{\text{atm}} + \rho_L g h
   - **Presión Manométrica (P_{\text{man}}):** Presión relativa medida respecto a la presión atmosférica local: P_{\text{man}} = P_{\text{abs}} - P_{\text{atm}}.
4. **Vasos Comunicantes y Tubos en U:**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Hidrodinámica de Fluidos Ideales
Un fluido ideal cumple cuatro hipótesis:
1. **Incompresible:** Densidad constante (\rho = \text{cte}).
2. **No viscoso:** Cero rozamiento interno disipativo entre capas de fluido.
3. **Flujo laminar / estacionario:** La velocidad en cada punto no cambia con el tiempo.
4. **Irrotacional:** Elementos de fluido no poseen momento angular neto sobre su propio centro de masa.

### 4.2. Ecuación de Continuidad
Representa la conservación de la masa a lo largo de un tubo de flujo:
\frac{dm}{dt} = \rho A v = \text{cte} \xrightarrow{\rho = \text{cte}} Q = A_1 v_1 = A_2 v_2 = \text{cte}
- Q: Caudal volumétrico o gasto \left[\text{m}^3/\text{s} \text{ o } \text{L/s}\right].

### 4.3. Ecuación de Bernoulli
Expresión del principio de conservación de la energía mecánica por unidad de volumen a lo largo de una línea de corriente:
P_1 + \frac{1}{2} \rho v_1^2 + \rho g h_1 = P_2 + \frac{1}{2} \rho v_2^2 + \rho g h_2 = \text{cte}
