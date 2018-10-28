import java.io.IOException;

public class colaborar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreArchivo = "prueba.txt"; //Valor por defecto
		int repeticiones = 10; //Valor por defecto
		if (args.length == 2 && args[1].matches("\\d+")) { //Comprueba que los parámetros introducidos sean correctos
			nombreArchivo = args[0];
			repeticiones = Integer.parseInt(args[1]);
		}else { 
			//return; //Si activo este return solo funcionaría si se introducen parámetros
		}
		for (int i=0; i<repeticiones; i++) { //Bucle que ejecuta la tarea con las repeticiones designadas
			try {
				int lineas = (i+1) * 10; //Incrementa el nº de líneas en 10
				System.out.println("Ejecutando aplicación que generará " + lineas + " líneas.");
				Runtime.getRuntime().exec("java -jar lenguaje.jar " + nombreArchivo + " " + lineas ); //Ejecuta lenguaje.jar con los parámetros designados
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
