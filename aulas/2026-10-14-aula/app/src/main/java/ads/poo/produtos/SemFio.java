package ads.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, Double peso, int altura, int largura, int profundidade, ETipo tipo, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, peso, altura, largura, profundidade, tipo);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\t** Classe Sem Fio: **\n");
        sb.append("\t\tFrequencia: ").append(frequencia).append("\n");
        sb.append("\t\tCanais: ").append(canais).append("\n");
        sb.append("\t\tDistância Operacao: ").append(distanciaOperacao).append("\n\t");
        return sb.toString();
    }
}
