package servicio;

import entidad.Electrodomestico;
import java.util.Scanner;

public class ElectServicio {

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double precio = 1000;
        System.out.println("Ingrese el color");
        String color = leer.next();
        System.out.println("Ingrese el consumo Energetico");
        String consumoEnergetico = leer.next();
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        Electrodomestico miElect = new Electrodomestico(precio, color, consumoEnergetico, peso);
        return miElect;
    }

    public void mostrar(Electrodomestico e) {
        System.out.println(e);
    }
}
