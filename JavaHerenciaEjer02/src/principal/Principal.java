package principal;

import entidad.Electrodomestico;
import java.util.ArrayList;
import servicio.Todos;

public class Principal {

    public static void main(String[] args) {
        Todos miTodos = new Todos();
        ArrayList<Electrodomestico> miArray = miTodos.crearTodosArreglo();
        miTodos.mostrar(miArray);
    }
}
