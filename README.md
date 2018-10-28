# Tarea para PSP01

## Ejercicio 1:

**Primera parte:** Implementa una aplicación que ordena un conjunto indeterminado de números que recibe a través de su entrada estándar; y muestra el resultado de la ordenación en su salida estándar. La aplicación se llamará 'ordenarNumeros'.

![image](https://user-images.githubusercontent.com/44543081/47614305-1f52ad00-da9e-11e8-883b-35bb52b1dd8d.png)
*Genero el código en Eclipse, necesitaría generar una entrada standard para poder probar esta parte, o introducir nºs a modo de prueba en el código mediante un bucle o algo parecido, en mi caso como vi que en la 2ª parte del ejercico ya voy a generar ese código no lo consideré necesario.*

**Segunda parte:** Implementa una aplicación, llamada 'aleatorios', que genere al menos 40 números aleatorios (entre 0 y 100), y que los escriba en su salida estándar.

![image](https://user-images.githubusercontent.com/44543081/47614544-b40ada00-daa1-11e8-939d-fe61fc1999aa.png)  
*Genero el código en Eclipse para el generador de números aleatorios.*

![image](https://user-images.githubusercontent.com/44543081/47614501-08fa2080-daa1-11e8-92a2-719d7c34bfae.png)  
*Compruebo que los nºs generados estén entre 0 y 100 (inclusive)*

**Tercera parte:** Realiza un pequeño manual (tipo "¿Cómo se hace?" o "HowTo"), utilizando un fichero README.md (en la raíz de tu proyecto y como muestra esta plantilla) en el que indiques, con pequeñas explicaciones y capturas, cómo has probado la ejecución de las aplicaciones que has implementado en este ejercicio. Entre las pruebas que hayas realizado, debes incluir una prueba en la que utilizando el operador "|" (tubería) redirijas la salida de la aplicación 'aleatorios' a la entrada de la aplicación 'ordenarNumeros'.

![image](https://user-images.githubusercontent.com/44543081/47614584-8e320500-daa2-11e8-9a3f-61fd40f15613.png)  
*Realizo la prueba con la salida de aleatorios y la entrada en ordenarNumeros*

## Ejercicio 2:

**Primera parte:** implementa una aplicación que escriba en un fichero indicado por el usuario conjuntos de letras generadas de forma aleatoria (sin sentido real). Escribiendo cada conjunto de letras en una línea distinta. El número de conjuntos de letras a generar por el proceso, también será dado por el usuario en el momento de su ejecución. Esta aplicación se llamará "lenguaje" y como ejemplo, podrá ser invocada así:
java -jar lenguaje 40 miFicheroDeLenguaje.txt

Indicando que se generarán 40 palabras del lenguaje y serán guardadas en miFicheroDeLenguaje.txt

![image](https://user-images.githubusercontent.com/44543081/47618959-4bd7ea80-dad9-11e8-9560-67eb15991d67.png)  

![image](https://user-images.githubusercontent.com/44543081/47619182-429c4d00-dadc-11e8-8572-ec9f52d0ca14.png)  


**Segunda parte:** implementa una aplicación, llamada 'colaborar', que lance al menos 10 instancias de la aplicación "lenguaje". Haciendo que todas ellas, colaboren en generar un gran fichero de palabras. Cada instancia generará un número creciente de palabras de 10, 20, 30, … Por supuesto, cada proceso seguirá escribiendo su palabra en una línea independiente de las otras. Es decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el fichero 10 + 20 + 30 + … + 100 = 550 líneas.
Tercera parte: Realiza un pequeño manual (tipo "¿Cómo se hace?" o "HowTo"), utilizando un fichero README.md (en la raíz de tu proyecto y como muestra esta plantilla) en el que indiques en el que indiques, con pequeñas explicaciones y capturas, cómo has probado la ejecución de las aplicaciones que has implementado en este ejercicio.

![image](https://user-images.githubusercontent.com/44543081/47619305-80e63c00-dadd-11e8-8e43-524ab2f08af3.png)  

