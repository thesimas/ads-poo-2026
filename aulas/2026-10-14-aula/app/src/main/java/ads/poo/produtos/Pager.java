package ads.poo.produtos;

public class Pager extends Produto{
    private int numeroBotoes;

    public Pager(int codigo, String numSerie, Double peso, int altura, int largura, int profundidade, int numeroBotoes) {
        super(codigo, numSerie, peso, altura, largura, profundidade);
        this.numeroBotoes = numeroBotoes;
    }

    public int getNumeroBotoes() {
        return numeroBotoes;
    }

    public void setNumeroBotoes(int numeroBotoes) {
        this.numeroBotoes = numeroBotoes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("** Pager **");
        sb.append("Número Botoes: ").append(numeroBotoes);
        return sb.toString();
    }
}
