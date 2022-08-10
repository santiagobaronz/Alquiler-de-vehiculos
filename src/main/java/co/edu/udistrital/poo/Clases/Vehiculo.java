package co.edu.udistrital.poo.Clases;

/**
 * Clase principal del objeto Vehiculo
 * @author Santiago Baron Zuleta, Claudia Tatiana Ospina Castiblanco, Santiago
 * Morales Ariza
 */
public abstract class Vehiculo {
    
    private final String tipoVehiculo;
    private final String placa;
    private final int dias;

    public String obtenerPlata(){
        return placa;
    }

    public String obtenerDias(){
        String diasToReturn = dias+"";
        return diasToReturn;
    }

    public String obtenerTipoVehiculo() {
        return tipoVehiculo;
    }
    
    public String precioAlquiler(){
        return precioAlquiler(dias);
    }

    /**
    * Este es el constructor del objeto Vehiculo.
    * @param placa Un string con la placa generada
    * @param dias Numero de dias de alquiler
    * @param tipoVehiculo String con el tipo de vehiculo
    */
    public Vehiculo(String placa, int dias, String tipoVehiculo) {
        this.placa = placa;
        this.dias = dias;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public abstract String precioAlquiler(int dias);
    public abstract String obtenerDias(int dias);
    
}
