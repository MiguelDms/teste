package working.modelos.registos;

import working.modelos.Consulta;

public class Vaga {

    private Consulta consulta;
    private boolean disponibilidade;

    public Vaga(Consulta consulta, boolean disponibilidade) {
        this.consulta = consulta;
        this.disponibilidade = disponibilidade;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
