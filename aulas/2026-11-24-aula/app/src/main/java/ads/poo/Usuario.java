package ads.poo;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private ArrayList<Emprestimo> emprestimos;
    private static int contador = 1;

    public Usuario(String nome) {
        this.id = contador ++;
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario: ");
        sb.append(id).append("\n");
        sb.append("Nome: ").append(nome).append('\n');
        sb.append("Livros em Posse: ").append(emprestimos.size()).append('\n');
        for(Emprestimo emprestimo : emprestimos){
            sb.append("Livro: ").append(emprestimo.getLivro().getTitulo()).append("\n");
        }
        return sb.toString();
    }
}
