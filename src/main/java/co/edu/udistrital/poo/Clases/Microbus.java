package co.edu.udistrital.poo.Clases;

/**
 *  Esta clase hereda de la clase Vehiculo.
 * @author Santiago Baron Zuleta, Claudia Tatiana Ospina Castiblanco, Santiago
 * Morales Ariza
 */
public class Microbus extends Vehiculo{
    
    
    /**
     * Constructor del vehiculo de microbus
     * parent class
     * @param placa
     * @param dias
     * @param tipoVehiculo
     */
    public Microbus(String placa, int dias, String tipoVehiculo) {
        super(placa, dias, tipoVehiculo);
    }

    /**
     * Este metodo calcula el precio total a pagar por el alquiler del vehiculo
     * teniendo en cuenta los parametros dados en el caso de estudio.
     * @param dias
     * @return Retorna un String con el precio total a pagar por el alquiler.
     */

    @Override
    public String precioAlquiler(int dias) {
        double precioBus = (50 * dias) + 2;
        String precioBusToReturn = precioBus+"";
        return precioBusToReturn;
    }
    
    @Override
    public String obtenerDias(int dias){
        String diasToReturn = dias+"";
        return diasToReturn;
    }
    
}
