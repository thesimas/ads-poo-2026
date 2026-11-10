package ads.poo;

public abstract class Terrestre extends Animal{

    public Terrestre(int peso, String nome) {
        super(peso, nome);
    }

    public abstract String expressar();

    public abstract String correr();

    @Override
    public String toString() {
        return super.toString();
    }
}
