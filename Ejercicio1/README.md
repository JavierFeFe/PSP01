
## Ejercicio 1:

**Primera parte:** Implementa una aplicación que ordena un conjunto indeterminado de números que recibe a través de su entrada estándar; y muestra el resultado de la ordenación en su salida estándar. La aplicación se llamará 'ordenarNumeros'.

```Java
try {
    InputStreamReader input = new InputStreamReader(System.in); //Creo una entrada de datos desde System.in
    BufferedReader buffer = new BufferedReader(input); //Creo un buffer con la entrada de datos
    String entrada = null;
    ArrayList<Integer> lista = new ArrayList<Integer>(); //Creo un ArrayList donde se almacenaran los resultados
    while ((entrada = buffer.readLine()) != null) { //Leo líneas mientras entren resultados desde System.in
        if (!entrada.matches("\\d+")) { //Paro la ejecución y muestro error si el valor interpretado no es un número
            System.out.println("Parámetros incorrectos");
            return;
        }
        lista.add(Integer.parseInt(entrada));
    }
    buffer.close(); //Cierro todo
    input.close();
    Collections.sort(lista); //Ordeno la lista
    for (int numero : lista) { //Muestro la línea ordenada por pantalla
        System.out.println(numero);
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
```
*Genero el código en Eclipse, necesitaría generar una entrada standard para poder probar esta parte, o introducir nºs a modo de prueba en el código mediante un bucle o algo parecido, en mi caso como vi que en la 2ª parte del ejercico ya voy a generar ese código no lo consideré necesario.*

**Segunda parte:** Implementa una aplicación, llamada 'aleatorios', que genere al menos 40 números aleatorios (entre 0 y 100), y que los escriba en su salida estándar.

```Java
if (args.length == 1 && args[0].matches("\\d\\d*")){ //Comprueba que solo se introduzca un parámetro y sea un número
    int repeticiones = Integer.parseInt(args[0]); //Repeticiones del parámetro 1
    Random aleatorio = new Random(); //Creo un objeto Random que genera un nº aleatorio entre 0 y el nº indicado
    for (int i=0; i<repeticiones; i++){ //Bucle de repeticiones
        System.out.println(aleatorio.nextInt(101)); //Muestra por pantalla un nº aleatorio 1 y 100 (inclusive)
    }
}else{
    System.out.println("Parámetros incorrectos"); //Muestra por pantalla el error
}
```
*Genero el código en Eclipse para el generador de números aleatorios.*

![image](https://user-images.githubusercontent.com/44543081/47614501-08fa2080-daa1-11e8-92a2-719d7c34bfae.png)  
*Compruebo que los nºs generados estén entre 0 y 100 (inclusive)*

**Tercera parte:** Entre las pruebas que hayas realizado, debes incluir una prueba en la que utilizando el operador "|" (tubería) redirijas la salida de la aplicación 'aleatorios' a la entrada de la aplicación 'ordenarNumeros'.

![image](https://user-images.githubusercontent.com/44543081/47614584-8e320500-daa2-11e8-9a3f-61fd40f15613.png)  
*Realizo la prueba con la salida de aleatorios y la entrada en ordenarNumeros*
