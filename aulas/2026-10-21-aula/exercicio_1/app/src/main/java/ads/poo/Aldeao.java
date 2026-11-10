package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletor{
    private int velocidadeColheita;

    public Aldeao() {
        super(25, 1, 0.8);
        this.velocidadeColheita = 1;
    }

    @Override
    public String coletarMadeira() {
        return "Aldeão coletando madeira!";
    }

    @Override
    public String coletarOuro() {
        return "Aldeão coletando Ouro!";
    }

    @Override
    public String mover(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Aldeão está se movendo com velocidade de ").append(super.getVelocidade());
        return sb.toString();
    }

    @Override
    public String atacar(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Aldeão está atacando com força de ataque ").append(super.getAtaque());
        return sb.toString();
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
