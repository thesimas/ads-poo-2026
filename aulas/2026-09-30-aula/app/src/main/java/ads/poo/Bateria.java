package ads.poo;

public class Bateria {
    private int voltagem;
    private int carga;

    public Bateria(int voltagem, int carga) {
        this.voltagem = voltagem;
        this.carga = carga;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Voltagem: ").append(voltagem);
        sb.append("Carga: ").append(this.carga);
        return sb.toString();
    }
}
