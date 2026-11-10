package ads.poo;

public class App {

    public static void main(String[] args) {
        Personagem aldeao = new Aldeao();
        Personagem arqueiro = new Arqueiro();
        Personagem cavaleiro = new Cavaleiro(ETipoCavalo.PANGARE);

        if(aldeao instanceof Aldeao a){
            System.out.println(a.atacar());
            System.out.println(a.mover());
            System.out.println(a);
        }
        if (arqueiro instanceof Arqueiro arq) {
            System.out.println(arq.atacar());
            System.out.println(arq.mover());
            System.out.println(arq);
        }
        if (cavaleiro instanceof Cavaleiro cav) {
            System.out.println(cav.atacar());
            System.out.println(cav.mover());
            System.out.println(cav);
        }
    }
}
