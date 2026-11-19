package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho(){
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    public Carta compararCartas(Carta carta1, Carta carta2){
        if(carta1.getValor().getForca() > carta2.getValor().getForca()){
            if(carta1.getNaipe().getForca() >= carta2.getNaipe().getForca()){
                return carta1;
            }
        }else if (carta1.getValor().getForca() == carta2.getValor().getForca()){
            if(carta1.getNaipe().getForca() >= carta2.getNaipe().getForca()){
                return carta1;
            }else {
                return carta2;
            }
        }else {
            return carta2;
        }
        return null;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Baralho com ").append(cartas.size()).append(" cartas!").append("\n");
        for(Carta carta : cartas){
            sb.append("\t").append(carta).append("\n");
            Draw draw = new Draw();
            draw.picture(.5, .5, "cartas/cartas/" + carta.retornaInformacao());
        }
        return sb.toString();
    }
}
