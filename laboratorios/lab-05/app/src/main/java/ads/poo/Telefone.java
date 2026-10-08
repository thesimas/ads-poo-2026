package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String valor;

    public Telefone(String valor) {
        String numero = validaNumero(valor) ? valor : "";
        this.valor = numero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if (validaNumero(valor)){
            this.valor = valor;
        }
    }

    private boolean validaNumero(String numero){
        String eR = "^[0-9]+$";
        return numero.matches(eR);
    }

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        String mascara = (valor.length() == 11) ? "(##) # ####-####" : "(##) ####-####";
        sb.append("Número: ").append(formata(mascara, this.valor));
        return sb.toString();
    }
}
