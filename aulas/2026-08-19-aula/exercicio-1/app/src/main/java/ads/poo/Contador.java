package ads.poo;

public class Contador {
    private int valorAtual;

    public Contador (){
    }

    public void incrementar (){
        this.valorAtual += 1;
    }

    public void atribuir (int valor){
        this.valorAtual = valor;
    }

    public int obterValor(){
        return this.valorAtual;
    }
}
