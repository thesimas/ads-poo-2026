import java.util.Scanner;

public class Media {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Me informe o seu nome: ");
        String nome = leia.next();

        System.out.println("Me informe a sua primeira nota:");
        double nota1 = leia.nextDouble();
        
        System.out.println("Me informe a sua segunda nota:");
        double nota2 = leia.nextDouble();
        
        double media = Math.round(nota1 + nota2) / 2;
        String descricao = "";
        
        if(media > 5){
            descricao = "Você foi aprovado!";
        }else{
            descricao = "Você foi reprovado!";
        }

        String situacao = String.format("Nome: %s \nNotas: %.2f | %.2f |\nSituação: %s \nMédia: %.2f \n", nome, nota1, nota2, descricao, media); 

        System.out.print(situacao);

        leia.close();
    }
}