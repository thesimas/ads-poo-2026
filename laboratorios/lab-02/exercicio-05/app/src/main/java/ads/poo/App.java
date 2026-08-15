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
        while (leitor.hasNext()){
            String linha = leitor.nextLine();
            linha = linha.replaceAll("[^.*]", "");

            if(linha.isEmpty()){
                continue;
            }

            if(contador > 9){
                break;
            }

            vetor[contador] = linha;
            contador ++;
        }
        leitor.close();

        // Passando esse vetor para uma matriz.
        for (int y = 0; y < matriz.length; y ++){
            for (int x = 0; x < matriz.length; x ++){
                matriz[y][x] = String.valueOf(vetor[y].charAt(x));
            }
        }

        System.out.println("Matriz Original: \n");
        imprime(matriz);
        System.out.println();

    }

    private static void imprime (String[][] matriz){
        for (int y = 0; y < matriz.length; y ++){
            for (int x = 0; x < matriz.length; x ++){
                System.out.print(matriz[y][x]);
            }
            System.out.println();
        }
    }
}
