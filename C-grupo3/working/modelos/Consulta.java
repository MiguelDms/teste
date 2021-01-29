package working.modelos;

import working.modelos.humanos.Medico;
import working.modelos.humanos.Utente;
import working.modelos.infraestrutura.Sala;

import java.util.Date;

public class Consulta {

    private long numero;
    private Utente utente;
    private Date horaDeInicio;
    private Date horaDeFim;
    private Medico medico;
    private Sala sala;

    public Consulta(long numero, Utente utente, Date horaDeInicio, Date horaDeFim, Medico medico, Sala sala) {
        this.numero = numero;
        this.utente = utente;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFim = horaDeFim;
        this.medico = medico;
        this.sala = sala;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Date getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(Date horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public Date getHoraDeFim() {
        return horaDeFim;
    }

    public void setHoraDeFim(Date horaDeFim) {
        this.horaDeFim = horaDeFim;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}


