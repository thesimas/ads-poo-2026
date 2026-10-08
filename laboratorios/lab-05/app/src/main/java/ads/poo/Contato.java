package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private HashMap<String, Telefone> telefones = new HashMap<>();
    private HashMap<String, Email> emails = new HashMap<>();

    public Contato(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public boolean addTelefone(String rotulo, String numero){
        if(!telefones.containsKey(rotulo)){
            telefones.put(rotulo, new Telefone(numero));
            return true;
        }
        return false;
    }

    public boolean addEmail(String rotulo, String email){
        if(!emails.containsKey(rotulo)){
            emails.put(rotulo, new Email(email));
            return true;
        }
        return false;
    }

    public boolean removeTelefone(String rotulo){
        if(telefones.containsKey(rotulo)){
            telefones.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean removeEmail(String rotulo){
        if(emails.containsKey(rotulo)){
            emails.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String numero){
        Telefone telefoneExistente = telefones.get(rotulo);
        if(telefoneExistente != null){
            telefoneExistente.setValor(numero);
            return true;
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String email){
        Email emailExistente = emails.get(rotulo);
        if(emailExistente != null){
            emailExistente.setValor(email);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobreNome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public HashMap<String, Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Informações do Contato:\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Sobrenome: ").append(sobreNome).append("\n");
        sb.append("Data de Nascimento: ").append(dataNascimento).append("\n");
        sb.append("Possui ").append(telefones.size()).append(" telefones:\n");
        int contator = 1;
        for (Telefone telefone : telefones.values()){
            sb.append(contator).append("º telefone: ").append(telefone.getValor()).append("\n");
            contator ++;
        }
        sb.append("Possui ").append(emails.size()).append(" emails:\n");
        contator = 1;
        for (Email email : emails.values()){
            sb.append(contator).append("º Email: ").append(email.getValor()).append("\n");
            contator ++;
        }
        return sb.toString();
    }
}
