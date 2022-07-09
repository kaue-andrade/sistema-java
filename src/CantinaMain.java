import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class CantinaMain {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        System.out.println();
        System.out.println(" .d8888b.         d8888 888b    888 88888888888 8888888 888b    888        d8888");
        System.out.println("d88P  Y88b       d88888 8888b   888     888       888   8888b   888       d88888");
        System.out.println("888    888      d88P888 88888b  888     888       888   88888b  888      d88P888");
        System.out.println("888            d88P 888 888Y88b 888     888       888   888Y88b 888     d88P 888");
        System.out.println("888           d88P  888 888 Y88b888     888       888   888 Y88b888    d88P  888");
        System.out.println("888    888   d88P   888 888  Y88888     888       888   888  Y88888   d88P   888");
        System.out.println("Y88b  d88P  d8888888888 888   Y8888     888       888   888   Y8888  d8888888888");
        System.out.println("  Y8888P   d88P     888 888    Y888     888     8888888 888    Y888 d88P     888");

        System.out.println("\nData e hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));

        //Produtos p1 = new Produtos();

        System.out.println();

        /*p1.adicionarProduto();
        p1.listarProdutos();
        p1.alterarProdutos();
        p1.listarProdutos();
        p1.removerProduto();
        p1.listarProdutos();*/

        /*produto1.adicionarProduto();
        produto1.listarProdutos();
        produto1.alterarProdutos();
        produto1.listarProdutos();
        produto1.removerProduto();
        produto1.listarProdutos();*/

        ProdutosRepository repository5 = new ProdutosRepository();

        System.out.print("Quantos produtos deseja adicionar? ");
        int q = input.nextInt();

        System.out.println();

        for (int i = 0; i < q; i++){

            System.out.println("-------------------");

            System.out.print("Nome do produto: ");
            String nome = input.next();

            System.out.print("Valor do produto: ");
            double valor = input.nextDouble();

            System.out.println("-------------------\n");

            Produtos produtos1 = new Produtos(nome, valor);

            repository5.inserir(produtos1);

        }

        System.out.println("Lista de todos os produtos adicionados: ");

        repository5.listar();

        System.out.println();

        while (true) {

            repository5.deletarProduto();

            repository5.listar();

            System.out.print("\nDigite 0 para sair ou qualquer outra tecla para continuar\n>>> ");
            String opc = input.next();

            if (opc.equalsIgnoreCase("0")) {
                break;
            }
        }

        System.out.println();

        System.out.println("=-=-= Formas de pagamento =-=-=\n");

        System.out.println("1 - Dinheiro em espécie");
        System.out.println("2 - Plano Mensal");
        System.out.println("3 - PIX");

        System.out.print("\nOpção escolhida: ");
        int forma_pagamento = input.nextInt();

        if(forma_pagamento == 1) {

            repository5.calculo();

        } else if (forma_pagamento == 2){

            PlanoMensalRepository repository6 = new PlanoMensalRepository();

            System.out.print("Quantos planos mensais deseja adicionar? ");
            q = input.nextInt();

            System.out.println();

            for (int i = 0; i < q; i++) {

                System.out.println("-------------------");

                System.out.print("Nome: ");
                String nome = input.next();

                System.out.print("Fichas: ");
                int fichas = input.nextInt();

                System.out.println("-------------------\n");

                PlanoMensal planoMensal1 = new PlanoMensal(nome, fichas);

                repository6.inserir(planoMensal1);

            }

            System.out.println("Lista de todos os funcionários adicionados: ");

            repository6.listar();

            System.out.println();

            while (true) {

                repository6.deletarPlanoMensal();

                repository6.listar();

                System.out.print("Digite 0 para sair ou qualquer outra tecla para continuar\n>>> ");
                String opc = input.next();

                if (opc.equalsIgnoreCase("0")) {
                    break;
                }
            }

            System.out.println("\nPagamento realizado com sucesso!");

        } else{

            System.out.println("PIX da cantina: pixcantinaifba@gmail.com");

            int confirmar = 1;

            while (confirmar == 1){
                System.out.print("Pagamento realizado? (SIM - 1) (NÃO - 2)");
                confirmar = input.nextInt();
            }
        }

        System.out.println("\nData e hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));

        System.out.println();

        NovoFuncionarioRepository repository2 = new NovoFuncionarioRepository();

        System.out.print("Quantos funcionários deseja adicionar? ");
        q = input.nextInt();

        System.out.println();

        for (int i = 0; i < q; i++) {

            System.out.println("-------------------");

            System.out.print("Funcionário: ");
            String funcionario = input.next();

            System.out.print("CPF: ");
            String cliente = input.next();

            System.out.print("ID: ");
            int id = input.nextInt();

            System.out.println("-------------------\n");

            NovoFuncionario funcionario1 = new NovoFuncionario(funcionario, cliente, id);

            repository2.inserir(funcionario1);

        }

        System.out.println("Lista de todos os funcionários adicionados: ");

        repository2.listar();

        System.out.println();

        String opc;
        while (true) {

            repository2.deletarNovoFuncionario();

            repository2.listar();

            System.out.print("\nDigite 0 para sair ou qualquer outra tecla para continuar\n>>> ");
            opc = input.next();

            if (opc.equalsIgnoreCase("0")) {
                break;
            }
        }

        System.out.println("\nData e hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));

        ReservaRepository repository3 = new ReservaRepository();

        System.out.print("\nQuantas reservas deseja adicionar? ");
        q = input.nextInt();

        System.out.println();

        for (int i = 0; i < q; i++) {

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

            System.out.println("\nData e hora atual: " + c.getTime());
            System.out.println("Ano: " + c.get(Calendar.YEAR));
            System.out.println("Mês: " + c.get(Calendar.MONTH));
            System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));

            System.out.println("-------------------\n");

            Reserva reserva = new Reserva(numero, cliente, cpf, almoco, quantidade);

            repository3.inserir(reserva);
        }

        System.out.println("Lista de todas as reservas feitas: ");

        repository3.listar();

        System.out.println();

        while (true) {

            repository3.deletarRevervaByCliente();

            repository3.listar();

            System.out.print("\nDigite 0 para sair ou qualquer outra tecla para continuar\n>>> ");
            opc = input.next();

            if (opc.equalsIgnoreCase("0")) {
                break;
            }
        }

        int confirmar_compra = 1;

        while (confirmar_compra == 1){
            System.out.print("Toda a compra foi finalizada com sucesso? (SIM - 1) (NÃO - 2)");
            confirmar_compra = input.nextInt();
        }

        System.out.println("\nFim do programa! Tenha um ótimo dia! :D");

    }
}
