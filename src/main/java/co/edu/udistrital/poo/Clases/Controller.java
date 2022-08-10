package co.edu.udistrital.poo.Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Controlador que gestiona las peticiones entre la interfaz y las clases
 * @author Santiago Baron Zuleta, Claudia Tatiana Ospina Castiblanco, Santiago
 * Morales Ariza
 */
public class Controller {
    
    public static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    
    public static String generarPlaca() {

        char placa[] = new char[9];
        placa[0] = generarConsonante();
        placa[1] = generarConsonante();
        placa[2] = generarVocal();
        placa[3] = '-';
        placa[4] = generarNumero();
        placa[5] = generarNumero();
        placa[6] = generarNumero();
        placa[7] = '-';
        placa[8] = generarVocal();

        return String.valueOf(placa);
    }

    public static char generarConsonante() {
        return generarRandomChar("BCDFGHJKLMNPQRSTVWXYZ");
    }

    public static char generarVocal() {
        return generarRandomChar("AEIOU");
    }

    public static char generarNumero() {
        return generarRandomChar("0123456789");
    }

    private static char generarRandomChar(String str) {
        char caracteres[] = str.toCharArray();
        int index = (int) (Math.random() * caracteres.length);
        return caracteres[index];
    }
        
    /**
     * Metodo para revisar el tipo de vehiculo y guardarlo según su tipo
     * parent class
     * @param diasUso Numero de los dias de uso de un vehiculo
     * @param tipoVehiculo String del tipo de vehiculo
     */
    public void guardarVehiculo(String tipoVehiculo, int diasUso){
        
        if(diasUso > 0){
            switch(tipoVehiculo){
                case("Carro") -> {
                    Vehiculo carro = new Carro(generarPlaca(), diasUso, tipoVehiculo);
                    listaVehiculos.add(carro);
                    JOptionPane.showMessageDialog(null, "Carro guardado");
                }

                case("Microbus") -> {
                    Vehiculo microbus = new Microbus(generarPlaca(), diasUso, tipoVehiculo);
                    listaVehiculos.add(microbus);
                    JOptionPane.showMessageDialog(null, "Microbus guardado");
                }

                case("Vehiculo de carga") -> {
                    Vehiculo carga = new Carga(generarPlaca(), diasUso, tipoVehiculo);
                    listaVehiculos.add(carga);
                    JOptionPane.showMessageDialog(null, "Vehiculo de carga guardado");
                }

                case("Camion") -> {
                    Vehiculo camion = new Camion(generarPlaca(), diasUso, tipoVehiculo);
                    listaVehiculos.add(camion);
                    JOptionPane.showMessageDialog(null, "Camiones guardado");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un número válido de días");
        }
    }
}
