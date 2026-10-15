package ads.poo.produtos;

public class Telefone extends Produto{
    private ETipo tipo;

    public Telefone(int codigo, String numSerie, Double peso, int altura, int largura, int profundidade, ETipo tipo) {
        super(codigo, numSerie, peso, altura, largura, profundidade);
        this.tipo = tipo;
    }

    public ETipo getTipo() {
        return tipo;
    }

    public void setTipo(ETipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("** Telefone **");
        sb.append("Tipo: ").append(tipo);
        return sb.toString();
    }
}
