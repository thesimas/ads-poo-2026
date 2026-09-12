package ads.poo;

public class Horario {
    private int hora;
    private int minutos;
    private int segundos;

    public Horario(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

        if(!(setHora(hora) || setMinutos(minutos) || setSegundos(segundos))){
            new Horario();
        }
    }

    public Horario(int hora, int minutos) {
        new Horario();
        this.hora = hora;
        this.minutos = minutos;

        if(!(setHora(hora) || setMinutos(minutos))){
            new Horario();
        }
    }

    public Horario(int hora) {
        new Horario();
        this.hora = hora;
        if(!setHora(hora)){
            new Horario();
        }
    }

    public Horario() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public StringBuilder horarioPorExtenso(){
        StringBuilder sb = new StringBuilder();
        sb.append(descobreNumero(this.hora)).append(" horas e ");
        sb.append(descobreNumero(this.minutos)).append(" minutos e ");
        sb.append(descobreNumero(this.segundos)).append(" segundos.");

        return sb;
    }

    private String descobreNumero (int numero){
        String[] unidades = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "Dez", "Onze", "Doze", "Treze", "Quartorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"};
        String[] dezenas = {"Vinte", "Trinta", "Quarenta", "Cinquenta"};

        if(numero < 20){
            return unidades[(numero-1)];
        }
        int dezena = numero / 10;
        int unidade = numero % 10;
        if(unidade == 0){
            return dezenas[dezena-2];
        }
        return dezenas[(dezena-2)] + " e "  + unidades[(unidade-1)];

    }

    public String diferencaEntreDoisHorarios(Horario horario){
        long diferenca = this.paraSegundos() - horario.paraSegundos();
        return "A diferença entre o horário "  + this.toString() + " e o " + horario.toString() + " em segundos é " + diferenca;
    }

    public long paraSegundos(){
        return this.hora * 3600L + this.minutos * 60L + this.segundos;
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if(hora > 24 || hora < 0){
            return false;
        }

        this.hora = hora;
        return true;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        if(minutos > 60 || minutos < 0){
            return false;
        }
        this.minutos = minutos;
        return true;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        if(segundos > 60 || segundos < 0){
            return false;
        }
        this.segundos = segundos;
        return true;
    }

    @Override
    public String toString() {
        String hora = this.hora < 10 ? this.hora + "0:" : this.hora + ":";
        String minutos = this.minutos < 10 ? this.minutos + "0:" : this.minutos + ":";
        String segundos = this.segundos < 10 ? this.segundos + "0" : this.segundos + "";
        return hora + minutos + segundos;
    }
}
