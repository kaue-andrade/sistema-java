import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CantinaMain {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println(" .d8888b.         d8888 888b    888 88888888888 8888888 888b    888        d8888");
        System.out.println("d88P  Y88b       d88888 8888b   888     888       888   8888b   888       d88888");
        System.out.println("888    888      d88P888 88888b  888     888       888   88888b  888      d88P888");
        System.out.println("888            d88P 888 888Y88b 888     888       888   888Y88b 888     d88P 888");
        System.out.println("888           d88P  888 888 Y88b888     888       888   888 Y88b888    d88P  888");
        System.out.println("888    888   d88P   888 888  Y88888     888       888   888  Y88888   d88P   888");
        System.out.println("Y88b  d88P  d8888888888 888   Y8888     888       888   888   Y8888  d8888888888");
        System.out.println("  Y8888P   d88P     888 888    Y888     888     8888888 888    Y888 d88P     888");

        Produtos p1 = new Produtos();

        System.out.println();

        p1.adicionarProduto();
        p1.listarProdutos();
        p1.alterarProdutos();
        p1.listarProdutos();
        p1.removerProduto();
        p1.listarProdutos();

        System.out.println();

        NovoFuncionarioRepository repository1 = new NovoFuncionarioRepository();

        System.out.print("Quantos funcionários deseja adicionar? ");
        int q = input.nextInt();

        System.out.println();

        for (int i = 0; i < q; i++){

            System.out.println("-------------------");

            System.out.print("Funcionário: ");
            String funcionario = input.next();

            System.out.print("CPF: ");
            String cliente = input.next();

            System.out.print("ID: ");
            int id = input.nextInt();

            System.out.println("-------------------\n");

            NovoFuncionario funcionario1 = new NovoFuncionario(funcionario, cliente, id);

            repository1.inserir(funcionario1);

        }

        System.out.println("Lista de todos os funcionários adicionados: ");

        repository1.listar();

        System.out.println();

        while (true) {

            repository1.deletarNovoFuncionario();

            repository1.listar();

            System.out.print("\nDigite 0 para sair ou qualquer outra tecla para continuar\n>>> ");
            String opc = input.next();

            if(opc.equalsIgnoreCase("0")) {
                break;
            }
        }

        ReservaRepository repository2 = new ReservaRepository();

        System.out.print("\nQuantas reservas deseja adicionar? ");
        q = input.nextInt();

        System.out.println();

        for (int i = 0; i < q; i++){

            System.out.println("-------------------");

            System.out.print("Número da reserva: ");
            int numero = input.nextInt();

            System.out.print("Cliente: ");
            String cliente = input.next();

            System.out.print("CPF: ");
            String cpf = input.next();

            System.out.print("Almoço: ");
            String almoco = input.next();

            System.out.print("Quantidade: ");
            int quantidade = input.nextInt();

            System.out.println("-------------------\n");

            Reserva reserva = new Reserva(numero, cliente, cpf, almoco, quantidade);

            repository2.inserir(reserva);
        }

        System.out.println("Lista de todas as reservas feitas: ");

        repository2.listar();

        System.out.println();

        while(true) {

            repository2.deletarRevervaByCliente();

            repository2.listar();

            System.out.print("\nDigite 0 para sair ou qualquer outra tecla para continuar\n>>> ");
            String opc = input.next();

            if(opc.equalsIgnoreCase("0")) {
                break;
            }
        }

        System.out.println("\nFim do programa! Tenha um ótimo dia! :D");

    }
}