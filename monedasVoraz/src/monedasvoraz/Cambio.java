/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monedasvoraz;

/**
 *
 * @author Usuario
 */
public class Cambio {
    
    public Cambio(){
        
    }
    
    public int[] devolverCambio(double monto, double[] costoMonedas){
        /**
         * x: Arreglo que guarda la cantidad de monedas de cada tipo.
         * Su tamaño es el mismo que arreglo que guarda el costo de cada moneda,
         * al cual llamamos costoMonedas
         */
        int[] x = new int [costoMonedas.length];
        
        /**
         * Se inicializa el arreglo x con todos sus campos en 0. 
         */
        for(int i = 0; i < x.length; i++){
            x[i] = 0;
        }
        
        /**
         * act: Guarda el valor actual del cambio.
         */
        double act = 0;
        int j = x.length-1;
        
        while(act != monto){
            while(costoMonedas[j]>(monto - act) && j>0){
                j = j-1;
            }
            if(j==0){
                return new int[0];
            }
            x[j] = (int)((monto-act)/costoMonedas[j]);
            act = act + costoMonedas[j]*x[j];
        }
        return x;
    }
}
