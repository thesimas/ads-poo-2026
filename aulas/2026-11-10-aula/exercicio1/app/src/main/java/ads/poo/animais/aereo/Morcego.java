package ads.poo.animais.aereo;

import ads.poo.Aereo;

public class Morcego extends Aereo {
    public Morcego(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public String expressar() {
        return "O morcego está chiando!";
    }

    @Override
    public String voar() {
        return "O morcego está voando!";
    }

    @Override
    public String toString() {
        return this.getNome() + " é um morcego e tem " + this.getPeso() + " kilos!";
    }
}
