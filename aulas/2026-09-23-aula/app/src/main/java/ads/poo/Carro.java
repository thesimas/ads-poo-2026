package ads.poo;

public class Carro {
    private String Marca;
    private Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        Marca = marca;
        this.propulsor = propulsor;
    }

    public void acelerar(int valor){
        this.propulsor.acelerar(valor);
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Motor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Motor propulsor) {
        this.propulsor = propulsor;
    }
}
