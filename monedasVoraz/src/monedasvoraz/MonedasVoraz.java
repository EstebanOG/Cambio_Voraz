/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasvoraz;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MonedasVoraz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cambio cambio = new Cambio();
        double[] costoMonedas = new double[8];
        costoMonedas[0] = 1;
        costoMonedas[1] = 2;
        costoMonedas[2] = 5;
        costoMonedas[3] = 10;
        costoMonedas[4] = 20;
        costoMonedas[5] = 50;
        costoMonedas[6] = 100;
        costoMonedas[7] = 200;
        double monto;
        int[] solucion;
        System.out.print("Introduzca el monto a devolver: ");
        monto = sc.nextDouble();
        /**
         * Se multiplica por 100 el decimal ingresado y luego se redondea.
         */
        monto = Math.round(monto * 100);
        
        solucion = cambio.devolverCambio(monto, costoMonedas);
        
        System.out.println("Cantidad de monedas:");
        
        /**
         * Se imprime la solución del ejercicio, recorriendo el arreglo solución
         * e imprimiendo la cantidad de monedas junto a su valor
         */
        int numMonedas = 0;
        for (int i = 0; i < solucion.length; i++) {
            if (solucion[i] != 0) {
                System.out.println("Valor: " + costoMonedas[i]/100 +" Euros"+ " Número de monedas:" + solucion[i]);
                numMonedas += solucion[i]; 
            }
        }
        
        System.out.println("Número de monedas total:"+ numMonedas);
    }

}
