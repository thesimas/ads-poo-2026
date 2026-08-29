package ads.poo;

public class Ponto {
    private int eixoX;
    private int eixoY;

    public Ponto(int eixoX, int eixoY) {
        this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public double distancia(Ponto ponto){
        double calculo1 = Math.pow((ponto.eixoX - this.eixoX), 2);
        double calculo2 = Math.pow((ponto.eixoY - this.eixoY), 2);

        return Math.sqrt(calculo1 + calculo2);
    }

    public int getEixoX() {
        return eixoX;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Localização do Ponto: ");
        sb.append("(").append(eixoX);
        sb.append(", ").append(eixoY);
        sb.append(");");
        return sb.toString();
    }
}
