import java.util.Arrays;
import java.util.Scanner;

public class Data {
    void main() {
        // Faça um programa que o usuario deve informar:
        // - Sigla da disciplina
        // - Todos os dias da semana que tem aula dessa discplina
        // Por fim, imprima:
        // Na disciplina *** você tem aula nos seguintes dias:
        // - Segunda
        // - Quarta
        // - Sexta

        Scanner leia = new Scanner(System.in);
        String[] diasInformados = new String[5];
        String[] diasValidos = new String[] { "segunda", "terca", "quarta", "quinta", "sexta" };
        String resposta = "";
        String siglaDisciplina = "";
        int index = 0;

        instrucoes(diasValidos);
        int quantidadeDeDisciplinas = disciplinas(leia);

        while (quantidadeDeDisciplinas > 0) {

            System.out.println("Qual é a sigla da sua Disciplina?");
            siglaDisciplina = leia.nextLine().toUpperCase();

            System.out.println("Você tem aula em quais dias?");
            while (true) {

                if (index > 4) {
                    break;
                }

                resposta = leia.nextLine().toLowerCase();

                if (resposta.charAt(0) == 'n') {
                    break;
                }

                if (verificadorDiaValido(resposta, diasValidos)
                        && verificadorDiasDuplicados(resposta, diasInformados)) {
                    diasInformados[index] = resposta;
                    index++;
                } else {
                    if (!verificadorDiasDuplicados(resposta, diasInformados)) {
                        System.out.println(diasInformados[index] + " já foi informado.");
                    } else {
                        System.out.println("Dia informado não existe!");
                    }
                }
            }

            if (diasInformados.length != 0) {
                mostraDias(siglaDisciplina, diasInformados, index);
            }

            index = 0;
            Arrays.fill(diasInformados, "");
            quantidadeDeDisciplinas--;
        }
        leia.close();
    }

    public static void instrucoes(String[] diasValidos) {
        System.out.print("\n\nBem vindo ao Programa que irá listar suas aulas por disciplina!\nDias na semana possíveis:");
        diasPossiveis(diasValidos);
        System.out.println("Caso queira parar de informar, digite 'não'!\n");
    }

    public static boolean verificadorDiaValido(String resposta, String[] diasValidos) {
        int flag = 0;

        for (int x = 0; x < diasValidos.length; x++) {
            if (resposta.equalsIgnoreCase(diasValidos[x])) {
                flag += 1;
            }
        }

        if (flag != 0) {
            return true;
        }
        return false;
    }

    public static boolean verificadorDiasDuplicados(String resposta, String[] diasInformados) {
        int flag = 0;

        if (diasInformados.length == 1) {
            return true;
        }

        for (int x = 0; x < diasInformados.length; x++) {
            if (diasInformados[x] != null) {
                if (resposta.equalsIgnoreCase(diasInformados[x])) {
                    flag += 1;
                }
            } else {
                break;
            }
        }

        if (flag > 0) {
            return false;
        }
        return true;
    }

    public static int disciplinas(Scanner leia) {
        System.out.println("\nQuantas disciplinas você irá cursar?");
        int disciplinas = leia.nextInt();
        leia.nextLine();
        return disciplinas;
    }

    public static void mostraDias(String sigla, String[] diasInformados, int index) {
        System.out.println("\nDiscplina: " + sigla + ", dias de aula na Semana: \n");
        for (int x = 0; x < index; x++) {
            System.out.println("- " + diasInformados[x].toUpperCase());
        }
        System.out.println();
    }

    public static void diasPossiveis(String[] diasValidos) {
        for (int x = 0; x < diasValidos.length; x++) {
            System.out.print("| " + diasValidos[x].toUpperCase() + " ");
        }
        System.out.print("|\n");
    }
}