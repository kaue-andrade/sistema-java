import java.util.Scanner;
import java.util.ArrayList;

public class NovoFuncionarioRepository {

    Scanner ler = new Scanner(System.in);

    private ArrayList<NovoFuncionario> repository = new ArrayList<NovoFuncionario>();

    public void ReservaRepository() {

        this.repository = new ArrayList<NovoFuncionario>();
    }

    //Percorrendo o Array e imprimindo o cliente na reverva

    public void listarClientesReserva() {
        for (int pos = 0; pos < this.repository.size(); pos++) {
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getFuncionario());
        }
    }

    //Método que lista os cliente da reserva e possibilita excluir

    public void deletarNovoFuncionario() {

        this.listarClientesReserva();
        System.out.println("\nEscolha entre os funcionários acima para deletar!\n=====================================");

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

    //Método que possibilita inserir

    public void inserir(NovoFuncionario novoFuncionario){

        repository.add(novoFuncionario);
    }

    //Método que possibilita listar

    public void listar(){

        for (int pos = 0; pos < this.repository.size(); pos++) {

            System.out.println("\n-------------------");
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getFuncionario());
            System.out.println("CPF - " + this.repository.get(pos).getCpf());
            System.out.println("ID - " + this.repository.get(pos).getId());
            System.out.println("\n-------------------");
        }
    }
}

