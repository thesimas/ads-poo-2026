package ads.poo;

public class Retangulo extends FormaPlana{
    private int base;
    private int altura;
    private Coordenada coordenadaFinal;

    public Retangulo(String cor, Coordenada coordenadaInicial, int base, int altura, Coordenada coordenadaFinal) {
        super(cor, coordenadaInicial);
        this.base = base;
        this.altura = altura;
        this.coordenadaFinal = coordenadaFinal;
    }

    @Override
    public String desenhar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Forma Retângulo: ").append("\n");
        sb.append("Base: ").append(base);
        sb.append("Altura: ").append(altura);
        sb.append(super.toString());
        sb.append(this);
        return sb.toString();
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Coordenada Final : [").append(coordenadaFinal.getX()).append(" , ").append(coordenadaFinal.getY()).append("]");
        return sb.toString();
    }
}
