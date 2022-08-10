package co.edu.udistrital.poo.Clases;

/**
 * Esta clase hereda de la clase Vehiculo.
 * @author Santiago Baron Zuleta, Claudia Tatiana Ospina Castiblanco, Santiago
 * Morales Ariza
 */
public class Carro extends Vehiculo{
    
    
    /**
     * Constructor del vehiculo del carro
     * parent class
     * @param placa
     * @param dias
     * @param tipoVehiculo
     */
    public Carro(String placa, int dias, String tipoVehiculo) {
        super(placa, dias, tipoVehiculo);
    }

    /**
     * This method calculates the renting price of a Car type of vehicle, the
     * method overrides since it is an abstract method of the parent class
     * @return This returns a double value which represents the renting price of
     * the vehicle
     */

    @Override
    public String precioAlquiler(int dias) {
        double precioCarro = (50 * dias) + (1.5 * dias);
        String precioCarroToReturn = precioCarro+"";
        return precioCarroToReturn;
    }
    
    @Override
    public String obtenerDias(int dias){
        String diasToReturn = dias+"";
        return diasToReturn;
    }
    
}
