package ads.poo;

public class Data {
    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano){
        new Data(dia, mes);
        this.ano = ano;
    }

    public Data(int dia, int mes){
        new Data(dia);
        this.mes = mes;
    }

    public Data(int dia){
        new Data();
        this.dia = dia;
    }


    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
