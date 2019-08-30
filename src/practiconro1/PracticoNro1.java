/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiconro1;

import objectos.Viaje;

/**
 *
 * @author Usuario
 */
public class PracticoNro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Viaje viajePrimer = new Viaje("San Luis",12,"Mendoza", 300, "nafta", "auto", true);
        if(viajePrimer.isMismaRuta()){
            System.out.println("Las Ciudades estan en la misma ruta");
            //Calcular combustible
            viajePrimer.setDist_entreCiudad(viajePrimer.distanciaCiudad());

            //Calcular combustible
            viajePrimer.setCant_peajes(3);
            double costoPeajes = viajePrimer.costoPeajes(viajePrimer.getCant_peajes(), viajePrimer.getTipo_vehiculo());

            //Calcular combustible
            double dist_entreCiudad = viajePrimer.getDist_entreCiudad();
            String tipo_vehiculo = viajePrimer.getTipo_vehiculo();
            String tipo_combustibleVehiculo = viajePrimer.getTipo_combustibleVehiculo();
            double costoCombustible = viajePrimer.costoCombustible(tipo_vehiculo, tipo_combustibleVehiculo, dist_entreCiudad);

            viajePrimer.costoViaje(costoCombustible,  costoPeajes);

            System.out.println("El costo total es de " + viajePrimer.getCostoViaje());
  
        }else{
             System.out.println("No se puede calcular ya que estan en distintas rutas");
        }

    }
    
}
