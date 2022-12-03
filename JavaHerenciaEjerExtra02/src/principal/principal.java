package principal;

import entidad.Edificio;
import java.util.ArrayList;
import servicio.Todo;

public class principal {

    public static void main(String[] args) {
        Todo miTodo = new Todo();
        ArrayList<Edificio> miArray = miTodo.crearTodosArreglo();
        miTodo.mostrar(miArray);
    }

}
