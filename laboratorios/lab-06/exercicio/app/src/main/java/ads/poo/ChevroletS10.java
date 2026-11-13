package ads.poo;

public class ChevroletS10 extends Veiculo implements Tracao{
    private boolean cacamba;
    private boolean tracao;

    public ChevroletS10() {
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
    public boolean ativarTracao() {
        if(!(super.getVelocidadeAtual() > 0)){
            if(!tracao){
                this.tracao = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean desativarTracao() {
        if(!(super.getVelocidadeAtual() > 0)){
            if(tracao){
                this.tracao = false;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean abrirCacamba(){
        if(!(super.getVelocidadeAtual() > 0)){
            if(!cacamba){
                this.cacamba = true;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean fecharCacamba(){
        if(!(super.getVelocidadeAtual() > 0)){
            if(cacamba){
                this.cacamba = false;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isCacamba() {
        return cacamba;
    }

    public void setCacamba(boolean cacamba) {
        this.cacamba = cacamba;
    }

    public boolean isTracao() {
        return tracao;
    }

    public void setTracao(boolean tracao) {
        this.tracao = tracao;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veículo - Chevrolet S10");
        sb.append(super.toString());
        String txtCacamba = cacamba ? "Aberta" : "Fechada";
        sb.append("Caçamba: ").append(txtCacamba).append("\n");
        String txtTracao = tracao ? "Ativada" : "Desativada";
        sb.append("Tração: ").append(txtTracao).append("\n");
        return sb.toString();
    }
}
