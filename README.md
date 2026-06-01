# 🍃 Sistema de Denuncias Ambientales - Parte II

Sistema informático desarrollado en **Java** para la gestión de denuncias ambientales de la Secretaría de Medio Ambiente de la Provincia de Río Negro. 

Este proyecto es la entrega final (Parte II) correspondiente a la asignatura **Orientación a Objetos I** de la **Licenciatura en Sistemas (UNRN)**.

## 📝 Descripción del Proyecto

El sistema permite llevar un registro completo del proceso de investigación y resolución de infracciones ambientales. Además, administra el programa de incentivos **"EcoDefensor (ED+)"**, destinado a fomentar la participación ciudadana otorgando puntos canjeables por recompensas sustentables.

### Características Principales:
* **Gestión de Denunciantes:** Soporte para registrar ciudadanos particulares y Organizaciones No Gubernamentales (ONGs).
* **Registro de Denuncias:** Categorización de infracciones (Ej: Contaminación Hídrica, Residuos Peligrosos, etc.) con seguimiento mediante número de expediente.
* **Trazabilidad (Eventos):** Historial detallado del ciclo de vida de cada denuncia, desde que es recibida hasta su resolución.
* **Sistema de Recompensas:** Acumulación de puntos por denuncias realizadas y bonos extra por resoluciones favorables, con un catálogo para canjear premios ecológicos.

## 🏗️ Arquitectura y Diseño (POO)

El desarrollo respeta estrictamente los pilares de la Programación Orientada a Objetos, basándose en el diagrama UML diseñado en la Parte I:

* **Encapsulamiento:** Todos los atributos de las entidades están protegidos (`private`) y se accede a ellos mediante sus respectivos métodos *getter/setter* y reglas de negocio.
* **Herencia y Polimorfismo:** Implementación de la clase abstracta `Denunciante` de la cual heredan `Ciudadano` y `ONG`. Esto permite aplicar *Upcasting* para manejar diferentes tipos de usuarios en una misma colección.
* **Relaciones Bidireccionales:** Sincronización automática entre objetos (ej. al agregar un autor a una `Denuncia`, el sistema actualiza el historial del `Denunciante` y le suma los puntos correspondientes).

## 🚀 Instalación y Ejecución

El proyecto está estructurado con clases estándar de Java, sin dependencias externas. Para compilar y ejecutar las pruebas del sistema:

1. Clonar este repositorio:
   ```bash
   git clone https://github.com/zcheek/SecretariaAmbiente.git

2. Navegar a la carpeta del proyecto y compilar los archivos:

Bash
javac *.java

3. Ejecutar la clase principal de pruebas:

Bash
java TestSecretariaAmbiente
👨‍💻 Autores
Francisco Rocca, Lucas Lavezzo, Santiago Sarabia Universidad Nacional de Río Negro (UNRN) - 2026
