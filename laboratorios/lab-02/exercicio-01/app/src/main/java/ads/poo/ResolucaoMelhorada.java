package ads.poo;

import java.util.Scanner;

public class ResolucaoMelhorada {

    public static void main(String[] args){
        System.out.println();

        Scanner leia = new Scanner(System.in);
        System.out.println("Me informe um número inteiro que represente o dia: ");
        int dia = leia.nextInt();
        leia.nextLine();
        System.out.println("Me informe uma string que represente o mês: ");
        String mes = leia.nextLine().toLowerCase();
        String mensagem = "";

        System.out.println();

        switch (mes) {
            case "janeiro", "fevereiro" , "março":
                mensagem = ((dia < 20) && mes.equals("março")) ? "Estação Atual: Verão" : "Estação Atual: Outono";
                System.out.println(mensagem);
                break;
            case "abril", "maio", "junho":
                mensagem = ((dia < 21) && mes.equals("junho")) ? "Estação Atual: Outono" : "Estação Atual: Inverno";
                System.out.println(mensagem);
                break;
            case "julho", "agosto", "setembro":
                mensagem = ((dia < 22) && mes.equals("setembro")) ? "Estação Atual: Inverno" : "Estação Atual: Primavera";
                System.out.println(mensagem);
                break;
            default:
                mensagem = ((dia < 21) && mes.equals("dezembro")) ? "Estação Atual: Primavera" : "Estação Atual: Verão";
                System.out.println(mensagem);
                break;
        }
        System.out.println("\nFim do programa...\n");
        leia.close();
    }
}