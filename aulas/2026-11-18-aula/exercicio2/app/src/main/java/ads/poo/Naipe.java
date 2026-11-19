package ads.poo;

public enum Naipe {
    PAUS(4, "\u2663", "p"),
    OUROS(1, "\u2666", "o"),
    COPAS(3, "\u2665", "c"),
    ESPADAS(2, "\u2660", "e");

    private int forca;
    private String simbolo;
    private String primeiroNome;

    Naipe(int forca, String simbolo, String primeiroNome){
        this.forca = forca;
        this.simbolo = simbolo;
        this.primeiroNome = primeiroNome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
}


