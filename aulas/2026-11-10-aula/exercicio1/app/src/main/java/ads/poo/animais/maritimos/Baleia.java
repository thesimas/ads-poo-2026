package ads.poo.animais.maritimos;

import ads.poo.Maritimo;

public class Baleia extends Maritimo {

    public Baleia(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public String nadar() {
        return "A Baleia está nadando!";
    }

    @Override
    public String expressar() {
        return "A Baleia está cantando!";
    }

    @Override
    public String toString() {
        return this.getNome() + " é uma Baleia e tem " + this.getPeso() + " kilos!";
    }
}
