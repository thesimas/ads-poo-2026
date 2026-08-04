import java.util.Scanner;

public class MediaComMatriz {
    public static void main(String[] args){

        double[][] notas = new double[3][3];
        Scanner leia = new Scanner(System.in);

        System.out.print("\n\nPrograma de notas em Matrizes!\n\n");

        for(int x = 0; x < notas.length; x ++){
            System.out.print("\nInforme a nota do " + (x+1) +" aluno!\n");
            for(int j = 0; j < notas[x].length; j ++){
                if(j > 1){
                    notas[x][2] = Math.round(notas[x][0] + notas[x][1]) / 2;
                }else{
                    System.out.print("Nota " + (j+1) + ": ");
                    while (true) {
                        double notaInput = leia.nextDouble();
                        if(verificador(notaInput)){
                            notas[x][j] = notaInput;
                            break;
                        }else{
                            System.out.println("Error: Nota fora de parametro! INFOME NOVAMENTE!");
                        }
                    }
                }
            }
        }

        System.out.println("\nAs médias foram: ");
        for(int x = 0; x < notas.length; x ++){
            for(int j = 2; j < 3; j ++){
                System.out.println(String.format("Média %d: %.2f", (x+1), notas[x][j]));
            }
        }

        leia.close();
    }

    public static boolean verificador(double nota){
        if(nota > 10 || nota < 0){
            return false;
        }
        return true;
    }
}