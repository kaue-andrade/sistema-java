import java.util.Scanner;

public class CantinaMain {
    public static void main(String[] args) {

        int verificador = 1;

        //Criação dos Scanners

        Scanner ler = new Scanner(System.in);

        //Instanciando objetos

        Cliente c1 = new Cliente();
        Reserva r1 = new Reserva();
        //Funcionarios f1 = new Funcionarios();
        Produtos p1 = new Produtos();
        PlanoMensal a1 = new PlanoMensal();

        System.out.println("=-=-= Cantina - IFBA =-=-=");

        while (verificador != 2) {

            System.out.print("\nAdicionar cliente - 1 \nAdicionar pedidos - (NÃO CONCLUÍDO - FASE DE SIMULAÇÃO)\nReservar pedido - 3\n\nO que deseja fazer? ");
            int desejo = ler.nextInt();

            System.out.println();

            if (desejo == 1) {

                System.out.print("Digite o CPF do cliente: ");
                c1.setCpf(ler.next());
                System.out.print("Digite o nome do cliente: ");
                c1.setNome(ler.next());
                System.out.print("Digite o telefone do cliente: ");
                c1.setNome(ler.next());

            }

            if (desejo == 3) {

                System.out.print("Digite o número da reversa: ");
                r1.setNumero(ler.nextInt());
                System.out.print("Digite o nome do cliente: ");
                r1.setCliente(ler.next());
                System.out.print("Digite o CPF: ");
                r1.setCpf(ler.next());

            }

            System.out.print("Deseja fazer mais alguma alteração (SIM - 1) (NÃO - 2)? ");
            verificador = ler.nextInt();

        }

        //f1.bancoFuncionario();

        p1.bancoProdutos();

        a1.bancoMensal();
        //a1.bancoMensal();

    }
}
