public class Reserva {

    private int numero;
    private String funcionario;
    private String cpf;

    public Reserva() {
        this.numero = numero;
        this.funcionario = funcionario;
        this.cpf = cpf;
    }

    public static void set(Reserva reserva) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFuncionario(){
        return funcionario;
    }

    public void setFucionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
