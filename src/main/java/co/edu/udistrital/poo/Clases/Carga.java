package co.edu.udistrital.poo.Clases;

/**
 * Esta clase hereda de la clase Vehiculo.
 * @author Santiago Baron Zuleta, Claudia Tatiana Ospina Castiblanco, Santiago
 * Morales Ariza
 */
public class Carga extends Vehiculo{

    /**
     * Constructor del vehiculo de Carga
     * parent class
     * @param placa
     * @param dias
     * @param tipoVehiculo
     */
    public Carga(String placa, int dias, String tipoVehiculo) {
        super(placa, dias, tipoVehiculo);
    }

    /**
     * Este metodo calcula el precio total a pagar por el alquiler del vehiculo
     * teniendo en cuenta los parametros dados en el caso de estudio.
     * @return Retorna un String con el precio total a pagar por el alquiler.
     */

    @Override
    public String precioAlquiler(int dias) {
        double precioCarga = (50 * dias) + (20 * 18);
        String precioCargaToReturn = precioCarga+"";
        return precioCargaToReturn;
    }
    
    @Override
    public String obtenerDias(int dias){
        String diasToReturn = dias+"";
        return diasToReturn;
    }
    
}
