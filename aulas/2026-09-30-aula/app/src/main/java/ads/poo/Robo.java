package ads.poo;

public class Robo {
    private Bateria bateria;
    private EDirecao direcao;
    private String nome;
    private int consumo;
    private int coordenadaX;
    private int coordenadaY;

    public Robo (String nome, int voltagem, int consumoCarga){
        this.nome = nome;
        this.bateria = new Bateria(voltagem, consumoCarga);
    }

    public Bateria getBateria() {
        return bateria;
    }

    public EDirecao getDirecao() {
        return direcao;
    }

    public void setDirecao(EDirecao direcao) {
        this.direcao = direcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
