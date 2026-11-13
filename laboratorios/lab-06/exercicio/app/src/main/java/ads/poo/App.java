
package ads.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Veiculo chevrolet = new ChevroletS10();
        veiculos.add(chevrolet);

        Veiculo ferrari = new FerrariPortofino();
        veiculos.add(ferrari);

        Veiculo waterCar = new WaterCarPanther(EModelo.MEDIO);
        veiculos.add(waterCar);

        for(Veiculo veiculo : veiculos){
            System.out.println(veiculo);
        }
    }
}
