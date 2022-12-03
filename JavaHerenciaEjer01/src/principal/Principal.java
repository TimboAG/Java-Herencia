package principal;

import entidad.CaballoEntidad;
import entidad.GatoEntidad;
import entidad.PerroEntidad;
import servicio.ServicioAnimales;

public class Principal {

    public static void main(String[] args) {
        ServicioAnimales miAnimales = new ServicioAnimales();
        CaballoEntidad miCaballo = miAnimales.crearCaballo();
        GatoEntidad miGato = miAnimales.crearGatoo();
        PerroEntidad miPerro = miAnimales.crearPerro();
        miAnimales.mostrar(miPerro, miGato, miCaballo);
    }
}
