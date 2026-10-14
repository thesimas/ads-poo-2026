package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(Contato contato){
        if(!contatos.contains(contato)){
            contatos.add(contato);
            return true;
        }
        return false;
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome){
        ArrayList<Contato> contatosEncontrados = new ArrayList<>();
        for(Contato contato : contatos){
            if(contato.getNome().equals(nome) && contato.getSobreNome().equals(sobreNome)){
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public boolean removeContato(int indice){
        if(contatos.get(indice) != null){
            contatos.remove(indice);
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String numero, int indice){
        Contato contatoExistente = contatos.get(indice);
        if(contatoExistente != null){
            return contatoExistente.addTelefone(rotulo, numero);
        }
        return false;
    }

    public boolean addEmail(String rotulo, String email, int indice){
        Contato contatoExistente = contatos.get(indice);
        if(contatoExistente != null){
            return contatoExistente.addEmail(rotulo, email);
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String numero, int indice){
        Contato contatoExistente = contatos.get(indice);
        if(contatoExistente != null){
            return contatoExistente.updateTelefone(rotulo, numero);
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String email, int indice){
        Contato contatoExistente = contatos.get(indice);
        if(contatoExistente != null){
            return contatoExistente.updateEmail(rotulo, email);
        }
        return false;
    }

    public boolean removeTelefone(String rotulo, int indice){
        Contato contatoExistente = contatos.get(indice);
        if(contatoExistente != null){
            return contatoExistente.removeTelefone(rotulo);
        }
        return false;
    }

    public boolean removeEmail(String rotulo, int indice){
        Contato contatoExistente = contatos.get(indice);
        if(contatoExistente != null){
            return contatoExistente.removeEmail(rotulo);
        }
        return false;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("°".repeat(15)).append(" Agenda ").append("°".repeat(15)).append("\n");
        if(!contatos.isEmpty()){
            int contador = 1;
            for (Contato contato : contatos){
                sb.append(contador).append("° contato:\n").append(contato.toString()).append("\n");
                contador ++;
            }
        }
        return sb.toString();
    }
}
