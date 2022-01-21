/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author TaisBalcazar
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        int valorDos = 110;
        String cadena;
        
        cadena = obtenerEntero(valor,valorDos);
        System.out.printf("%s\n", cadena);


    }

    public static String obtenerEntero(int a, int b) {
        int[] t = new int[10];
        String cadena= ""; 
        for (int i = 0; i < t.length; i++) {
            t[i] = RandomUtils.nextInt(a, b);
        }
        for (int i = 0; i < t.length; i++) {
            cadena = String.format("%s %s", cadena, t[i]);
        }
        return cadena;

    }

}
