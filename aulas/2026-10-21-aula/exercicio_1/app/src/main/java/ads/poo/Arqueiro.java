package ads.poo;

public class Arqueiro extends Personagem{
    private int numeroFlechas;

    public Arqueiro() {
        super(35, 2, 1);
        this.numeroFlechas = 10;
    }

    @Override
    public StringBuilder mover(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Arqueiro está se movendo com velocidade de ").append(super.getVelocidade());
        return sb;
    }

    @Override
    public StringBuilder atacar(){
        StringBuilder sb = new StringBuilder();
        sb.append("O Arqueiro está atacando com força de ataque ").append(super.getAtaque());
        return sb;
    }

    public int getNumeroFlechas() {
        return numeroFlechas;
    }

    public void setNumeroFlechas(int numeroFlechas) {
        this.numeroFlechas = numeroFlechas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Número de Flechas: ").append(numeroFlechas).append("\n");
        return sb.toString();
    }
}
