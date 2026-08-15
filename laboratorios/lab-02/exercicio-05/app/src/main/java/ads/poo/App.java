package ads.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Para rodar no windows: cmd /c ".\exercicio-05\gradlew -p exercicio-05 run -q < matriz.txt"
        Scanner leitor = new Scanner(System.in);
        String[] vetor = new String[9];
        String[][] matriz = new String[9][9];

        int contador = 0;

        // Lendo a matriz do exercicio anterior e atribuindo a um vetor.
        while (leitor.hasNext()) {
            String linha = leitor.nextLine();
            linha = linha.replaceAll("[^.*]", "");

            if (linha.isEmpty()) {
                continue;
            }

            if (contador > 9) {
                break;
            }

            vetor[contador] = linha;
            contador++;
        }
        leitor.close();

        // Passando esse vetor para uma matriz.
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                matriz[y][x] = String.valueOf(vetor[y].charAt(x));
            }
        }

        System.out.println("\nMatriz Original: \n");
        imprime(matriz);
        System.out.println("Matriz Campo Minado:\n");

        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                // Lógica para verificar o asteristico, e atribuir um numero caso tenha nas casas adjacentes.
                // Fazendo uma reatriubuição de valor na matriz para usar o metodo de imprimir abaixo, ao inves de apenas printar.
                if (!(matriz[y][x].equals("*"))) {
                    int contagem = 0;
                    for (int linhaAtual = y - 1; linhaAtual <= (y + 1); linhaAtual++) {
                        for (int colunaAtual = x - 1; colunaAtual <= (x + 1); colunaAtual++) {
                            if ((linhaAtual >= 0 && linhaAtual < 9) && (colunaAtual >= 0 && colunaAtual < 9)) {
                                if (matriz[linhaAtual][colunaAtual].equals("*")) {
                                    contagem++;
                                }
                            }
                        }
                    }
                    if (contagem > 0) {
                        matriz[y][x] = String.valueOf(contagem);
                    }
                }
            }
        }
        imprime(matriz);
    }

    private static void imprime(String[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                System.out.print(matriz[y][x]);
            }
            System.out.println();
        }
        System.out.println();
    }
}