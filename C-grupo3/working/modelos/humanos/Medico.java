package working.modelos.humanos;

import working.modelos.Especialidade;

import java.util.Date;

public class Medico extends  Funcionario{
    public Medico(String nome, Especialidade especialidade, Date dataNascimento) {
        super(nome, especialidade, dataNascimento);
    }
}
