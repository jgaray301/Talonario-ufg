package service;

import java.util.ArrayList;
import model.Talonario;

public class TalonarioService {

    ArrayList<Talonario> lista = new ArrayList<Talonario>();

    public void guardar(Talonario t) {
        lista.add(t);
    }

    public void mostrarTodos() {

        if (lista.size() == 0) {
            System.out.println("No hay talonarios registrados");
        } else {

            for (Talonario t : lista) {
                t.mostrar();
            }

        }

    }

}