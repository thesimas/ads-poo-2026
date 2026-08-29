package ads.poo;

public class App {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(1, 1);
        Ponto ponto2 = new Ponto(3, 1);

        System.out.println(ponto1.toString());
        System.out.println(ponto2.toString());

        System.out.println("Distância entre os dois pontos: " + ponto1.distancia(ponto2));
    }
}
