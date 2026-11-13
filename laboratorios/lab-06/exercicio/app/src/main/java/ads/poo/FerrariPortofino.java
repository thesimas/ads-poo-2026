package ads.poo;

public class FerrariPortofino extends Veiculo implements Conversivel {
    private boolean estabilidade;
    private boolean capota;

    public FerrariPortofino() {
    }

    public boolean ativarEstabilidade() {
        if(estabilidade){
            return false;
        }else {
            this.estabilidade = true;
            return true;
        }
    }

    public boolean desativarEstabilidade(){
        if(estabilidade){
            this.estabilidade = false;
            return true;
        }else {
            return false;
        }
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

    public boolean isEstabilidade() {
        return estabilidade;
    }

    public void setEstabilidade(boolean estabilidade) {
        this.estabilidade = estabilidade;
    }

    public boolean isCapota() {
        return capota;
    }

    public void setCapota(boolean capota) {
        this.capota = capota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veículo - Ferrari Portofino");
        sb.append(super.toString());
        String txtEstabilidade = estabilidade ? "Ativada" : "Desativada";
        sb.append("Estabilidade: ").append(txtEstabilidade).append("\n");
        String txtCapota = capota ? "Aberta" : "Fechada";
        sb.append("Capota: ").append(txtCapota).append("\n");
        return sb.toString();
    }
}
