import java.util.Scanner;
import java.util.ArrayList;

public class PlanoMensalRepository {

    Scanner ler = new Scanner(System.in);

    private ArrayList<PlanoMensal> repository = new ArrayList<PlanoMensal>();

    public void PlanoMensalRepository() {

        this.repository = new ArrayList<PlanoMensal>();
    }

    /*Percorrendo o Array e imprimindo o cliente na reverva*/

    public void listarClientesPlanoMensal() {
        for (int pos = 0; pos < this.repository.size(); pos++) {
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getNome() + " - " + this.repository.get(pos).getFichas());
        }
    }

    //Método que lista os cliente da reserva e possibilita excluir

    public void deletarPlanoMensal() {

        this.listarClientesPlanoMensal();
        System.out.println("\nEscolha entre os clientes acima para deletar!\n=====================================");

        System.out.print(">>> ");
        int index = ler.nextInt();

        System.out.println();
        System.out.print("Tem certeza que deseja excluir o cliente? (y/n) ");
        String opcao = ler.next();

        if (opcao.equalsIgnoreCase("y")) {
            this.repository.remove((index - 1));
            System.out.println("\nExcluído com sucesso!\n");
            this.listarClientesPlanoMensal();
        } else {
            this.listarClientesPlanoMensal();
        }
    }

    public void inserir(PlanoMensal planoMensal){

        repository.add(planoMensal);
    }

    public void listar(){

        for (int pos = 0; pos < this.repository.size(); pos++) {

            System.out.println("\n-------------------");
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getNome());
            System.out.println("Fichas - " + this.repository.get(pos).getFichas());
            System.out.println("-------------------");
        }
    }
}

