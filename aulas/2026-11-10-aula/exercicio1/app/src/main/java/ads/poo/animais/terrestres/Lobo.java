package ads.poo.animais.terrestres;

import ads.poo.Terrestre;

public class Lobo extends Terrestre {
    public Lobo(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public String expressar() {
        return "O Lobo está uivando!";
    }

    @Override
    public String correr() {
        return "O Lobo está correndo!";
    }

    @Override
    public String toString() {
        return this.getNome() + " é um Lobo e tem " + this.getPeso() + " kilos!";
    }
}
