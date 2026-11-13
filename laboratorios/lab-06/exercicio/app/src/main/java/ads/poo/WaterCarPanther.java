package ads.poo;

public class WaterCarPanther extends Veiculo implements Conversivel, Tracao, Anfibio {
    private boolean tracao;
    private boolean lastro;
    private boolean rodas;
    private boolean capota;
    private int miniGeladeira;

    public WaterCarPanther() {
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
    public boolean encherLastro() {
        return false;
    }

    @Override
    public boolean esvaziarLastro() {
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

    public boolean isTracao() {
        return tracao;
    }

    public void setTracao(boolean tracao) {
        this.tracao = tracao;
    }

    public boolean isLastro() {
        return lastro;
    }

    public void setLastro(boolean lastro) {
        this.lastro = lastro;
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

    public void setMiniGeladeira(int miniGeladeira) {
        this.miniGeladeira = miniGeladeira;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WaterCarPanther{");
        sb.append("tracao=").append(tracao);
        sb.append(", lastro=").append(lastro);
        sb.append(", rodas=").append(rodas);
        sb.append(", capota=").append(capota);
        sb.append(", miniGeladeira=").append(miniGeladeira);
        sb.append('}');
        return sb.toString();
    }
}
