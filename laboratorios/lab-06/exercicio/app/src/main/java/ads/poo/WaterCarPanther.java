package ads.poo;

public class WaterCarPanther extends Veiculo implements Conversivel, Tracao, Anfibio {
    private boolean tracao;
    private boolean rodas;
    private boolean capota;
    private int miniGeladeira;
    private EModelo modeloLastro;
    private int capacidadeLastro;
    private int capacidadeMaximaLastro;

    public WaterCarPanther(EModelo modeloLastro) {
        this.modeloLastro = modeloLastro;
        this.capacidadeLastro = 0;
        definirCapacidadeMaximaLastro();
    }

    @Override
    public boolean frear() {
        if(super.getVelocidadeAtual() > 0){
            super.setVelocidadeAtual((super.getVelocidadeAtual() - 10));
            return true;
        }
        return false;
    }

    @Override
    public boolean acelerar() {
        if(!(super.getVelocidadeAtual() > super.getVelocidadeMaxima())){
            super.setVelocidadeAtual((super.getVelocidadeMaxima() + 10));
            return true;
        }
        return false;
    }

    public boolean definirTemperatura(int temperatura){
        if(temperatura < 0 || temperatura > 10){
            return false;
        }
        this.miniGeladeira = temperatura;
        return true;
    }

    @Override
    public boolean encherLastro() {
        if(rodas){
            return false;
        }
        this.capacidadeLastro += 25;

        if(this.capacidadeLastro > capacidadeMaximaLastro){
            this.capacidadeLastro = capacidadeMaximaLastro;
        }

        return true;

    }

    @Override
    public boolean esvaziarLastro() {
        this.capacidadeLastro = 0;
        return true;
    }

    public boolean recolherRodas(){
        if(!(super.getVelocidadeAtual() > 0)){
            if(rodas){
                rodas = false;
                this.capacidadeLastro = 0;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean liberarRodas(){
        if(!(super.getVelocidadeAtual() > 0)){
            if(!rodas){
                rodas = true;
                return true;
            }
            return false;
        }
        return false;
    }

    private void definirCapacidadeMaximaLastro(){
        if(this.modeloLastro.equals(EModelo.PEQUENO)){
            this.capacidadeMaximaLastro = 50;
        }else if (this.modeloLastro.equals(EModelo.MEDIO)){
            this.capacidadeMaximaLastro = 75;
        }else {
            this.capacidadeMaximaLastro = 100;
        }
    }

    @Override
    public boolean abrirCapota() {
        if(!(super.getVelocidadeAtual() > 0)){
            this.capota = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean fecharCapotar() {
        if(!(super.getVelocidadeAtual() > 0)){
            this.capota = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean ativarTracao() {
        if(!(super.getVelocidadeAtual() > 0)){
            if(!rodas){
                if(!tracao){
                    this.tracao = true;
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean desativarTracao() {
        if(!(super.getVelocidadeAtual() > 0)){
            if(rodas){
                if(tracao){
                    this.tracao = false;
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int getCapacidadeLastro() {
        return capacidadeLastro;
    }

    public void setCapacidadeLastro(int capacidadeLastro) {
        this.capacidadeLastro = capacidadeLastro;
    }

    public int getCapacidadeMaximaLastro() {
        return capacidadeMaximaLastro;
    }

    public void setCapacidadeMaximaLastro(int capacidadeMaximaLastro) {
        this.capacidadeMaximaLastro = capacidadeMaximaLastro;
    }

    public EModelo getModeloLastro() {
        return modeloLastro;
    }

    public void setModeloLastro(EModelo modeloLastro) {
        this.modeloLastro = modeloLastro;
    }

    public boolean isTracao() {
        return tracao;
    }

    public void setTracao(boolean tracao) {
        this.tracao = tracao;
    }

    public boolean isRodas() {
        return rodas;
    }

    public void setRodas(boolean rodas) {
        this.rodas = rodas;
    }

    public boolean isCapota() {
        return capota;
    }

    public void setCapota(boolean capota) {
        this.capota = capota;
    }

    public int getMiniGeladeira() {
        return miniGeladeira;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veículo - WaterCar Panther");
        sb.append(super.toString());
        String txtRodas = rodas ? "Liberadas" : "Recolhidas";
        sb.append("Rodas: ").append(txtRodas).append("\n");;
        String txtCapota = capota ? "Aberta" : "Fechada";
        sb.append("Capota: ").append(txtCapota).append("\n");
        String txtTracao = tracao ? "Ativada" : "Desativada";
        sb.append("Tração: ").append(txtTracao).append("\n");
        sb.append("Capacidade Máxima do Lastro: ").append(this.capacidadeMaximaLastro).append("\n");;
        sb.append("Capacidade Atual do Lastro: ").append(this.capacidadeLastro).append("\n");;
        sb.append("Temperatura da Mini Geladeira: ").append(miniGeladeira).append("º graus");
        return sb.toString();
    }
}
