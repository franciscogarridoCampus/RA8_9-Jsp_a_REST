#  Actividad: Migración JSP a Spring Boot API REST

Este proyecto consiste en la migración de una arquitectura monolítica
basada en **JSP** a una **API REST** moderna utilizando **Spring Boot
4.0.2** y **Java 21**.

------------------------------------------------------------------------

##  Estructura del Proyecto

El proyecto sigue el patrón de diseño por capas para organizar el código
de forma profesional:

-   **`com.franciscogarrido.gestionra.model`**\
    Contiene las entidades JPA (`Asignatura`, `Resultado`, `Criterio`)
    con sus mapeos de base de datos y métodos Getters/Setters.

-   **`com.franciscogarrido.gestionra.repository`**\
    Interfaces que extienden de `JpaRepository` para realizar
    operaciones CRUD automáticas.

-   **`com.franciscogarrido.gestionra.service`**\
    Capa intermedia donde reside la lógica de negocio.

-   **`com.franciscogarrido.gestionra.controller`**\
    Controladores REST que exponen los Endpoints y gestionan las
    respuestas en formato JSON.

------------------------------------------------------------------------

##  Endpoints de la API

  -----------------------------------------------------------------------
  Entidad            Endpoint               Funcionalidad
  ------------------ ---------------------- -----------------------------
  **Asignaturas**    `/api/asignaturas`     Gestión de materias
                                            principales

  **Resultados       `/api/resultados`      Gestión de resultados de
  (RA)**                                    aprendizaje asociados a una
                                            asignatura

  **Criterios**      `/api/criterios`       Gestión de criterios de
                                            evaluación asociados a un RA
  -----------------------------------------------------------------------

------------------------------------------------------------------------

##  Ejemplos de Pruebas (Postman)

### 1️ Crear Asignatura (POST)

`http://localhost:8080/api/asignaturas`

``` json
{
  "nombre": "Desarrollo Aplicaciones Web",
  "codigo": "DAW-2026"
}
```

### 2️ Crear Resultado de Aprendizaje (POST)

`http://localhost:8080/api/resultados`

``` json
{
  "codigo": "RA-01",
  "descripcion": "Desarrolla interfaces interactivas",
  "asignatura": { "id": 1 }
}
```

### 3️ Crear Criterio de Evaluación (POST)

`http://localhost:8080/api/criterios`

``` json
{
  "descripcion": "Utiliza etiquetas semánticas de HTML5",
  "resultado": { "id": 1 }
}
```

------------------------------------------------------------------------

##  Instrucciones de Puesta en Marcha

###  Base de Datos

Importa el archivo **`crud_base.sql`** en tu servidor MySQL
(XAMPP/MariaDB).

###  Configuración

Revisa el archivo:

    src/main/resources/application.properties

Asegúrate de que el usuario y contraseña de MySQL coinciden con tu
entorno local.

###  Ejecución

1.  Abre el proyecto en **NetBeans**.
2.  Haz clic derecho sobre el proyecto → **Clean and Build**.
3.  Haz clic derecho sobre el archivo `GestionraApplication.java` →
    **Run File**.

------------------------------------------------------------------------

##  Tecnologías Utilizadas

-   Java 21
-   Spring Boot 4.0.2
-   Spring Data JPA
-   MySQL
-   Maven
-   NetBeans
-   Postman

