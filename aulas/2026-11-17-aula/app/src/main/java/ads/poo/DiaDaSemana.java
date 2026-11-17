package ads.poo;

public enum DiaDaSemana {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda feira"),
    TERCA(3, "Terça feira"),
    QUARTA(4, "Quarta feira"),
    QUINTA(5, "Quinta feira"),
    SEXTA(6, "Sexta feira"),
    SABADO(7,"Sábado");

    public int codigo;
    public String extenso;

    DiaDaSemana(int codigo, String extenso){
        this.codigo = codigo;
        this.extenso = extenso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(extenso);
        return sb.toString();
    }
}

