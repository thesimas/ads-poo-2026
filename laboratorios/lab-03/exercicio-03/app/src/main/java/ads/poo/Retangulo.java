package ads.poo;

import com.google.common.base.Ascii;
import com.google.common.base.Utf8;

public class Retangulo {
    private int largura;
    private int altura;
    private String codificacao;
    private Boolean ascii = true;


    public Retangulo(int largura, int altura, String codificacao) {
        this.largura = largura <= 0 ? 4 : largura;
        this.altura = altura <= 0 ? 4 : altura;
        this.codificacao = codificacao.toLowerCase();
        this.ascii = this.codificacao.equals("utf8") ? false : true;
    }

    public int getArea(){
        return this.largura * this.altura;
    }

    public int getPerimetro(){
        return 2 * (this.largura + this.altura);
    }

    public int getLargura() {
        return largura;
    }

    public boolean setLargura(int largura) {
        if(largura <= 0){
            return false;
        }
        this.largura = largura;
        return true;
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if(altura <= 0){
            return false;
        }
        this.altura = altura;
        return true;
    }

    @Override
    public String toString() {
        String cantoSuperiorEsq = ascii ? "+" : "\u250c";
        String cantoSuperiorDir = ascii ? "+" : "\u2510";
        String desenhoSuperior = ascii ? "-" : "\u2500";
        String desenhoMeio = ascii ? "|" : "\u2502";
        String cantoInferiorEsq = ascii ? "+" : "\u2514";
        String cantoInferiorDir = ascii ? "+" : "\u2518";
        String desenhoInferior = ascii ? "-" : "\u2500";

        String linhaSuperior = cantoSuperiorEsq + desenhoSuperior.repeat(this.largura - 2) + cantoSuperiorDir;
        String linhaMeio = "\n"+ desenhoMeio + " ".repeat(this.largura - 2) + desenhoMeio;
        String linhaInferior = "\n" + cantoInferiorEsq + desenhoInferior.repeat(this.largura - 2) + cantoInferiorDir;

        return linhaSuperior + linhaMeio.repeat(this.altura) + linhaInferior;
    }
}
