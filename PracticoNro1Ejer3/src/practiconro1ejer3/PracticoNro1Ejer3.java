/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiconro1ejer3;

import objetos.Fecha;

/**
 *
 * @author Usuario
 */
public class PracticoNro1Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha fec = new Fecha(25, 8, 2018);
        fec.cuantoFalta(fec);
        
        //edad---
         Fecha fecEdad = new Fecha(31, 9, 1990);
        fec.cuantoFalta(fec);
        System.out.println("Mi edad es : " + fecEdad.edad(fecEdad));
    }
    
}
