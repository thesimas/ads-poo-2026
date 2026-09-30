package ads.poo;

public class Motor {
    private Etipo tipo;
    private boolean status = false;
    private int rotacao = 0;

    public Motor(Etipo tipo, boolean status, int rotacao) {
        this.tipo = tipo;
        this.status = status;
        this.rotacao = rotacao;
    }

    public Motor(Etipo tipo) {
        this.tipo = tipo;
    }

    public Etipo getTipo() {
        return tipo;
    }

    public void setTipo(Etipo tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRotacao() {
        return rotacao;
    }

    public void setRotacao(int rotacao) {
        this.rotacao = rotacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Tipo: ").append(tipo).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Rotação: ").append(rotacao);
        return sb.toString();
    }
}
