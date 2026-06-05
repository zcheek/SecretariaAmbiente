# 🍃 Sistema de Denuncias Ambientales - Parte III

Sistema informático desarrollado en **Java** para la gestión de denuncias ambientales de la Secretaría de Medio Ambiente de la Provincia de Río Negro. 

Este proyecto es la entrega final (Parte I, II Y III) correspondiente a la asignatura **Orientación a Objetos I** de la **Licenciatura en Sistemas (UNRN)**.

## 📝 Descripción del Proyecto

El sistema permite llevar un registro completo del proceso de investigación y resolución de infracciones ambientales. Además, administra el programa de incentivos **"EcoDefensor (ED+)"**, destinado a fomentar la participación ciudadana otorgando puntos canjeables por recompensas sustentables, y gestiona el cuerpo técnico encargado de auditar dichas denuncias.

### Características Principales:
* **Gestión de Denunciantes:** Soporte para registrar ciudadanos particulares y Organizaciones No Gubernamentales (ONGs).
* **Registro de Denuncias:** Categorización de infracciones (Ej: Contaminación Hídrica, Residuos Peligrosos, etc.) con seguimiento mediante número de expediente.
* **Trazabilidad (Eventos):** Historial detallado del ciclo de vida de cada denuncia, desde que es recibida hasta su resolución.
* **Sistema de Recompensas:** Acumulación de puntos por denuncias realizadas y bonos extra por resoluciones favorables, con un catálogo para canjear premios ecológicos.
* **Cuerpo de Inspectores (Parte III):** Asignación de profesionales (De Campo, Jurídicos y de Laboratorio) a los eventos de cada denuncia.
* **Informes y Costos Dinámicos (Parte III):** Generación de dictámenes técnicos y cálculo de costos de intervención automatizados según la especialidad de cada inspector y los recursos utilizados (ej. vehículos).

## 🏗️ Arquitectura y Diseño (POO)

El desarrollo respeta estrictamente los pilares de la Programación Orientada a Objetos, basándose en el diagrama UML diseñado a lo largo de la cursada:

* **Encapsulamiento:** Todos los atributos de las entidades están protegidos (`private`) y se accede a ellos mediante sus respectivos métodos *getter/setter* y reglas de negocio.
* **Herencia y Polimorfismo:** Implementación de la jerarquía abstracta en `Denunciante` (`Ciudadano` y `ONG`). Esto permite aplicar *Upcasting* para manejar diferentes tipos de usuarios en una misma colección.
* **Relaciones Bidireccionales:** Sincronización automática entre objetos (ej. al agregar un autor a una `Denuncia`, el sistema actualiza el historial del `Denunciante` y le suma los puntos correspondientes).
* **Clases y Métodos Abstractos (Parte III):** Implementación de la clase abstracta `Inspector`, garantizando que sus clases hijas sobrescriban (`@Override`) los comportamientos específicos mediante polimorfismo para los métodos `generarInforme()` y `calcularCostoIntervencion()`.
* **Delegación (Parte III):** Centralización de la lógica de procesamiento en la clase `SecretariaAmbiente`, la cual recibe las peticiones del `main` y delega la responsabilidad a sus objetos internos para listar datos, comparar informes y calcular montos totales.

## 🚀 Instalación y Ejecución

El proyecto está estructurado con clases estándar de Java, sin dependencias externas. Para compilar y ejecutar las pruebas del sistema:

1. Clonar este repositorio:
   ```bash
   git clone [https://github.com/zcheek/SecretariaAmbiente.git](https://github.com/zcheek/SecretariaAmbiente.git)

2. Ejecutar la clase principal de pruebas (correspondiente a la entrega final):

Bash
java TestSecretariaAmbienteP3

👨‍💻 Autores

Francisco Rocca

Lucas Lavezzo

Santiago Sarabia

Universidad Nacional de Río Negro (UNRN) - 2026