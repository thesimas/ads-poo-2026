package ads.poo;

public abstract class Geometrica {
    private String cor;
    private Coordenada coordenadas;
    private double raio;

    public Geometrica(String cor, Coordenada coordenadas, double raio) {
        this.cor = cor;
        this.coordenadas = coordenadas;
        this.raio = raio;
    }

    public StringBuilder desenhar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cor da linha: ").append(cor).append("\n");
        sb.append("Raio: ").append()
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Coordenada getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenada coordenadas) {
        this.coordenadas = coordenadas;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
