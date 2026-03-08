package repository;

import java.util.ArrayList;
import model.Talonario;

public class TalonarioRepository {

    private ArrayList<Talonario> lista = new ArrayList<>();

    public void guardar(Talonario t) {
        lista.add(t);
    }

    public ArrayList<Talonario> listar() {
        return lista;
    }

}