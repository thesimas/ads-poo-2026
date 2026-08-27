package ads.poo;

import java.time.LocalDate;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private static int contador = 0;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = incrementa();
    }

    private int incrementa (){
        return contador += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nInformação da Pessoa: \n");
        sb.append("Id: ").append(id).append('\n');
        sb.append("Nome: ").append(nome).append('\n');
        sb.append("Email: ").append(email).append('\n');
        return sb.toString();
    }
}
