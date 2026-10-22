package ads.poo;

public class Aldeao extends Personagem{
    private int velocidadeColheita;

    public Aldeao() {
        super(25, 1, 0.8);
        this.velocidadeColheita = 1;
    }

    @Override
    public StringBuilder mover(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Aldeão está se movendo com velocidade de ").append(super.getVelocidade());
        return sb;
    }

    @Override
    public StringBuilder atacar(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Aldeão está atacando com força de ataque ").append(super.getAtaque());
        return sb;
    }

    public int getVelocidadeColheita() {
        return velocidadeColheita;
    }

    public void setVelocidadeColheita(int velocidadeColheita) {
        this.velocidadeColheita = velocidadeColheita;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Velocidade Colheita: ").append(velocidadeColheita).append("\n");
        return sb.toString();
    }
}
