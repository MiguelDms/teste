package working.modelos.humanos;

import working.modelos.Especialidade;

import java.util.Date;

public class Funcionario {

    private String nome;
    private Especialidade especialidade;
    private Date dataNascimento;

    public Funcionario(String nome, Especialidade especialidade, Date dataNascimento) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.dataNascimento = dataNascimento;
    }
}
