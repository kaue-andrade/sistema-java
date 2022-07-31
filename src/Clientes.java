import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

    private int verificador = 1;
    private int quantidade;
    private int indice;
    private String novo_cliente;
    private String cliente;
    private double valor;
    private int i;

    static Scanner ler = new Scanner(System.in);
    static ArrayList<String> clientes = new ArrayList<>();

    public void adicionarCliente(){

        System.out.print("Quantos clientes deseja adicionar? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.println();
            System.out.println("----------------------------------");

            System.out.print("Adicione o cliente: ");
            cliente = ler.next();

            clientes.add(cliente);

            System.out.println("----------------------------------");

        }
    }

    public void listarClientes(){

        System.out.println("Lista do(s) cliente(s) adicionado(s): " + clientes);

    }

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNovo_cliente() {
        return novo_cliente;
    }

    public void setNovo_cliente(String novo_cliente) {
        this.novo_cliente = novo_cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static Scanner getLer() {
        return ler;
    }

    public static void setLer(Scanner ler) {
        Clientes.ler = ler;
    }

    public static ArrayList<String> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<String> clientes) {
        Clientes.clientes = clientes;
    }

    public void alterarClientes() {

        System.out.print("\nQuantos itens deseja alterar? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.print("\nÍndice do cliente no ArrayList: ");
            indice = ler.nextInt();

            System.out.print("\nNovo cliente: ");
            novo_cliente = ler.next();

            if (indice >= 0 && indice < clientes.size()) {

                clientes.set(indice, novo_cliente);
            }

            System.out.println();
        }

    /*public void removerProduto(){

        System.out.print("\nQuantos itens deseja remover? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.print("\nQual produto deseja remover? ");
            produto = ler.next();

            produtos.remove(produto);

            System.out.println("\nO(a) " + produto + " foi removido com sucesso!");

        }
    }*/



    }
}