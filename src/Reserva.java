public class Reserva {

    private int numero;
    private String cliente;
    private String cpf;
    private int almoco;
    private int quantidade;
    private String novo_cpf;

    public Reserva(int numero, String cliente, String cpf, int almoco, int quantidade, String novo_cpf) {
        this.numero = numero;
        this.cliente = cliente;
        this.cpf = cpf;
        this.almoco = almoco;
        this.quantidade = quantidade;
        this.novo_cpf = novo_cpf;
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

    public int getAlmoco() {
        return almoco;
    }

    public void setAlmoco(int almoco) {
        this.almoco = almoco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNovo_cpf() {
        return novo_cpf;
    }

    public void setNovo_cpf(String novo_cpf) {
        this.novo_cpf = novo_cpf;
    }
}
