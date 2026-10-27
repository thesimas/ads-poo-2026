package ads.poo;

public class Linha extends Geometrica{
    private Coordenada coordenadaFinal;

    public Linha(String cor, Coordenada coordenadaInicial, Coordenada coordenadaFinal) {
        super(cor, coordenadaInicial);
        this.coordenadaFinal = coordenadaFinal;
    }

    @Override
    public String desenhar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Desenhanho Linha").append("\n");
        sb.append(super.toString()).append("\n");
        sb.append(this);
        return sb.toString();
    }

    public Coordenada getCoordenadaFinal() {
        return coordenadaFinal;
    }

    public void setCoordenadaFinal(Coordenada coordenadaFinal) {
        this.coordenadaFinal = coordenadaFinal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Coordenada Final: [").append(coordenadaFinal.getX()).append(" , ").append(coordenadaFinal.getY()).append("]");
        return sb.toString();
    }
}
