package principal;

import entidad.Circulo;
import entidad.Rectangulo;

public class principal {

    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(12, 23);
        System.out.println(miCirculo.area());
        System.out.println(miCirculo.perimetro());
        System.out.println(miCirculo.toString());
        Rectangulo miRectangulo = new Rectangulo(12, 23);
        System.out.println(miRectangulo.area());
        System.out.println(miRectangulo.perimetro());
        System.out.println(miRectangulo.toString());
    }
}
