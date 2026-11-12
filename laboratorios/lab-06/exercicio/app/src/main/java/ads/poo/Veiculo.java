package ads.poo;

public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Veiculo() {
        this.id += 1;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 200;
    }

    public abstract boolean frear();

    public abstract boolean acelerar();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
