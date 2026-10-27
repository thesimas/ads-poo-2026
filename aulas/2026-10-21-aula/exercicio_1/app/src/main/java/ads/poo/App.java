package ads.poo;

public class App {

    public static void main(String[] args) {
        Personagem aldeao = new Aldeao();
        Personagem arqueiro = new Arqueiro();
        Personagem cavaleiro = new Cavaleiro(ETipoCavalo.PANGARE);

        System.out.println(aldeao.atacar());
        System.out.println(aldeao.mover());
        System.out.println(aldeao);

        System.out.println(arqueiro.atacar());
        System.out.println(arqueiro.mover());
        System.out.println(arqueiro);

        System.out.println(cavaleiro.atacar());
        System.out.println(cavaleiro.mover());
        System.out.println(cavaleiro);
    }
}
