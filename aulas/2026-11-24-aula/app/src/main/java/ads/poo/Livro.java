package ads.poo;

public class Livro {
    private String isbn;
    private String autor;
    private String titulo;

    public Livro(String isbn, String autor, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro - ");
        sb.append(titulo).append("\n");
        sb.append("ISBN: ").append(isbn).append('\n');
        sb.append("Autor: ").append(autor).append('\n');
        return sb.toString();
    }
}
