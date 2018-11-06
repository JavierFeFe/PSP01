
## Ejercicio 2:

**Primera parte:** implementa una aplicación que escriba en un fichero indicado por el usuario conjuntos de letras generadas de forma aleatoria (sin sentido real). Escribiendo cada conjunto de letras en una línea distinta. El número de conjuntos de letras a generar por el proceso, también será dado por el usuario en el momento de su ejecución. Esta aplicación se llamará "lenguaje" y como ejemplo, podrá ser invocada así:
java -jar lenguaje 40 miFicheroDeLenguaje.txt

Indicando que se generarán 40 palabras del lenguaje y serán guardadas en miFicheroDeLenguaje.txt

![image](https://user-images.githubusercontent.com/44543081/47618959-4bd7ea80-dad9-11e8-9560-67eb15991d67.png)  
*Busco que rango de caracteres son letras minúsculas en codigo ascii*

```Java
Random ascii = new Random(); 
Random numeroLetras = new Random();
int longitud = numeroLetras.nextInt(8)+7; //genera una cadena de texto con letras aleatorias con un mínimo de 7 letras y un máximo de 15
String cadena = "";
for (int o = 0; o < longitud; o++) {
  char  letra = (char) (ascii.nextInt(26) + 97); //genera un caracter que se encuentre entre la posición 97 y 122 en el código ascii
  cadena += letra; //añade ese caracter a la cadena de texto
}
```
*Genero una palabra con carácteres aleatorios*  
  
```Java
raf = new RandomAccessFile(archivo, "rwd"); //Creamos un acceso al archivo
//while ((bloqueo=raf.getChannel().tryLock()) == null); //Intenta desbloquear el archivo, si no puede se queda en espera
bloqueo=raf.getChannel().lock(); //Se queda a la espera para desbloquear el archivo
raf.seek(raf.length());//Se mueve al final del archivo				
if (raf.getFilePointer() == 0) { //Si está en la posición del primer caracter no añade salto de línea al principio
  raf.writeBytes(cadena);
}else {
  raf.writeBytes("\r\n" + cadena); //Es necesario hacerlo así para q no añada un salto de línea al final del archivo
}
raf.seek(0); //Nos posiciona al principio del archivo
bloqueo.release();//Libera el bloqueo
```
*Me sitúo al final del archivo y escribo la nueva palabra*  
  
```Java
for (int i = 0; i<lineas; i++) { //generará el nº de líneas indicadas en la variable lineas
```
*El código se repetirá el número de veces indicado*  

![image](https://user-images.githubusercontent.com/44543081/47619182-429c4d00-dadc-11e8-8572-ec9f52d0ca14.png)  
```
java -jar lenguaje.jar 40 miFicheroDeLenguaje.txt
```
*Ejecuto la aplicación tal como se solicita en el ejercicio*

**Segunda parte:** implementa una aplicación, llamada 'colaborar', que lance al menos 10 instancias de la aplicación "lenguaje". Haciendo que todas ellas, colaboren en generar un gran fichero de palabras. Cada instancia generará un número creciente de palabras de 10, 20, 30, … Por supuesto, cada proceso seguirá escribiendo su palabra en una línea independiente de las otras. Es decir, si lanzamos 10 instancias de "lenguaje", al final, debemos tener en el fichero 10 + 20 + 30 + … + 100 = 550 líneas.
Tercera parte: Realiza un pequeño manual (tipo "¿Cómo se hace?" o "HowTo"), utilizando un fichero README.md (en la raíz de tu proyecto y como muestra esta plantilla) en el que indiques en el que indiques, con pequeñas explicaciones y capturas, cómo has probado la ejecución de las aplicaciones que has implementado en este ejercicio.

```Java
for (int i=0; i<repeticiones; i++) { //Bucle que ejecuta la tarea con las repeticiones designadas
  try {
    int lineas = (i+1) * 10; //Incrementa el nº de líneas en 10
    System.out.println("Ejecutando aplicación que generará " + lineas + " líneas.");
    Runtime.getRuntime().exec("java -jar lenguaje.jar " + lineas + " " + nombreArchivo ); //Ejecuta lenguaje.jar con los parámetros designados
  } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
}
```
*Genero un bucle en colaborar.java que incrementa en 10 el nº de líneas las veces indicadas*  

![image](https://user-images.githubusercontent.com/44543081/47619305-80e63c00-dadd-11e8-8e43-524ab2f08af3.png)  
```
java -jar colaborar.jar 10 miFicheroColaborado.txt
```
*Ejecuto la aplicación tal como se solicita en el ejercicio*  
```
find /v /c "" miFicheroColaborado.txt
```
*Muestro el nº de líneas por consola (Windows)*

