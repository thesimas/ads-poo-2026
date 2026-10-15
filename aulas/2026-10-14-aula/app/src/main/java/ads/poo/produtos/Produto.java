package ads.poo.produtos;

import ads.poo.Dimensao;

public abstract class Produto {
    private int codigo;
    private String numSerie;
    private Double peso;
    private Dimensao dimensao;

    public Produto(int codigo, String numSerie, Double peso, int altura, int largura, int profundidade) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.peso = peso;
        this.dimensao = new Dimensao(altura, largura, profundidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n** Super Classe Produto: **\n");
        sb.append("\tCodigo: ").append(codigo).append("\n");
        sb.append("\tNúmero de Série: ").append(numSerie).append("\n");
        sb.append("\tPeso: ").append(peso).append("\n");
        sb.append(dimensao);
        return sb.toString();
    }
}
