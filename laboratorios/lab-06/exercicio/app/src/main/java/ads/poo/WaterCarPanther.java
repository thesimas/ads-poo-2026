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
        return false;
    }

    @Override
    public boolean acelerar() {
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
        return false;
    }

    @Override
    public boolean fecharCapotar() {
        return false;
    }

    @Override
    public boolean ativarTracao() {
        return false;
    }

    @Override
    public boolean desativarTracao() {
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
}
