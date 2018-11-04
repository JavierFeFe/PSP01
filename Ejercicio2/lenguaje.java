package Ejercicio2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Random;


public class lenguaje {
	private static File archivo;
	private static RandomAccessFile raf;
	private static FileLock bloqueo;
	
	//Java -jar lenguaje.jar prueba.txt 100 //Ejemplo de uso con par�metros
	
	public static void main(String[] args) {
		// ASCII letras min�sculas del 97 al 122
		String nombreArchivo = "prueba.txt";
		int lineas = 100;
		if (args.length == 2 && args[0].matches("\\d+")) {
			nombreArchivo = args[1];
			lineas = Integer.parseInt(args[0]);
		}else {
			//return; //Activando esto solo funciona con los argumentos adecuados
		}
		try {
			archivo = new File(nombreArchivo);			
			for (int i = 0; i<lineas; i++) { //generar� el n� de l�neas indicadas en la variable lineas
				Random ascii = new Random(); 
				Random numeroLetras = new Random();
				int longitud = numeroLetras.nextInt(8)+7; //genera una cadena de texto con letras aleatorias con un m�nimo de 7 letras y un m�ximo de 15
				String cadena = "";
				for (int o = 0; o < longitud; o++) {
					char  letra = (char) (ascii.nextInt(26) + 97); //genera un caracter que se encuentre entre la posici�n 97 y 122 en el c�digo ascii
					cadena += letra; //a�ade ese caracter a la cadena de texto
				}
				raf = new RandomAccessFile(archivo, "rwd"); //Creamos un acceso al archivo
				//while ((bloqueo=raf.getChannel().tryLock()) == null); //Intenta desbloquear el archivo, si no puede se queda en espera
				bloqueo=raf.getChannel().lock(); //Se queda a la espera para desbloquear el archivo
				while (raf.readLine() != null); //Se mueve al final del archivo				
				if (raf.getFilePointer() == 0) { //Si est� en la posici�n del primer caracter no a�ade salto de l�nea al principio
					raf.writeBytes(cadena);
				}else {
					raf.writeBytes("\r\n" + cadena); //Es necesario hacerlo as� para q no a�ada un salto de l�nea al final del archivo
				}
				raf.seek(0); //Nos posiciona al principio del archivo
				bloqueo.release();//Libera el bloqueo
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (bloqueo != null) {
					bloqueo.release(); //Se libera el acceso al archivo aunque falle la aplicaci�n
				}if (raf != null) raf.close(); // Se cierra el acceso
			}catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
