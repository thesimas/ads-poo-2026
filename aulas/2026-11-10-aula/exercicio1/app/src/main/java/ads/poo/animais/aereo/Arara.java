package ads.poo.animais.aereo;

import ads.poo.Aereo;

public class Arara extends Aereo {
    public Arara(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public String expressar() {
        return "A arara está cantando!";
    }

    @Override
    public String voar() {
        return "A arara está voando!";
    }

    @Override
    public String toString() {
        return this.getNome() + " é uma arara e tem " + this.getPeso() + " kilos!";
    }
}
