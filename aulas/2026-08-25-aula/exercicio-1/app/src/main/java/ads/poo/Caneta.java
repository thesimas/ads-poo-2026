package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;
    private final double CONSUMO = 0.01;

    public Caneta(String cor, double nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(int nivelTinta) {
        setCor(new Caneta().cor);
        this.nivelTinta = nivelTinta;
    }

    public Caneta() {
        this.cor = "Azul";
        this.nivelTinta = 100;
    }

    private double calcular(int x1, int y1, int x2, int y2){
        double caluloX = Math.pow((x2 - x1), 2);
        double caluloY = Math.pow((y2 - y1), 2);

        return Math.sqrt(caluloX + caluloY);
    }

    public double desenhar(int x1, int y1, int x2, int y2){
        double distancia = calcular(x1, y1, x2, y2);
        double consumo = distancia * this.CONSUMO;

        if(this.nivelTinta >= consumo){
            this.nivelTinta -= consumo;
            return consumo;
        }

        return -1;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor.toUpperCase();
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Informações da Caneta:\n");
        sb.append("Cor: ").append(cor).append("\n");
        sb.append("Nivel de Tinta: ").append(String.format("%.0f", nivelTinta)).append("%\n");
        return sb.toString();
    }
}
