package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    private double coordenadaX;
    private double coordenadaY;

    public CartaGrafica(Valor valor, Naipe naipe, double coordenadaX, double coordenadaY) {
        super(valor, naipe);
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carta Gráfica");
        Draw draw = new Draw();
        draw.picture(.5, .5, "cartas/cartas/" + super.retornaInformacao());
        draw.setTitle("Carta Gráfica " + super.getNaipe());
        return sb.toString();
    }
}
