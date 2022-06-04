public class Cliente {
    private String cpf;
    private String nome;
    private String fone;

    public Cliente() {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
    }

    public static void set(int indice, int novo_cliente) {
    }

    public static void set(Cliente cliente) {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}