package ads.poo;

public class Motor {
    private ETipoMotor tipo;
    private boolean status = false;
    private int rotacao = 0;

    public Motor(ETipoMotor tipo, boolean status, int rotacao) {
        this.tipo = tipo;
        this.status = status;
        this.rotacao = rotacao;
    }

    public String formata(){
        if(this.status){
            return "Ligado";
        }
        return "Desligado";
    }

    public Motor(ETipoMotor tipo) {
        this.tipo = tipo;
    }

    public ETipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(ETipoMotor tipo) {
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
