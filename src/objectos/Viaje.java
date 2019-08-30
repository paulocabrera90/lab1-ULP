/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Viaje {
    
    private String lugar_origen;
    private double origen;
    private String lugar_destino;
    private double destino;
    private double dist_entreCiudad;
    private int cant_peajes;
    private String tipo_combustibleVehiculo;
    private String tipo_vehiculo;
    private double costoViaje;
    private boolean mismaRuta;
    private double costoTotal;
    
    
    private double  COSTO_NAFTA = 45.0;
    private double COSTO_GASOIL = 41.7;

    public Viaje(String lugar_origen, double origen, String lugar_destino, double destino, String dist_entreCiudad, int cant_peajes, String tipo_combustibleVehiculo, String tipo_vehiculo, double costoViaje, boolean mismaRuta, double costoTotal) {
       
        
         this.lugar_origen = lugar_origen;
        this.origen = origen;
        this.lugar_destino = lugar_destino;
        this.destino = destino;
        this.cant_peajes = cant_peajes;
        this.tipo_combustibleVehiculo = tipo_combustibleVehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
        this.costoViaje = costoViaje;
        this.mismaRuta = mismaRuta;
        this.costoTotal = costoTotal;
        
    } 
    
    public Viaje(String lugar_origen, double origen, String lugar_destino, double destino,  String tipo_combustibleVehiculo, String tipo_vehiculo, boolean mismaRuta) {
       
        
        this.lugar_origen = lugar_origen;
        this.origen = origen;
        this.lugar_destino = lugar_destino;
        this.destino = destino;
        this.tipo_combustibleVehiculo = tipo_combustibleVehiculo;
        this.tipo_vehiculo = tipo_vehiculo;
        this.mismaRuta = mismaRuta;
        
    }
    
    public Viaje() {
        
        this.lugar_origen = "";
        this.origen = 0.0;
        this.lugar_destino = "";
        this.destino = 0.0;
        this.dist_entreCiudad = 0.0;
        this.dist_entreCiudad = 0.0;
        this.cant_peajes = 0;
        this.tipo_combustibleVehiculo = "";
        this.tipo_vehiculo = "";
        this.costoViaje = 0.0;
        this.mismaRuta = false;
        this.costoTotal = 0.0;
    }
    
    
    
    /**
     * @return the lugar_origen
     */
    public String getLugar_origen() {
        return lugar_origen;
    }

    /**
     * @param lugar_origen the lugar_origen to set
     */
    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    /**
     * @return the origen
     */
    public double getOrigen() {
        return origen;
    }
    

    /**
     * @param origen the origen to set
     */
    public void setOrigen(double origen) {
        this.origen = origen;
    }

    /**
     * @return the lugar_destino
     */
    public String getLugar_destino() {
        return lugar_destino;
    }

    /**
     * @param lugar_destino the lugar_destino to set
     */
    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    /**
     * @return the destino
     */
    public double getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(double destino) {
        this.destino = destino;
    }

    /**
     * @return the dist_entreCiudad
     */
    public double getDist_entreCiudad() {
        return dist_entreCiudad;
    }

    /**
     * @param dist_entreCiudad the dist_entreCiudad to set
     */
    public void setDist_entreCiudad(double dist_entreCiudad) {
        this.dist_entreCiudad = dist_entreCiudad;
    }

    /**
     * @return the cant_peajes
     */
    public int getCant_peajes() {
        return cant_peajes;
    }

    /**
     * @param cant_peajes the cant_peajes to set
     */
    public void setCant_peajes(int cant_peajes) {
        this.cant_peajes = cant_peajes;
    }

    /**
     * @return the tipo_combustibleVehiculo
     */
    public String getTipo_combustibleVehiculo() {
        return tipo_combustibleVehiculo;
    }

    /**
     * @param tipo_combustibleVehiculo the tipo_combustibleVehiculo to set
     */
    public void setTipo_combustibleVehiculo(String tipo_combustibleVehiculo) {
        this.tipo_combustibleVehiculo = tipo_combustibleVehiculo;
    }

    /**
     * @return the tipo_vehiculo
     */
    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    /**
     * @param tipo_vehiculo the tipo_vehiculo to set
     */
    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    /**
     * @return the costoViaje
     */
    public double getCostoViaje() {
        return costoViaje;
    }

    /**
     * @param costoViaje the costoViaje to set
     */
    public void setCostoViaje(double costoViaje) {
        this.costoViaje = costoViaje;
    }

    /**
     * @return the mismaRuta
     */
    public boolean isMismaRuta() {
        return mismaRuta;
    }

    /**
     * @param mismaRuta the mismaRuta to set
     */
    public void setMismaRuta(boolean mismaRuta) {
        this.mismaRuta = mismaRuta;
    }
    
    public double costoPeajes(int cantPeajes, String tipVehiculo){
        
        if(tipVehiculo.equals("auto")){
            return cantPeajes*25.0;
        }else if (tipVehiculo.equals("camioneta")){
            return cantPeajes*30.0;
        }else{
            return cantPeajes*35.0;
        }
       
    }
    public double distanciaCiudad (){
        return Math.abs(this.destino - this.origen);
    }

    /**
     * @return the costoTotal
     */
    public double getCostoTotal() {
        return costoTotal;
    }

    /**
     * @param costoTotal the costoTotal to set
     */
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    public double costoCombustible(String tipVehiculo, String tipCombustible, double km){
        double costoCom; 
        
        if(tipCombustible.equals("nafta")){
            if(tipVehiculo.equals("auto")){
                
                costoCom =((km/100)*7)* COSTO_NAFTA;
            }else if (tipVehiculo.equals("camioneta")){
                costoCom =((km/100)*10)* COSTO_NAFTA;
            }else{
                costoCom =((km/100)*12)* COSTO_NAFTA;
            }
        }else{
             if(tipVehiculo.equals("auto")){
                costoCom =((km/100)*7)* COSTO_GASOIL;
            }else if (tipVehiculo.equals("camioneta")){
                costoCom =((km/100)*10)* COSTO_GASOIL;
            }else{
                costoCom =((km/100)*12)* COSTO_GASOIL;
            }
        }
        return costoCom;
    }
    
    public void costoViaje(double costosPeajes, double costoCombus){
        
       this.costoViaje = costosPeajes + costoCombus;
    }
            
}
