/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiconr1ejer2;

import objetos.Numero;

/**
 *
 * @author Usuario EJERCICIO 2 TABLERO
 */
public class PracticoNr1Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Numero numTab = new Numero();
         int numero = (int) Math.floor(Math.random()*36+1);
         numTab.setNumero(numero);
         if (numTab.paridad(numero)){
             System.out.println("El numero es PAR");
         }else{
             System.out.println("El numero es IMPAR");
         }
         numTab.setDocena(numTab.cualDocena(numero));
         System.out.println("El numero q salio pertence " + numTab.getDocena());

         System.out.println("El numero q salio es " + numTab.getNumero());
         
         
    }
    
}
