/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha() {
        Date fecha = new Date();
        this.dia = fecha.getDay();
        this.mes = fecha.getMonth();
        this.anio = fecha.getYear();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;

   }
    public int edad (Fecha fech){
         java.util.Date fecha = new Date();
        int anioEdad = fecha.getYear()+1900 - fech.getAnio();
        
            if(fech.getMes()>fecha.getMonth()){
                anioEdad -= 1;
            }
        return anioEdad;
        
    }
    
    public int cuantoFalta (Fecha fech){
        
        Date fecha = new Date();       
        
        int x=0,d=0;
        int falta=0;
         if((fech.getAnio()%4==0)&&!(fech.getAnio()%100==0&&fech.getAnio()%400!=0)){
                x=29;
         }else{
                x=28;
         } 
  
        switch(fech.getMes())
        { 
         case 1:d=0;
         break;

         case 2:d=31;
         break;

         case 3:d=31+x;
         break;

         case 4:d=31+x+31;
         break;

         case 5:d=31+x+31+30;
         break;

         case 6:d=31+x+31+30+31;
         break;

         case 7:d=31+x+31+30+31+30; 
         break;

         case 8:d=31+x+31+30+31+30+31;
         break;

         case 9:d=31+x+31+30+31+30+31+31;
         break;

         case 10:d=31+x+31+30+31+30+31+31+30; 
         break;

         case 11:d=31+x+31+30+31+30+31+31+30+31;
         break;

         case 12:d=31+x+31+30+31+30+31+31+30+31+30; 
         break;
        } 
        int anioAct = fecha.getYear()+1900;
        falta = ((337+x)-(fech.getDia()+d)); 
        falta += (anioAct - fech.getAnio()) *365;
        System.out.println("Fecha Ingresada: "+dia+"/"+mes+"/"+anio);
        System.out.println("Faltan "+falta+" dias para finalizar el año.");
        return falta;
 
    }
    
     
}
