package ads.poo;

public class Carta {
    private Valor valor;
    private Naipe naipe;

    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String retornaInformacao(){
        String informacao = String.valueOf(valor.getForca());
        informacao += naipe.getPrimeiroNome();
        return informacao + ".png";
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carta ");
        sb.append(valor).append('\n');
        sb.append("Naipe - ").append(naipe).append("\n");
        sb.append("Simbolo - ").append(naipe.getSimbolo());
        return sb.toString();
    }
}
