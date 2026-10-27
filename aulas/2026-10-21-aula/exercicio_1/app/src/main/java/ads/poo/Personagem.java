package ads.poo;

public abstract class Personagem {
    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public StringBuilder mover(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Personagem está se movendo com velocidade de ").append(this.getVelocidade());
        return sb;
    }

    public StringBuilder atacar(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Personagem está atacando com força de ataque").append(this.getAtaque());
        return sb;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Status: \n");
        sb.append("Vida atual: ").append(vida).append("\n");
        sb.append("Ataque: ").append(ataque).append("\n");
        sb.append("Velocidade de Movimento: ").append(velocidade).append("\n");
        return sb.toString();
    }
}
