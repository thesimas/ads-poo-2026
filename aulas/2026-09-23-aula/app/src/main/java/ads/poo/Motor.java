package ads.poo;

public class Motor {
    private int cavalo;
    private int giroAtual;
    private int cilindros;

    public Motor() {
    }

    public void acelerar(int valor){
        this.giroAtual += valor;
    }

    public int getCavalo() {
        return cavalo;
    }

    public void setCavalo(int cavalo) {
        this.cavalo = cavalo;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}
