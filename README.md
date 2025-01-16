# Examen de Selenium Java

Este repositorio es para realizar un examen de Selenium con Java.

## Descripción

Este examen está diseñado para evaluar tus conocimientos y habilidades en el uso de Selenium con Java. A continuación, encontrarás una serie de preguntas y ejercicios prácticos que deberás completar.


## Instrucciones para la Entrega de la Tarea

1. **Acepta la asignación**: Acepta la asignación de GitHub Classroom utilizando el enlace proporcionado por tu
   instructor. Esto creará una bifurcación (fork) del repositorio en tu cuenta de GitHub.

2. **Clona tu fork**: Clona el repositorio bifurcado en tu máquina local utilizando el comando:
    ```sh
    git clone <URL-de-tu-fork>
    ```

3. **Crea una rama**: Crea una nueva rama con tu nombre para trabajar en la tarea:
    ```sh
    git checkout -b <tu-nombre>
    ```

4. **Responde las preguntas**: Completa las respuestas en el archivo `Readme.md` en los espacios proporcionados.

5. **Realiza los ejercicios prácticos**: Sigue las instrucciones en la sección "Ejercicios Prácticos" para completar los ejercicios.

6. **Haz commit de tus cambios**: Guarda tus cambios y haz commit con un mensaje descriptivo:

7. **Sube tus cambios**: Sube tu rama a tu repositorio bifurcado en GitHub:
    ```sh
    git push origin <tu-nombre>
    ```

8. **Crea un Pull Request**: En GitHub, crea un Pull Request desde tu rama en tu fork hacia la rama principal (`main` o
   `master`) del repositorio original.

9. **Revisa y envía**: Asegúrate de que tu Pull Request esté completo y envíalo para revisión.

Por favor, asegúrate de seguir todos los pasos y de que tu Pull Request esté listo antes de la fecha límite.

## Preguntas

1. ¿Qué es Selenium y para qué se utiliza?
    - Respuesta:

    Selenium es un driver para realizar pruebas automatizadas o realizar script de pruebas para control de calidad ya sea de aceptacion o regresiones

2. ¿Cómo se configura Selenium WebDriver con Java?
    - Respuesta:

    se debe agregar las librerias de selenium a nuestra interfaz y luego poder realizar el comando:
    WebDriver driver = new ChromeDriver();

3. ¿Cuáles son los diferentes tipos de localizadores en Selenium?
    - Respuesta:

    Los mas comunes son: ID, Name, XPath, CSS Selector

4. ¿Cómo se manejan los menús desplegables en Selenium?
    - Respuesta:

    Localizar el elemento, luego con el metodo Actions class para simular acciones de click y seleccionar las opciones, podemos utilizar tambien un ScriptExecutor

5. ¿Cuál es la diferencia entre `findElement` y `findElements` en Selenium?
    - Respuesta:

    FindElement devuelve solo un elemento dependiendo del selector que hayamos colocado para su busqueda, si no lo encuentra manda una excepcion que no existe tal elemento.

    FindElements, devuelve un array de todos los elementos que coincidan con nuestro selector de busqueda

6. ¿Cómo se manejan las alertas y ventanas emergentes en Selenium?
    - Respuesta:

    Podemos utilizar los metodos Alert, accept o dismiss, dependiendo del tipo de pop up que nos salga

7. ¿Qué es un WebDriverWait y cómo se utiliza?
    - Respuesta:

    Se utiliza para darle un rango de tiempo hasta que una condicion se cumpla

8. ¿Cómo se toma una captura de pantalla en Selenium?
    - Respuesta:

    Se realiza mediante TakesScreenshot o getScreenshotAs

9. ¿Cómo se manejan múltiples ventanas en Selenium?
    - Respuesta:

    podemos utilizar un switchTo.window (1 o 2 o 3... etc) ya que lo maneja como un array de ventanas


10. ¿Cuáles son algunas de las mejores prácticas para escribir pruebas con Selenium?
    - Respuesta:

    Utilizar XPath dinamicos para una buena durabilidad de nuestras pruebas
    utilizar nombres descriptivos para nuestros casos de prueba
    Utilizar y Manejar Excepciones en aquellas pruebas en donde hay un alto riesgo de falla
    Utilizar POM para una mejor organizacion del codigo


## Respuestas

Por favor, escribe tus respuestas en los espacios proporcionados arriba.


## Ejercicios Prácticos

Para practicar el uso de Selenium con Java, sigue estos pasos:

1. **Configura tu proyecto**: Crea un nuevo proyecto Gradle y agrega las dependencias de Selenium, WebDriverManager y TestNG a tu archivo `build.gradle`.

2. **Escribe una prueba para abrir una página web**: Crea una prueba que abra un navegador y navegue a una URL especificada.

3. **Localiza e interactúa con elementos**: Escribe pruebas para localizar elementos en la página utilizando diferentes localizadores (id, name, class, etc.) y realiza acciones como hacer clic, escribir y seleccionar.

4. **Maneja menús desplegables y casillas de verificación**: Escribe pruebas para interactuar con menús desplegables y casillas de verificación.

5. **Implementa esperas**: Utiliza esperas implícitas y explícitas para manejar problemas de sincronización en tus pruebas.

6. **Toma una captura de pantalla**: Escribe una prueba que tome una captura de pantalla de la página web.

7. **Maneja múltiples ventanas**: Escribe una prueba que maneje múltiples ventanas o pestañas del navegador.

8. **Crea un suite de pruebas**: Organiza tus pruebas en un suite de pruebas y ejecútalas juntas.



