package entidad;

public class Polideportivo extends Edificio {

    protected String nombre;
    protected String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", instalacion=" + instalacion + super.toString() + '}';
    }

}
