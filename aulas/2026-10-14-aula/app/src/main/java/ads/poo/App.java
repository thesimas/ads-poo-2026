package ads.poo;

import ads.poo.produtos.ETipo;
import ads.poo.produtos.Pager;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Produto;

import java.util.ArrayList;

public class App {
    ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Produto telefoneSemFio = new SemFio(1, "12345", 2.0, 3, 4, 5, ETipo.BOTAO, 4, 3, 5);
        Produto pager = new Pager(1, "123456", 2.0, 3, 4 , 2, 5);
        System.out.println(telefoneSemFio);
        System.out.println(pager);
    }
}
