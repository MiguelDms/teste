package working.modelos.humanos;

import java.util.Date;

public class Utente {

    private String nome;
    private Date dataNascimento;
    private String numeroCC;
    private long nif;
    private String email;

    public Utente(String nome, Date dataNascimento, String numeroCC, long nif, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroCC = numeroCC;
        this.nif = nif;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
