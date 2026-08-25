
package ads.poo;

public class App {
    public static void main(String[] args) {

        // Caneta sem parametros deve conter cor azul e nivel de tinta = 100;
        // Caneta com um unico parametro (nivel de tinta), deverá ter a cor azul;

        Caneta a = new Caneta("Azul", 100);
        Caneta b = new Caneta(50); //50, azul
        Caneta c = new Caneta(); // 100, azul

        System.out.println("\n");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println(a.desenhar(1,1,2,2));
        System.out.println(a.toString());

    }
}
