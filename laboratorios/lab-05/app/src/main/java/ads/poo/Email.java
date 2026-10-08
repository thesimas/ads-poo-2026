package ads.poo;

public class Email {
    private String valor;

    public Email(String valor) {
        String email = emailValido(valor) ? valor : "";
        this.valor = email;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if(emailValido(valor)){
            this.valor = valor;
        }
    }

    private boolean emailValido(String email){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return email.matches(eR);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Email: ").append(this.valor);
        return sb.toString();
    }
}
