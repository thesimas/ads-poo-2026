package ads.poo;

public class Personagem {
    private String nome;
    private Classe Classe;
    private int fadiga;
    private int vida;

    public Personagem(String nome, Classe classe, int nivel) {
        this.nome = nome;
        Classe = classe;
        this.fadiga = 0;
        this.vida = 100;
    }

    public String atacar (Personagem inimigo){
        StringBuilder sb = new StringBuilder();
        if(this.fadiga > 100){
            sb.append("Seu nível de fadiga não permite atacar!");
        }else {
            inimigo.vida -= 10;
            this.fadiga += 10;
            sb.append(this.nome + " atacou " + inimigo.getNome());
        }
        return sb.toString();
    }

    public String descansar(){
        StringBuilder sb = new StringBuilder();
        if(this.fadiga < 100){
            this.fadiga -= 10;
            sb.append(this.nome + " descansou com sucesso!");
        }else {
            sb.append(this.nome + " não precisa descansar!");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public Classe getClasse() {
        return Classe;
    }

    public int getFadiga() {
        return fadiga;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nPersonagem Atual: ");
        sb.append(nome);
        sb.append("\nClasse: ").append(Classe);
        sb.append("\nfadiga: ").append(fadiga);
        sb.append("\nvida: ").append(vida);
        return sb.toString();
    }
}
