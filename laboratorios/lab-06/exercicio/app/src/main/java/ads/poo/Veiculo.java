package ads.poo;

public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private static int contador = 1;

    public Veiculo() {
        this.id = contador ++;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Velocidade Atual: ").append(velocidadeAtual).append("\n");
        sb.append("Velocidade Maxima: ").append(velocidadeMaxima).append("\n");
        return sb.toString();
    }
}
