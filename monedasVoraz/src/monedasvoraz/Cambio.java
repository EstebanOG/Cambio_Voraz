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
        
        /**
         * Se iguala j al numero de posiciones-1 del arreglo x, para poder hacer
         * el recorrido de atrás hacia adelante.
         */
        int j = x.length-1;
        
        while(act != monto){
            /**
             * Se verifica si el costo de la moneda a evaluar sobre pasa el valor
             * del monto menos el actual, en caso de ser verdadero, se omite este
             * valor y se evalua el siguiente costo.
             */
            while(costoMonedas[j]>(monto - act) && j>0){
                j = j-1;
            }
            
            /**
             * Se obtiene el número de monedas del valor que estamos evaluando y
             * se agregan al arreglo solución X, luego se actualiza el valor actual.
             */
            x[j] = (int)((monto-act)/costoMonedas[j]);
            act = act + costoMonedas[j]*x[j];
        }
        
        /**
         * Se retorna el arreglo solución.
         */
        return x;
    }
}
