public class Reserva {

    private int numero;
    private String cliente;
    private String cpf;
    private String almoco;
    private int quantidade;

    public Reserva(int numero, String cliente, String cpf, String almoco, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.cpf = cpf;
        this.almoco = almoco;
        this.quantidade = quantidade;
    }

    public Reserva() {}

    public static void set(String reserva) {
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

    public String getAlmoco() {
        return almoco;
    }

    public void setAlmoco(String almoco) {
        this.almoco = almoco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
