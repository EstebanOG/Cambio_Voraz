/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasvoraz;

import java.util.Arrays;
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
        costoMonedas[0] = 0.01;
        costoMonedas[1] = 0.02;
        costoMonedas[2] = 0.05;
        costoMonedas[3] = 0.1;
        costoMonedas[4] = 0.2;
        costoMonedas[5] = 0.5;
        costoMonedas[6] = 1.0;
        costoMonedas[7] = 2.0;
        double monto;
        int[] solucion;
        System.out.print("Introduzca el monto a devolver: ");
        monto = sc.nextDouble();
        solucion = cambio.devolverCambio(monto, costoMonedas);
        System.out.println("Cantidad de monedas:");
        for(int i = 0; i < solucion.length;i++){
            System.out.println("Valor: "+costoMonedas[i]+" Número de monedas:"+solucion[i]);
        }
       
    }

}
