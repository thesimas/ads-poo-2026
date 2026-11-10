package ads.poo.animais.maritimos;

import ads.poo.Maritimo;

public class Pinguim extends Maritimo {
    public Pinguim(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public String nadar() {
        return "O pinguim está nadando!";
    }

    @Override
    public String expressar() {
        return "O pinguim está zurrando!";
    }

    @Override
    public String toString() {
        return this.getNome() + " é um Pinguim e tem " + this.getPeso() + " kilos!";
    }
}
