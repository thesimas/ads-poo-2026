package ads.poo;

public abstract class Aereo extends Animal{
    public Aereo(int peso, String nome) {
        super(peso, nome);
    }

    public abstract String expressar();

    public abstract String voar();

    @Override
    public String toString() {
        return super.toString();
    }
}
