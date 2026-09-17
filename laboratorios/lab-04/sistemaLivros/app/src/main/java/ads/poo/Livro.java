package ads.poo;

import java.time.LocalDate;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String isbn, String titulo, String autor, int anoPublicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro: ");
        sb.append("\nISBN: ").append(isbn);
        sb.append("\nTitulo: ").append(titulo);
        sb.append("\nAutor: ").append(autor);
        sb.append("\nAno de Publicação: ").append(anoPublicacao);
        return sb.toString();
    }
}
