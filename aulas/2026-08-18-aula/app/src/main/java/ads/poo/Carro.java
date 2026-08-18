package ads.poo;

public class Carro {
    private String modelo;
    private int velocidadeAtual;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int velocidade){
        if(!(this.velocidadeAtual + velocidade > 100)){
            this.velocidadeAtual += velocidade;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}