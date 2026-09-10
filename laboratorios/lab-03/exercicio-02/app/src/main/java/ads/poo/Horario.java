package ads.poo;

public class Horario {
    private int hora;
    private int minutos;
    private int segundos;
    private StringBuilder formatador = new StringBuilder();

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

        String hora = String.valueOf(this.hora);
        String minutos = String.valueOf(this.minutos);
        String segundos = String.valueOf(this.segundos);

        this.formatador.append(descobreNumero(hora));
        this.formatador.append(" horas, ");
        this.formatador.append(descobreNumero(minutos));
        this.formatador.append(" minutos, ");
        this.formatador.append(descobreNumero(segundos));
        this.formatador.append(" segundos");

        return this.formatador;
    }

    private StringBuilder descobreNumero (String string){
        String[] vetorUnidade = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove"};
        String[] vetorDezena = {"Dez", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta"};

        for(int y = 0; y < 2; y ++){
            this.formatador.append(verifica(vetorUnidade, vetorDezena, y, string));
            this.formatador.append(" e ");
        }

        return this.formatador;
    }

    private String verifica(String[] vetorUnidade, String[] vetorDezena, int posicao, String string){

        if(verificaCaractere(string)){
            return vetorDezena[0];
        }

        //Faltou verificar o dez + segunda casa
        if(!(string.charAt(posicao) > 6)){
            switch (string.charAt(posicao)){
                case 1:
                    return vetorDezena[0];
                case 2:
                    return vetorDezena[1];
                case 3:
                    return vetorDezena[2];
                case 4:
                    return vetorDezena[3];
                case 5:
                    return vetorDezena[4];
                case 6:
                    return vetorDezena[5];
            }
        }else {
            switch (string.charAt(posicao)){
                case 1:
                    return vetorUnidade[0];
                case 2:
                    return vetorUnidade[1];
                case 3:
                    return vetorUnidade[2];
                case 4:
                    return vetorUnidade[3];
                case 5:
                    return vetorUnidade[4];
                case 6:
                    return vetorUnidade[5];
                case 7:
                    return vetorUnidade[6];
                case 8:
                    return vetorUnidade[7];
                case 9:
                    return vetorUnidade[8];
            }
        }

        return null;
    }

    private boolean verificaCaractere(String string){
        if(string.charAt(1) == 0){
            return true;
        }
        return false;
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
        final StringBuilder sb = new StringBuilder("Horario: ");
        sb.append(hora);
        sb.append(":").append(minutos);
        sb.append(":").append(segundos);
        return sb.toString();
    }
}
