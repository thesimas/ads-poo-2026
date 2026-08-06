import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        while (leia.hasNext()) {

            String linha = leia.nextLine();

            String[] campos = linha.split(",");

            System.out.println("\nAluno: " + campos[0]);

            Double soma = Double.parseDouble(campos[1]);
            soma += Double.parseDouble(campos[2]);

            if(Math.round(soma / 2) > 5){
                System.out.print(" Aprovado!");
            }else{
                System.out.print(" Reprovado!");
            }
            System.out.println();
        }

        leia.close();
    }
}