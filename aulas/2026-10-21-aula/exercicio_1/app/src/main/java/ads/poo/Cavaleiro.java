package ads.poo;

public class Cavaleiro extends Personagem{
    private ETipoCavalo cavalo;

    public Cavaleiro(ETipoCavalo cavalo) {
        super(50, 3, 2);
        this.cavalo = cavalo;
    }

    @Override
    public StringBuilder mover() {
        StringBuilder sb = new StringBuilder();
        sb.append("O Cavaleiro está se movendo com velocidade de ").append(super.getVelocidade());
        return sb;
    }

    @Override
    public StringBuilder atacar() {
        StringBuilder sb = new StringBuilder();
        sb.append("O Cavaleiro está atacando com força de ataque ").append(super.getAtaque());
        return sb;
    }

    public ETipoCavalo getCavalo() {
        return cavalo;
    }

    public void setCavalo(ETipoCavalo cavalo) {
        this.cavalo = cavalo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cavalo").append(cavalo).append("\n");
        return sb.toString();
    }
}
