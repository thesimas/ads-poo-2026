package ads.poo;

public abstract class Geometrica {
    private String cor;
    private Coordenada coordenadaInicial;

    public Geometrica(String cor, Coordenada coordenadaInicial) {
        this.cor = cor;
        this.coordenadaInicial = coordenadaInicial;
    }

    public abstract String desenhar();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Coordenada getCoordenadas() {
        return coordenadaInicial;
    }

    public void setCoordenadas(Coordenada coordenadas) {
        this.coordenadaInicial = coordenadas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("com a cor ").append(cor).append('\n');
        sb.append("Coordenada Inicial: [").append(coordenadaInicial.getX()).append(" , ").append(coordenadaInicial.getY()).append("]");
        return sb.toString();
    }
}
