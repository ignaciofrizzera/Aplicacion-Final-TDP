# Aplicacion-Final-TDP
Repositorio a utilizar para el desarrollo de la aplicación final de Tecnologías de Programación.

La aplicación tiene como objetivo brindar una selección de prendas al usuario, en base a los datos ingresados por este, tales como el género, el estilo de ropa que va a usar y su ciudad o locación actual, a partir de la cual se obtendran los datos climáticos.

Se utilizará la API provista por https://openweathermap.org/api para obtener los datos climáticos de las ciudades y se usará la librería "Volley", https://developer.android.com/training/volley, para la comunicación con dicha API.

## Estructura

La aplicación esta dividida en seis actividades cada una con un rol específico con el objetivo de modularizar lo más posible.

* **Actividad Main**: actividad principal, encargada de mostrar el menú de inicio al usuario, donde este brindará la opción de comenzar con     la ejecución de la aplicación o de analizar la información personal mía.

* **Actividad genero**: actividad encargada de capturar el género del usuario.

* **Actividad estilo**: actividad encargada de capturar el estilo de ropa a utilizar por el usuario.

* **Actividad clima**: actividad encargada de capturar la ciudad o locación actual del usuario y realizar la comunicación con la API de         openweathermap para poder obtener los datos climáticos de esta.

* **Actividad resultados**: actividad encargada de analizar los datos climáticos, el género y el estilo de ropa del usuario y en base a         estos datos brindar una variedad de prendas para este.

* **Actividad info**: actividad encargada de mostrar mis datos personales y brindar algunos links de posible interés.

    A lo largo de la aplicación se utilizan dos patrones de diseño:

* **Singleton**: es utilizado en la clase PhoneData, logra su objetivo evitando la creación de varias instancias de esta clase a lo largo de la ejecucíon de la aplicación.

* **Visitor**: es utilizado para recorrer distintas colecciones de Prendas y analizarlas de una manera eficiente y simple.
  
## Cómo instalar

Por el momento se recomienda hacer un pull de este repositorio y ejecutar la aplicación desde Android Studio o el programa que usted desee.

## Anexo

Se utilizó una librería creada por el usuario [**mohammadatif**](https://github.com/mohammadatif/), llamada "Animatoo", https://github.com/mohammadatif/Animatoo, gracias a esto se pudieron incorportar efectos a las transiciones entre actividades de una manera simple y prolija.

Ante cualquier duda, mi dirección de email es ignaciofrizzera@gmail.com a la cual pueden escribirme si desean.
