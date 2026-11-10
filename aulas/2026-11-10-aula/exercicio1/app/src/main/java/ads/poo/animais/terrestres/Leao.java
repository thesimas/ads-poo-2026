package ads.poo.animais.terrestres;

import ads.poo.Terrestre;

public class Leao extends Terrestre {

    public Leao(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public String expressar() {
        return "Leão está rugindo!";
    }

    @Override
    public String correr() {
        return "Leão está correndo!";
    }

    @Override
    public String toString() {
        return this.getNome() + " é um Leão e tem " + this.getPeso() + " kilos!";
    }
}
