package servicio;

import entidad.CaballoEntidad;
import entidad.GatoEntidad;
import entidad.PerroEntidad;

public class ServicioAnimales {

    public CaballoEntidad crearCaballo() {
        CaballoEntidad miCaballo = new CaballoEntidad();
        miCaballo.setEdad(10);
        miCaballo.setNombre("nombre Caballo");
        miCaballo.setRaza("raza Caballo");
        miCaballo.setAlimento("alimento Caballo");
        return miCaballo;
    }

    public GatoEntidad crearGatoo() {
        GatoEntidad miGato = new GatoEntidad();
        miGato.setEdad(10);
        miGato.setNombre("nombre Gato ");
        miGato.setRaza("raza Gato ");
        miGato.setAlimento("alimento Gato ");
        return miGato;
    }

    public PerroEntidad crearPerro() {
        PerroEntidad miPerro = new PerroEntidad();
        miPerro.setEdad(10);
        miPerro.setNombre("nombre Perro ");
        miPerro.setRaza("raza Perro ");
        miPerro.setAlimento("alimento Perro ");
        return miPerro;
    }

    public void mostrar(PerroEntidad miPerro, GatoEntidad miGato, CaballoEntidad miCaballo) {
        miPerro.alimentar();
        miGato.alimentar();
        miCaballo.alimentar();
    }

}
