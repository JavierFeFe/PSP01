
## Ejercicio 2:

**Primera parte:** implementa una aplicación que escriba en un fichero indicado por el usuario conjuntos de letras generadas de forma aleatoria (sin sentido real). Escribiendo cada conjunto de letras en una línea distinta. El número de conjuntos de letras a generar por el proceso, también será dado por el usuario en el momento de su ejecución. Esta aplicación se llamará "lenguaje" y como ejemplo, podrá ser invocada así:
java -jar lenguaje 40 miFicheroDeLenguaje.txt

Indicando que se generarán 40 palabras del lenguaje y serán guardadas en miFicheroDeLenguaje.txt

![image](https://user-images.githubusercontent.com/44543081/47618959-4bd7ea80-dad9-11e8-9560-67eb15991d67.png)  
*Busco que rango de caracteres son letras minúsculas en codigo ascii*

![image](https://user-images.githubusercontent.com/44543081/47619402-90b25000-dade-11e8-9933-d2ab916965e6.png)  
*Genero una palabra con carácteres aleatorios*

![image](https://user-images.githubusercontent.com/44543081/47968825-71339e00-e06f-11e8-9e74-140c5eea688f.png)  
*Me sitúo al final del archivo y escribo la nueva palabra*

![image](https://user-images.githubusercontent.com/44543081/47619483-5eedb900-dadf-11e8-88c1-2d4a8a9eb5e1.png)  
*El código se repetirá el número de veces indicado*

![image](https://user-images.githubusercontent.com/44543081/47619182-429c4d00-dadc-11e8-8572-ec9f52d0ca14.png)  
*Ejecuto la aplicación tal como se solicita en el ejercicio*


**Segunda parte:** implementa una aplicación, llamada 'colaborar', que lance al menos 10 instancias de la aplicación "lenguaje". Haciendo que todas ellas, colaboren en generar un gran fichero de palabras. Cada instancia generará un número creciente de palabras de 10, 20, 30, … Por supuesto, cada proceso seguirá escribiendo su palabra en una línea independiente de las otras. Es decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el fichero 10 + 20 + 30 + … + 100 = 550 líneas.
Tercera parte: Realiza un pequeño manual (tipo "¿Cómo se hace?" o "HowTo"), utilizando un fichero README.md (en la raíz de tu proyecto y como muestra esta plantilla) en el que indiques en el que indiques, con pequeñas explicaciones y capturas, cómo has probado la ejecución de las aplicaciones que has implementado en este ejercicio.

![image](https://user-images.githubusercontent.com/44543081/47619499-a8d69f00-dadf-11e8-911a-f1132b7bf498.png)  
*Genero un bucle en colaborar.java que incrementa en 10 el nº de líneas las veces indicadas*

![image](https://user-images.githubusercontent.com/44543081/47619305-80e63c00-dadd-11e8-8e43-524ab2f08af3.png)  
*Ejecuto la aplicación tal como se solicita en el ejercicio*

