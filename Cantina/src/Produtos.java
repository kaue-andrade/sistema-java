import java.util.HashMap;
import java.util.Scanner;

public class Produtos {
    public void bancoProdutos() {

        int confirmar = 0;
        double total = 0.0;

        Scanner ler = new Scanner(System.in);

        HashMap<String, Double> produtos = new HashMap<String, Double>();

        produtos.put("Bala Ice kiss", 0.10);
        produtos.put("Pirulito POP", 0.50);
        produtos.put("Chocolate sonho de valsa", 1.50);
        produtos.put("Pacote de jujuba", 1.0);
        produtos.put("Trident", 2.50);

        System.out.println();

         while (confirmar != 1){

            System.out.print("O que o cliente deseja comprar? ");
            String prod = ler.nextLine();

            System.out.println();
            System.out.println(total = total + produtos.get(prod));

            System.out.println();

            System.out.print("Deseja adicionar mais algo? (SIM - 1) (NÃO - 2)");
            confirmar = ler.nextInt();

            if (confirmar == 1){
                break;
            }
        }

        System.out.print("TOTAL A PAGAR: " + total + "\n");

        System.out.print("\nDINHEIRO EM ESPÉCIE - 1 \nPIX - 2 \nPLANO MENSAL - 3 \n\nForma de pagamento: ");
        int pagamento = ler.nextInt();

        if (pagamento == 1) {
            System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

            System.out.print("\nQuantia: R$ ");
            double dinheiro = ler.nextFloat();

            double troco = dinheiro - total;

            System.out.println("\nTroco: R$ " + troco);
            System.out.println("\nCompra finalizada!");
        }

        if (pagamento == 2) {
            System.out.println("\n=-=-=FORMA DE PAGAMENTO: PIX=-=-=");

            System.out.println("\nPIX DA CANTINA IFBA: pixcantinaifba@gmail.com\n");

            int pagamento_efetuado = 2;

            while (pagamento_efetuado != 1) {
                System.out.print("Pagamento efetuado (SIM - 1) (NÃO - 2)? ");
                pagamento_efetuado = ler.nextInt();
            }

            System.out.println("\nCompra finalizada! Tenha um ótimo dia!");
        }

        if (pagamento == 3) {
            System.out.println("\n=-=-= FORMA DE PAGAMENTO: PLANO MENSAL =-=-=");

            System.out.println("\nPLANO MENSAL IFBA: 8 fichas por R$ 72");

            System.out.print("\nNome do cliente: ");
            String aluno = ler.nextLine();
        }
    }
}
