public class Saudacao {
    public static void main(String[] args) {

        double soma = 0;

        if(args.length >= 2){
            for(int x = 0; x < args.length; x ++){
                soma += Double.parseDouble(args[x]);
            }

            System.out.println("Sua média é: " + String.format("%d", Math.round(soma / args.length)) );

            if(Math.round(soma / args.length) > 5){
                System.out.println("Você está aprovado!");
            }else{
                System.out.println("Você está reprovado!");
            }

        }else{
            System.out.println("Error: Informe ao menos duas notas!");
        }
    }
}