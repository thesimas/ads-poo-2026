package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int mxmTripulantes;
    private int mxmPassageiros;
    private int mxmCombustivel;
    private ArrayList<Motor> motores = new ArrayList<>();
    private boolean status = false;
    private ETipoAviao etipoAviao;

    public Aviao(int mxmTripulantes, int mxmPassageiros, int mxmCombustivel, ETipoAviao etipoAviao, ETipoMotor tipoMotor) {
        this.mxmTripulantes = mxmTripulantes;
        this.mxmPassageiros = mxmPassageiros;
        this.mxmCombustivel = mxmCombustivel;

        if(etipoAviao.equals(ETipoAviao.MONOMOTOR)){
            motores.add(new Motor(tipoMotor));
        } else if (etipoAviao.equals(ETipoAviao.BIMOTOR)) {
            for(int x = 0; x < 2; x++){
                motores.add(new Motor(tipoMotor));
            }
        } else {
            for(int x = 0; x < 4; x++){
                motores.add(new Motor(tipoMotor));
            }
        }
        this.etipoAviao = etipoAviao;
    }

    public boolean ligarMotor(int indice){
        Motor motor = this.motores.get(indice);
        if(motor != null){
            motor.setStatus(true);
            return true;
        }
        return false;
    }

    public boolean desligarMotor(int indice){
        Motor motor = this.motores.get(indice);
        if(motor != null){
            motor.setStatus(false);
            return true;
        }
        return false;
    }

    public boolean partida(){
        if(!this.status){
            this.status = true;
            for(Motor motor : motores){
                motor.setStatus(true);
            }
            return true;
        }
        return false;
    }

    public boolean desligar(){
        if(this.status){
            this.status = false;
            for (Motor motor : motores){
                motor.setStatus(false);
            }
            return true;
        }
        return false;
    }

    public int getMxmTripulantes() {
        return mxmTripulantes;
    }

    public void setMxmTripulantes(int mxmTripulantes) {
        this.mxmTripulantes = mxmTripulantes;
    }

    public int getMxmPassageiros() {
        return mxmPassageiros;
    }

    public void setMxmPassageiros(int mxmPassageiros) {
        this.mxmPassageiros = mxmPassageiros;
    }

    public int getMxmCombustivel() {
        return mxmCombustivel;
    }

    public void setMxmCombustivel(int mxmCombustivel) {
        this.mxmCombustivel = mxmCombustivel;
    }

    public ArrayList<Motor> getMotores() {
        return motores;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Avião: \n");
        sb.append("Tipo de Avião: ").append(etipoAviao).append("\n");
        sb.append("Maximo de tripulantes: ").append(mxmTripulantes).append("\n");
        sb.append("Maximo de Passageiros: ").append(mxmPassageiros).append("\n");
        sb.append("Máximo de Combústivel: ").append(mxmCombustivel).append("\n");
        sb.append("Status: ");
        if(this.status){
           sb.append("Ligado");
        }else {
            sb.append("Desligado");
        }
        sb.append("\n");
        if(!this.motores.isEmpty()){
            for (int x = 0; x < this.motores.size(); x++){
                sb.append((x+1)).append("º").append(" - Status Motor - ").append(this.motores.get(x).formata()).append("\n");
            }
        }
        return sb.toString();
    }
}
