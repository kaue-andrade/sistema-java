import java.util.Scanner;
import java.util.ArrayList;

public class ReservaRepository {

    Scanner ler = new Scanner(System.in);

    private ArrayList<Reserva> repository = new ArrayList<Reserva>();

    public void ReservaRepository() {

        this.repository = new ArrayList<Reserva>();
    }

    /*Percorrendo o Array e imprimindo o cliente na reverva*/

    public void listarClientesReserva() {
        for (int pos = 0; pos < this.repository.size(); pos++) {
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getCliente());
        }
    }

    //Método que lista os cliente da reserva e possibilita excluir

    public void deletarRevervaByCliente() {

        this.listarClientesReserva();
        System.out.println("\nEscolha entre os clientes acima para deletar!\n=====================================");

        System.out.print(">>> ");
        int index = ler.nextInt();

        System.out.println();
        System.out.print("Tem certeza que deseja excluir o cliente? (y/n) ");
        String opcao = ler.next();

        if (opcao.equalsIgnoreCase("y")) {
            this.repository.remove((index - 1));
            System.out.println("\nExcluído com sucesso!\n");
            this.listarClientesReserva();
        } else {
            this.listarClientesReserva();
        }
    }

    public void inserir(Reserva reserva){

        repository.add(reserva);
    }

    public void listar(){

        for (int pos = 0; pos < this.repository.size(); pos++) {

            System.out.println("\n-------------------");
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getNumero());
            System.out.println("Cliente - " + this.repository.get(pos).getCliente());
            System.out.println("CPF - " + this.repository.get(pos).getCpf());
            System.out.println("Almoço - " + this.repository.get(pos).getAlmoco());
            System.out.println("Quantidade - " + this.repository.get(pos).getQuantidade() + " g");
            System.out.println("-------------------");
        }
    }
}

