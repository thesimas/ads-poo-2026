package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Handler;

public class Biblioteca {
    private HashMap<Integer, Usuario> cliente;
    private HashMap<String, Livro> livros;

    public Biblioteca() {
        this.cliente = new HashMap<>();
        this.livros = new HashMap<>();
    }

    public boolean addLivro(Livro livro) {
        if(livros.get(livro.getIsbn()) != null){
            livros.put(livro.getIsbn(), livro);
            return true;
        }
        return false;
    }

    public boolean removerLivro(Livro livro){
        if(livros.get(livro.getIsbn()) != null){
            livros.remove(livro.getIsbn(), livro);
            return true;
        }
        return false;
    }


}
