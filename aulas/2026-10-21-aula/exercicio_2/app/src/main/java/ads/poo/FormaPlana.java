package ads.poo;

public abstract class FormaPlana extends Geometrica{

    public FormaPlana(String cor, Coordenada coordenadaInicial) {
        super(cor, coordenadaInicial);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
