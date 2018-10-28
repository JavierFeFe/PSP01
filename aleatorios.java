/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Javier Fernández Ferrol
 */
public class aleatorios {
    public static void main(String[] args) {
        if (args.length == 1 && args[0].matches("\\d\\d*")){ //Comprueba que solo se introduzca un parámetro y sea un número
            int repeticiones = Integer.parseInt(args[0]); //Repeticiones del parámetro 1
            Random aleatorio = new Random(); //Creo un objeto Random que genera un nº aleatorio entre 0 y el nº indicado
            for (int i=0; i<repeticiones; i++){ //Bucle de repeticiones
                System.out.println(aleatorio.nextInt(100) + 1); //Muestra por pantalla un nº aleatorio 1 y 100 (inclusive)
            }
        }else{
            System.out.println("Parámetros incorrectos"); //Muestra por pantalla el error
        }
    }
}

