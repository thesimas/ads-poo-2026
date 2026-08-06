import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        do{
            String linha = leia.nextLine();
            System.out.println("Sáida: " + linha);
        }while(leia.hasNext());

        leia.close();
    }
}
