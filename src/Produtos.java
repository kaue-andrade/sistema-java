import java.util.HashMap;
import java.util.Scanner;

public class Produtos {

    private int verificador = 1;
    private int quantidade;
    private String produto;
    private double valor;
    private int i;

    static Scanner ler = new Scanner(System.in);
    static HashMap<String, Double> produtos = new HashMap<>();

    public void adicionarProduto(){

        System.out.print("Quantos itens deseja adicionar? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.println();
            System.out.println("----------------------------------");

            System.out.print("Adicione o produto: ");
            produto = ler.next();

            System.out.print("Adicione o valor do produto: ");
            valor = ler.nextDouble();

            produtos.put(produto, valor);

            System.out.println("----------------------------------");
            System.out.println();

        }
    }

    public void listarProdutos(){

        System.out.println("Lista do(s) produto(s) adicionado(s): " + produtos);

    }

    public void alterarProdutos(){

        System.out.print("\nQuantos itens deseja alterar? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.print("\nProduto que deseja alterar: ");
            produto = ler.next();

            System.out.print("\nNovo valor do produto: ");
            valor = ler.nextDouble();

            produtos.replace(produto, valor);
        }
    }

    public void removerProduto(){

        System.out.print("\nQuantos itens deseja remover? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.print("\nQual produto deseja remover? ");
            produto = ler.next();

            produtos.remove(produto);

            System.out.println("\nO(a) " + produto + " foi removido com sucesso!");

        }
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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
        Produtos.ler = ler;
    }

    public static HashMap<String, Double> getProdutos() {
        return produtos;
    }

    public static void setProdutos(HashMap<String, Double> produtos) {
        Produtos.produtos = produtos;
    }
}
