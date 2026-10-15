package ads.poo;

public class Dimensao {
    private int altura;
    private int largura;
    private int profundidade;

    public Dimensao(int altura, int largura, int profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("** Classe Dimensao: **\n");
        sb.append("\tAltura: ").append(altura).append("\n");
        sb.append("\tLargura: ").append(largura).append("\n");
        sb.append("\tProfundidade: ").append(profundidade).append("\n");
        return sb.toString();
    }
}
