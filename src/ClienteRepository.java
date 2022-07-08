/*import java.util.Scanner;
import java.util.ArrayList;

public class ClienteRepository {

    Scanner ler = new Scanner(System.in);

    private ArrayList<Alunos> repository1 = new ArrayList<Alunos>();
    private ArrayList<Servidores> repository2 = new ArrayList<Servidores>();

    public void ClienteRepository() {

        System.out.print("O cliente é aluno (digite 1) ou servidor (digite 2)? ");
        int cliente = ler.nextInt();

        if (cliente == 1){
            this.repository1 = new ArrayList<Alunos>();
        } else{
            this.repository2 = new ArrayList<Servidores>();
        }
    }

    //Percorrendo o Array e imprimindo o cliente na reverva

    public void listarClientes() {
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
}*/

