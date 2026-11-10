package ads.poo;

public abstract class Areo extends Animal{
    public Areo(int peso, String nome) {
        super(peso, nome);
    }

    public abstract String expressar();

    public abstract String voar();

    @Override
    public String toString() {
        return super.toString();
    }
}
