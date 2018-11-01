package Ejercicio1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;   
import java.util.ArrayList;
import java.util.Collections;



/**
 *
 * @author Javier Fernández Ferrol
 */
public class ordenarNumeros {

    public static void main(String[] args) {

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
    }
}
