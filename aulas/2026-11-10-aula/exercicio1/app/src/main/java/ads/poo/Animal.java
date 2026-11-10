package ads.poo;

public abstract class Animal {
    private int peso;
    private String nome;

    public Animal(int peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }

    public abstract String expressar();

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Nome: ").append(nome);
        sb.append("\nPeso: ").append(peso);
        return sb.toString();
    }
}
