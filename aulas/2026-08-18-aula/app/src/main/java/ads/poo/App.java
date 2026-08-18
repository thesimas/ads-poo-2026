package ads.poo;

public class App {
    public static void main(String[] args) {

        Carro fusca = new Carro("Fusca");
        fusca.acelerar(30);
        System.out.println("O " + fusca.getModelo() + " está na velocidade " + fusca.getVelocidadeAtual() + " KM/h");

        fusca.acelerar(100);
        fusca.acelerar(50);

        System.out.println("O " + fusca.getModelo() +  " está na velocidade " + fusca.getVelocidadeAtual() + " KM/h");

        Carro gol = new Carro("Gol");
        gol.acelerar(50);
        System.out.println("O " + gol.getModelo() +  " está na velocidade " + fusca.getVelocidadeAtual() + " KM/h");
        
    }
}
