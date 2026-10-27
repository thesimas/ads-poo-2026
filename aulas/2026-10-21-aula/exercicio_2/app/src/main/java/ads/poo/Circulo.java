package ads.poo;

public class Circulo extends FormaPlana {
    private double raio;

    public Circulo(String cor, Coordenada coordenadaInicial, double raio) {
        super(cor, coordenadaInicial);
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "";
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circulo: ");
        sb.append(super.toString());
        sb.append("Raio: ").append(raio);
        return sb.toString();
    }
}
