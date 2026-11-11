package ads.poo;

import ads.poo.animais.aereo.Arara;
import ads.poo.animais.aereo.Morcego;
import ads.poo.animais.maritimos.Baleia;
import ads.poo.animais.maritimos.Pinguim;
import ads.poo.animais.terrestres.Leao;
import ads.poo.animais.terrestres.Lobo;

public class App {

    public static void main(String[] args) {
        Animal animais[] = new Animal[6];

        animais[0] = new Leao(350, "Mafúnda");
        animais[1] = new Lobo(55, "Walt");
        animais[2] = new Baleia(1350, "Orca");
        animais[3] = new Pinguim(15, "Kadu");
        animais[4] = new Arara(7, "Mafúnda");
        animais[5] = new Morcego(2, "Batman");

        for(int x = 0; x < animais.length; x ++){
            System.out.println((x+1) + "º Animal:");
            System.out.println(animais[x].expressar());

            if(animais[x] instanceof Aereo aereo){
                System.out.println(aereo.voar());
            } else if (animais[x] instanceof Maritimo maritmo) {
                System.out.println(maritmo.nadar());
            } else if (animais[x] instanceof Terrestre terrestre) {
                System.out.println(terrestre.correr());
            }

            System.out.println(animais[x]);
            System.out.println();
        }
    }
}
