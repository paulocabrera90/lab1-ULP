/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Usuario
 */
public class Numero {
    private int numero;
    private String color;
    private String docena;
    private boolean paridad;

    public Numero(int numero, String color, String docena, boolean paridad) {
        this.numero = numero;
        this.color = color;
        this.docena = docena;
        this.paridad = paridad;
    }
    
     public Numero() {
        this.numero = 0;
        this.color = "";
        this.docena = "";
        this.paridad = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    public String getDocena() {
        return docena;
    }

    public void setDocena(String docena) {
        this.docena = docena;
    }

    public boolean isParidad() {
        return paridad;
    }

    public void setParidad(boolean paridad) {
        this.paridad = paridad;
    }
    
    public boolean paridad(int numero){
        return (numero%2==0);
    }
    
    public String cualDocena(int numero){
       
        String docena = "";
        if (numero >= 1 && numero <= 12){
            docena= "Primera Docena";
        }else if (numero >= 13 && numero <= 24){
            docena = "Segunda Docena";
        }else{
             docena = "Tercera Docena";
        }
        return docena;
    }
}
