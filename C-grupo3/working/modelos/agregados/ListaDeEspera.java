package working.modelos.agregados;

import working.modelos.humanos.Utente;

import java.util.ArrayList;
import java.util.List;

public class ListaDeEspera {

    private List<Utente> listaDeEspera;

    public ListaDeEspera(List<Utente> listaDeEspera) {
        this.listaDeEspera = new ArrayList<>();
    }
}
