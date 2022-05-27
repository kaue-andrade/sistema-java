import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;

public class Produtos {

    private double dinheiro;
    private double total;
    private double troco;
    private int pagamento_efetuado;
    private int pagamento;

    public void bancoProdutos() {

        Scanner ler = new Scanner(System.in);

        HashMap<String, Double> produtos = new HashMap<String, Double>();

        //Lista de alimentos para a simulação

        produtos.put("Almoço", 9.00);
        produtos.put("Bala Ice kiss", 0.10);
        produtos.put("Pirulito POP", 0.50);
        produtos.put("Chocolate sonho de valsa", 1.50);
        produtos.put("Pacote de jujuba", 1.0);
        produtos.put("Trident", 2.50);
        produtos.put("Pipoca doce", 1.50);
        produtos.put("Amendupã", 1.50);
        produtos.put("Salgadinho fandangos",2.50);
        produtos.put("Batata chips", 3.50);
        produtos.put("Doritos", 4.00);
        produtos.put("Refrigerante goob 230 ml", 2.50);
        produtos.put("Refrigerante Pepsi/guaraná 200ml", 2.50);
        produtos.put("Cafézinho Peq", 1.00);
        produtos.put("Cafézinho grande", 1.50);
        produtos.put("Café c/leite peq", 1.50);
        produtos.put("Café com leite 250ml", 3.50);
        produtos.put("Salada de frutas", 3.00);
        produtos.put("Misto", 3.00);
        produtos.put("Pão com queijo", 2.50);
        produtos.put("Pão de queijo", 2.00);
        produtos.put("Pão delícia", 1.00);
        produtos.put("Cuscuz com ovo", 4.00);
        produtos.put("Cuscuz com frango desfiado", 5.00);
        produtos.put("Cuscuz de tapioca", 2.00);
        produtos.put("Panqueca", 3.50);
        produtos.put("Sanduíche natural", 4.00);
        produtos.put("Salgados", 3.50);
        produtos.put("Torta de frango", 3.00);
        produtos.put("Bolo sem cobertura fatia", 2.00);
        produtos.put("Bolo com cobertura fatia", 2.00);
        produtos.put("Palha italiana", 2.50);
        produtos.put("Brigadeiro",1.00);
        produtos.put("Sopa 400 ml", 6.00);
        produtos.put("Sopa 500 ml", 7.00);
        produtos.put("Caldo verde 400 ml", 6.00);
        produtos.put("Caldo verde 500 ml", 6.00);
        produtos.put("Caldo de aimpim c/ frango 400 ml", 6.00);
        produtos.put("Caldo de aimpim c/ frango 500 ml", 7.00);
        
        System.out.println();

        //Simulação de pedidos do cliente

        System.out.println("Simulação: ");
        System.out.println("\nValor do Trident: " + produtos.get("Trident"));
        System.out.println("Valor do Sopa 500 ml: " + produtos.get("Sopa 500 ml"));
        System.out.println("Valor do Brigadeiro: " + produtos.get("Brigadeiro"));

        total = total + produtos.get("Trident") + produtos.get("Sopa 500 ml") + produtos.get("Brigadeiro");

        System.out.print("\nTOTAL A PAGAR: " + total + "\n");

        System.out.print("\nDINHEIRO EM ESPÉCIE - 1 \nPIX - 2 \nPLANO MENSAL - 3 \n\nForma de pagamento: ");
        pagamento = ler.nextInt();

        //Se pagamento receber 1

        if (pagamento == 1) {
            System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

            System.out.print("\nQuantia: R$ ");
            dinheiro = ler.nextDouble();

            if (dinheiro > total) {

                double troco = dinheiro - total;
                System.out.println("\nTroco: R$ " + troco);
                System.out.println("\nCompra finalizada!");
            } else{
                System.out.println("\nSem troco. Compra finalizada!");
            }
        }

        //Se pagamento receber 2

        if (pagamento == 2) {
            System.out.println("\n=-=-=FORMA DE PAGAMENTO: PIX=-=-=");

            System.out.println("\nPIX DA CANTINA IFBA: pixcantinaifba@gmail.com\n");

            pagamento_efetuado = 2;

            while (pagamento_efetuado != 1) {
                System.out.print("Pagamento efetuado (SIM - 1) (NÃO - 2)? ");
                pagamento_efetuado = ler.nextInt();
            }

            System.out.println("\nCompra finalizada! Tenha um ótimo dia!");
        }

        /*if (pagamento == 3) {
            System.out.println("\n=-=-= FORMA DE PAGAMENTO: PLANO MENSAL =-=-=");

            System.out.println("\nPLANO MENSAL IFBA: 8 fichas por R$ 72");

            System.out.print("\nNome do cliente: ");
            String aluno = ler.nextLine();
        }*/
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public int getPagamento_efetuado() {
        return pagamento_efetuado;
    }

    public void setPagamento_efetuado(int pagamento_efetuado) {
        this.pagamento_efetuado = pagamento_efetuado;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }
}
