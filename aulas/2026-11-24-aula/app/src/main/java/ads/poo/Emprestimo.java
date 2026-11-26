package ads.poo;

import java.time.LocalDate;

public class Emprestimo {
    private EStatusLivro status;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, LocalDate dataDevolucao) {
        this.status = EStatusLivro.EMPRESTADO;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataDevolucao;
    }

    public EStatusLivro getStatus() {
        return status;
    }

    public void setStatus(EStatusLivro status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emprestimo: \n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Usúario: ").append(usuario).append("\n");
        sb.append("Livro: ").append(livro.getTitulo()).append("\n");
        sb.append("Data de Emprestimo: ").append(dataEmprestimo).append("\n");
        sb.append("Data de Devolução: ").append(dataDevolucao);
        return sb.toString();
    }
}
