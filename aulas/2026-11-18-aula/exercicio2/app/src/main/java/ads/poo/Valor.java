package ads.poo;

public enum Valor {
    AS(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    VALETE(11),
    DAMA(12),
    REI(13);

    public int forca;

    Valor(int forca){
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public static Valor getByCodigo(int codigo){
        for(Valor valor : Valor.values()){
            if(valor.getForca() == codigo){
                return valor;
            }
        }
        throw new RuntimeException("Código " + codigo + " inválido!");
    }

}
