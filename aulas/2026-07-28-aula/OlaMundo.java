public class OlaMundo {
    void main(){

        // Faça um programa pra ler idade e sexo de uma pessoa e informe se ela precisa apresentar o atestado de reservista!
        
        System.out.println();
        IO.println("Programa para verificar se precisa de atestado de reservista");
        
        String nome = IO.readln("Entre com o seu nome: ");

        int idade = Integer.parseInt(IO.readln("Entre com sua Idade: "));

        char sexo = IO.readln("Me informe o seu Sexo, F para FEMININO ou M para MASCULINO: ").toUpperCase().charAt(0);

        if(sexo == 'M' && idade > 17){
            System.out.println("Olá " + nome + ", você tem " + idade + " anos e precisa apresentar o atestado de reservista!");
        }else if(sexo == 'M'){
            System.out.println("Olá " + nome + ", você tem " + idade + " anos e não tem idade suficiente para apresentar o atestado de reservista!");
        }
        else{
            System.out.println("Olá " + nome + ", você tem " + idade + " anos e você não precisa informar o atestado de reservista!");
        }

    }
}