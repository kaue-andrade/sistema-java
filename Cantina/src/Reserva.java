public class Reserva {

    private int numero;
    private String cliente;
    private String cpf;

    public Reserva() {
        this.numero = numero;
        this.cliente = cliente;
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

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
