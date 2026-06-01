# Sistema de Denuncias Ambientales - Parte II 🍃

[cite_start]Este proyecto es la implementación en Java del **Sistema de Denuncias Ambientales** para la Secretaría de Medio Ambiente de la Provincia de Río Negro[cite: 97]. [cite_start]Forma parte de la actividad entregable de la materia Orientación a Objetos I de la Licenciatura en Sistemas (UNRN)[cite: 94, 95].

##  Descripción del Proyecto
[cite_start]El sistema permite gestionar un registro completo de denuncias ambientales realizadas por ciudadanos u Organizaciones No Gubernamentales (ONGs)[cite: 97, 134]. [cite_start]Además, administra un programa de incentivos ("EcoDefensor ED+") que otorga puntos a los denunciantes según la categoría de la infracción y la resolución del caso, permitiendo canjearlos por recompensas ecológicas[cite: 136, 141, 144].

##  Estructura y Conceptos de POO Aplicados
El desarrollo se guió por un modelo de dominio UML (Parte I) y aplica fuertemente los pilares de la Orientación a Objetos:
* **Encapsulamiento:** Protección de datos sensibles en todas las entidades mediante el uso de modificadores `private` y métodos *getters/setters*.
* [cite_start]**Herencia y Polimorfismo:** Implementación de una clase abstracta `Denunciante` de la cual heredan `Ciudadano` y `ONG`[cite: 134], permitiendo el tratamiento polimórfico en las colecciones del sistema (Upcasting).
* **Relaciones Bidireccionales:** Sincronización entre las denuncias y sus autores para mantener la consistencia del historial y el puntaje.

##  Clases Principales
* [cite_start]`SecretariaAmbiente`: Clase gestora principal que almacena el registro general de denuncias y denunciantes[cite: 97, 157].
* [cite_start]`Denuncia`: Maneja el ciclo de vida de la infracción, desde su recepción hasta su resolución, incluyendo el número de expediente[cite: 100, 107].
* [cite_start]`Denunciante` (Abstracta): Define el comportamiento base, la acumulación de puntos y el historial de canjes[cite: 135].
* [cite_start]`Evento` / `Categoria` / `Recompensa` / `Canje`: Clases de soporte que estructuran el dominio del problema[cite: 100, 141, 144].

##  Pruebas (TestSecretariaAmbiente)
La clase `TestSecretariaAmbiente` contiene el método `main` con la simulación de casos de uso requerida, incluyendo:
1. [cite_start]Instanciación del organismo central[cite: 157].
2. [cite_start]Carga de ciudadanos y ONGs[cite: 158].
3. [cite_start]Registro de denuncias en diversas ubicaciones (ej. Viedma) y categorías (ej. Contaminación Hídrica, Residuos Peligrosos)[cite: 101, 105, 109, 160].
4. [cite_start]Simulación del ciclo de vida y eventos de una denuncia[cite: 162].
5. [cite_start]Sistema de canje de puntos por recompensas del catálogo[cite: 163].

---
**Autor:** Francisco Rocca, Lucas Lavezzo, Santiago Sarabia