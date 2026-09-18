package ads.poo;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    private Scanner leitor = new Scanner(System.in);
    private HashMap<String, Livro> livros = new HashMap<>();

    public static void main(String[] args) {
        App app = new App();
        app.popularHash();
        int opcao;
        do {
            opcao = app.menu();
            switch (opcao){
                case 1:
                    app.cadastrar();
                    break;
                case 2:
                    app.listar();
                    break;
                case 3:
                    app.atualizar();
                    break;
                case 4:
                    app.remover();
                    break;
                case 5:
                    app.consultarPorISBN();
                    break;
                case 6:
                    app.consultarPorAutor();
                    break;
                case 7:
                    app.consultarPorAno();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, escolha um número de 0 a 7!");
            }
        }while (opcao != 0);
    }

    private int menu(){
        int opcao;
        System.out.println("\n========== GERENCIAMENTO DE LIVROS ==========");
        System.out.println("1 - Cadastrar novo livro");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Atualizar um livro");
        System.out.println("4 - Remover um livro");
        System.out.println("5 - Consultar livro por ISBN");
        System.out.println("6 - Consultar livro por Autor");
        System.out.println("7 - Consultar livro por Ano");
        System.out.println("0 - Sair");
        System.out.println("=============================================");
        System.out.print("Escolha uma opção: ");
        opcao = this.leitor.nextInt();
        this.leitor.nextLine();
        return opcao;
    }

    private void cadastrar(){
        System.out.println("Qual é o ISBN do livro?");
        String isbn = leitor.nextLine();
        while (this.livros.containsKey(isbn)){
            System.out.println("Já tem um livro cadastrado com esse ISBN, informe novamente!");
            isbn = leitor.nextLine();
        }
        System.out.println("Qual é o titulo do livro?");
        String titulo = leitor.nextLine();
        System.out.println("Qual é o nome do Autor do livro?");
        String autor = leitor.nextLine();
        System.out.println("Em que ano o livro foi lançado?");
        int ano = leitor.nextInt();
        leitor.nextLine();
        Livro livro = new Livro(isbn, titulo, autor, ano);
        this.livros.put(isbn, livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private void listar(){
        this.livros.forEach((chave, valor) -> {
            System.out.println("ISBN: " + chave + " - Titulo: " + valor.getTitulo());
        });
    }

    private void consultarPorISBN(){
        System.out.println("Qual é o ISBN do livro que deseja consultar?");
        String isbn = leitor.nextLine();
        if(!this.livros.containsKey(isbn)){
            System.out.println("Esse ISBN não está cadastrado!");
        }else {
            System.out.println(this.livros.get(isbn).toString());
        }
    }

    private void consultarPorAutor(){
        boolean flag = false;
        System.out.println("Qual é o Autor do livro que deseja consultar?");
        String autor = leitor.nextLine();

        for (Livro livro : this.livros.values()) {
            if (livro.getAutor().equals(autor)) {
                flag = true;
                System.out.println("ISBN: " + livro.getIsbn() + " - Titulo: " + livro.getTitulo());
            }
        }

        if(!flag){
            System.out.println("Não há livros cadastrado com esse autor!");
        }
    }

    private void consultarPorAno(){
        boolean flag = false;
        System.out.println("Qual é o Ano do livro que deseja consultar?");
        int ano = leitor.nextInt();
        leitor.nextLine();
        for (Livro livro : this.livros.values()) {
            if (livro.getAnoPublicacao() == ano) {
                flag = true;
                System.out.println("ISBN: " + livro.getIsbn() + " - Titulo: " + livro.getTitulo());
            }
        }

        if(!flag){
            System.out.println("Não há livros cadastrado com esse ano!");
        }
    }

    private void atualizar(){
        System.out.println("Qual é o ISBN do livro que deseja atualizar?");
        String isbn = leitor.nextLine();
        Livro livro = this.livros.get(isbn);

        if(livro != null){
            System.out.println(livro.toString() + "\nQual desas opções > (TITULO, AUTOR ou ANO) deseja alterar?!");
            String opcao = this.leitor.nextLine().toLowerCase();
            do {
                switch (opcao){
                    case "titulo":
                        System.out.println("Qual será o novo TITULO do livro?");
                        String titulo = leitor.nextLine();
                        if(!titulo.isEmpty()){
                            livro.setTitulo(titulo);
                        }
                        break;
                    case "autor":
                        System.out.println("Qual será o novo AUTOR do livro?");
                        String autor = leitor.nextLine();
                        if(!autor.isEmpty()){
                            livro.setAutor(autor);
                        }
                        break;
                    case "ano":
                        System.out.println("Qual será o novo ANO do livro?");
                        String ano = leitor.nextLine();
                        if(!ano.isEmpty()){
                            int anoInteiro = Integer.parseInt(ano);
                            livro.setAnoPublicacao(anoInteiro);
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                System.out.println("Deseja continuar atualizando? (SIM - NAO)");
                opcao = leitor.nextLine().toLowerCase();
                if(opcao.equals("sim") || opcao.equals("s")){
                    System.out.println("Qual desas opções > (TITULO, AUTOR ou ANO) deseja alterar?");
                }
            }while (!(opcao.equals("nao") || opcao.equals("n")));
            System.out.println("Livro atualizado com sucesso!\n" + livro.toString());
        }else {
            System.out.println("Esse ISBN não existe!");
        }
    }

    private void remover(){
        System.out.println("Qual é o ISBN do livro que deseja remover?");
        String isbn = leitor.nextLine();
        if(this.livros.containsKey(isbn)){
            this.livros.remove(isbn);
            System.out.println("Livro removido com sucesso!");
        }else {
            System.out.println("Não há livro cadastrado com esse ISBN!");
        }
    }

    private void popularHash(){
        Livro livro1 = new Livro("978-8535914849", "1984", "George Orwell", 1949);
        Livro livro2 = new Livro("978-8535902778", "Dom Casmurro", "Machado de Assis", 1899);
        Livro livro3 = new Livro("978-8501012074", "Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        Livro livro4 = new Livro("978-8595081536", "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);
        Livro livro5 = new Livro("978-8508127394", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        this.livros.put(livro1.getIsbn(), livro1);
        this.livros.put(livro2.getIsbn(), livro2);
        this.livros.put(livro3.getIsbn(), livro3);
        this.livros.put(livro4.getIsbn(), livro4);
        this.livros.put(livro5.getIsbn(), livro5);
    }

}
