package ads.poo;

import java.util.Arrays;

public class Disciplina {
    private DiaDaSemana[] dias;
    private String nome;

    public Disciplina(DiaDaSemana[] dias, String nome) {
        this.dias = dias;
        this.nome = nome;
    }

    public DiaDaSemana[] getDias() {
        return dias;
    }

    public void setDias(DiaDaSemana[] dias) {
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disciplina: ");
        sb.append(nome).append("\n");
        sb.append("Dias de aula - ").append(Arrays.toString(dias));
        return sb.toString();
    }
}
