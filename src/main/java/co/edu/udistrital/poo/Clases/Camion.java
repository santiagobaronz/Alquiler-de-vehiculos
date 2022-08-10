package co.edu.udistrital.poo.Clases;

/**
 * Esta clase hereda de la clase Vehiculo.
 * @author Santiago Baron Zuleta, Claudia Tatiana Ospina Castiblanco, Santiago
 * Morales Ariza
 */
public class Camion extends Vehiculo {
    
    /**
     * Constructor del vehiculo del Camion
     * parent class
     * @param placa
     * @param dias
     * @param tipoVehiculo
     */
    public Camion(String placa, int dias, String tipoVehiculo) {
        super(placa, dias, tipoVehiculo);
    }

    /**
     * Este metodo calcula el precio total a pagar por el alquiler del vehiculo
     * teniendo en cuenta los parametros dados en el caso de estudio.
     * @return Retorna un String con el precio total a pagar por el alquiler.
     */

    @Override
    public String precioAlquiler(int dias) {
        double precioCamion = (50 * dias) + 40;
        String precioCamionToReturn = precioCamion+"";
        return precioCamionToReturn;
    }
    
    @Override
    public String obtenerDias(int dias){
        String diasToReturn = dias+"";
        return diasToReturn;
    }
    
}
