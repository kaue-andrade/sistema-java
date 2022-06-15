import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CantinaMain {
    public static void main(String[] args) throws IOException {

        System.out.println();
        System.out.println(" .d8888b.         d8888 888b    888 88888888888 8888888 888b    888        d8888");
        System.out.println("d88P  Y88b       d88888 8888b   888     888       888   8888b   888       d88888");
        System.out.println("888    888      d88P888 88888b  888     888       888   88888b  888      d88P888");
        System.out.println("888            d88P 888 888Y88b 888     888       888   888Y88b 888     d88P 888");
        System.out.println("888           d88P  888 888 Y88b888     888       888   888 Y88b888    d88P  888");
        System.out.println("888    888   d88P   888 888  Y88888     888       888   888  Y88888   d88P   888");
        System.out.println("Y88b  d88P  d8888888888 888   Y8888     888       888   888   Y8888  d8888888888");
        System.out.println("  Y8888P   d88P     888 888    Y888     888     8888888 888    Y888 d88P     888");

        /*Produtos p1 = new Produtos();

        System.out.println();

        p1.adicionarProduto();
        p1.listarProdutos();
        p1.alterarProdutos();
        p1.listarProdutos();
        p1.removerProduto();
        p1.listarProdutos();*/

        /*System.out.println();

        NovoFuncionario nf = new NovoFuncionario("Gilberto", "105", 123);
        NovoFuncionarioRepository nfp = new NovoFuncionarioRepository();

        nfp.inserir(nf);
        nfp.getAll();*/

        System.out.println();

        ReservaRepository repository = new ReservaRepository();
        Reserva reserva = new Reserva(545, "João", "4564564", 212, 442, "533123");
        Reserva reserva2 = new Reserva(545, "Carlos", "4564564", 212, 442, "533123");
        Reserva reserva3 = new Reserva(545, "Miguel", "4564564", 212, 442, "533123");

        repository.inserir(reserva);
        repository.inserir(reserva2);
        repository.inserir(reserva3);
        Scanner input = new Scanner(System.in);


        while(true) {
            repository.deletarRevervaByCliente();

            System.out.println("\nDigite 0 para sair ou qualquer outra tecla para continuar\n>>>");
            String opc = input.next();

            if(opc.equalsIgnoreCase("0")) {
                break;
            }

        }
        System.out.println("FIM!");

    }
}
