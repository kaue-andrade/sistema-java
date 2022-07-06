import java.util.Scanner;
import java.util.ArrayList;

public class ProdutosRepository {

    Scanner ler = new Scanner(System.in);

    private ArrayList<Produtos> repository = new ArrayList<Produtos>();

    public void ReservaRepository() {

        this.repository = new ArrayList<Produtos>();
    }

    /*Percorrendo o Array e imprimindo o cliente na reverva*/

    public void listarProdutos() {
        for (int pos = 0; pos < this.repository.size(); pos++) {
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getNome() + " - " + this.repository.get(pos).getValor());
        }
    }

    //Método que lista os cliente da reserva e possibilita excluir

    public void deletarProduto() {

        this.listarProdutos();
        System.out.println("\nEscolha entre os clientes acima para deletar!\n=====================================");

        System.out.print(">>> ");
        int index = ler.nextInt();

        System.out.println();
        System.out.print("Tem certeza que deseja excluir o cliente? (y/n) ");
        String opcao = ler.next();

        if (opcao.equalsIgnoreCase("y")) {
            this.repository.remove((index - 1));
            System.out.println("\nExcluído com sucesso!\n");
            this.listarProdutos();
        } else {
            this.listarProdutos();
        }
    }

    public void inserir(Produtos produtos){

        repository.add(produtos);
    }

    public void listar(){

        for (int pos = 0; pos < this.repository.size(); pos++) {

            System.out.println("\n-------------------");
            System.out.println((pos + 1) + " - " + this.repository.get(pos).getNome());
            System.out.println("Valor - R$ " + this.repository.get(pos).getValor());
            System.out.println("-------------------");
        }
    }

    public void calculo(){

        double total = 0;

        for (int pos = 0; pos < this.repository.size(); pos++) {

            System.out.print("Quantas " + this.repository.get(pos).getNome() + " o cliente comprará? ");
            int quantia = ler.nextInt();

            System.out.println(quantia + "x" + this.repository.get(pos).getValor() + " = R$ " +  this.repository.get(pos).getValor() * quantia);

            double valorNovo = this.repository.get(pos).getValor() * quantia;

            total = total + valorNovo;

        }

        System.out.println("Total: R$ " + total);

        System.out.println("=-=-= Formas de pagamento =-=-=");

        System.out.println("1 - Dinheiro em espécie");
        System.out.println("2 - Plano Mensal");
        System.out.println("3 - Pix");

        System.out.print("Opção escolhida: ");
        String opc = ler.next();

        if(opc == "1"){

            System.out.print("Quantia recebida: ");
            double quantia_recebida = ler.nextDouble();

            double troco = quantia_recebida - total;

            System.out.println("Troco: R$ " + troco);

            System.out.println("Se for um número negativo, ignore.");

        }
    }
}

