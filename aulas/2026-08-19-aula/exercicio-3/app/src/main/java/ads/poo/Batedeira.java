package ads.poo;

public class Batedeira {
    private int velocidade;
    private int numeroVelocidade;
    private TipoDeGancho tipo;
    private Boolean status;
    private Cores cor;
    private Voltagem voltagem;


    public Batedeira(Cores cor, Voltagem voltagem) {
        this.cor = cor;
        this.voltagem = voltagem;
        this.status = false;
        this.tipo = TipoDeGancho.PADRAO;
    }

    public void ligar(){
        this.status = true;
    }

    public String definirVelocidade(int velocidade){
        if(this.status.equals(false)){
            return "Não é possivel passar uma velocidade para uma batedeira desligada!";
        }
        this.velocidade = velocidade;
        return "Velocidade definida!";
    }

    public String colocarGancho(TipoDeGancho tipo){
        if(this.status.equals(true)){
            return "Não é possivel colocar o gancho com a batedeira ligada!";
        }
        if(this.tipo.equals(tipo)){
            return "Este gancho já está inserido!";
        }
        this.tipo = tipo;
        return "Gancho inserido!";
    }

    public void desligar(){
        this.status = false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Batedeira: ");
        sb.append(cor);
        sb.append("\nvelocidade: ").append(velocidade);
        sb.append("\nnumeroVelocidade: ").append(numeroVelocidade);
        sb.append("\ntipo: ").append(tipo);
        sb.append("\nstatus: ").append(status);
        sb.append("\ncor: ").append(cor);
        sb.append("\nvoltagem: ").append(voltagem);
        return sb.toString();
    }
}
