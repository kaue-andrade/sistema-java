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
    }

    public void removerClientes(){

        System.out.print("\nQuantos itens deseja remover? ");
        quantidade = ler.nextInt();

        for (i = 1; i <= quantidade; i++) {

            System.out.print("\nQual cliente deseja remover? ");
            cliente = ler.next();

            clientes.remove(cliente);

            System.out.println("\nO(a) " + cliente + " foi removido com sucesso!");

        }

        System.out.println();

    }
}