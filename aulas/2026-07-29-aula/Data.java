import java.util.Scanner;

public class Data {
    void main(){
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
        int index = 0;
        String resposta = "";
        System.out.println("\n\nQual é a sigla da sua Disciplina?");
        String siglaDisciplina = leia.nextLine();

        System.out.println("\n\nVocê tem aula em quais dias?");
        String[] diasValidos = new String[] {"segunda", "terça", "quarta", "quinta", "sexta"};

        while (true) {

            if (index > 4){
                break;
            }

            resposta = leia.nextLine().toLowerCase();

            if(resposta.charAt(0) == 'n'){
                break;
            }

            while (true) {
                diasInformados[index] = resposta;

                if(!(resposta.contains(diasValidos[index]))){
                    if(verificador(diasInformados, resposta)){
                        IO.println("Dia informado já foi preenchido!");
                    }else{
                        System.out.println("Dia incorreto, informe: ");
                    }
                    IO.println("\nInforme: ");
                    for(int x = 0; x < diasValidos.length; x ++){
                        IO.print(diasValidos[x] + " ");
                    }
                    IO.println();
                    resposta = leia.nextLine().toLowerCase();
                }else{
                    break;
                }
            }
            
            index ++;
        }

        IO.println("\nDiscplina: "+ siglaDisciplina +"\nDias de Aula na Semana: ");
        for(int x = 0; x < index; x ++){
            IO.print(diasInformados[x] + " ");
        }
        IO.println("\n"); 
    }

    public static boolean verificador (String[] diasInformados, String resposta){
        boolean flag = true;
        for(int x = 0; x < diasInformados.length; x ++){
            if(resposta.equalsIgnoreCase(diasInformados[x])){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
}