package working.modelos.infraestrutura;

public class Balcao {

    private int numeroBalcao;
    private Hospital hospital;

    public Balcao(int numeroBalcao, Hospital hospital) {
        this.numeroBalcao = numeroBalcao;
        this.hospital = hospital;
    }

    public int getNumeroBalcao() {
        return numeroBalcao;
    }

    public void setNumeroBalcao(int numeroBalcao) {
        this.numeroBalcao = numeroBalcao;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
