import java.util.Scanner;

public class CantinaMain {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Produto c1 = new Produto();

        System.out.println("=-=-= Cantina - IFBA =-=-=");

        System.out.print("\nTOTAL: R$ ");
        int total_pagamento = ler.nextInt();

        System.out.print("\nDINHEIRO EM ESPÉCIE - 1 \nPIX - 2 \nPLANO MENSAL - 3 \n\nForma de pagamento: ");
        int pagamento = ler.nextInt();

        if (pagamento == 1) {
            System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

            System.out.print("\nQuantia: R$ ");
            float dinheiro = ler.nextFloat();

            float troco = dinheiro - total_pagamento;

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

            System.out.print("\nQuantidade de fichas do cliente: ");
            int fichas = ler.nextInt();

            if (fichas == 0) {
                System.out.println("\nO cliente tem 0 fichas! Não é possível efetuar a compra");

                System.out.print("\nDeseja usar outra forma de pagamento (SIM - 1) (NÃO - 2)? ");
                int confirmar_pag = ler.nextInt();

                if (confirmar_pag != 1){
                    System.out.println("\nA compra não foi efetuada! Processo finalizado.");
                }

                if (pagamento == 1) {
                    System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

                    System.out.print("\nQuantia: R$ ");
                    float dinheiro = ler.nextFloat();

                    float troco = dinheiro - total_pagamento;

                    System.out.print("\nTroco: R$ " + troco);
                    System.out.println("\nCompra finalizada!");
                }

                if (confirmar_pag == 1) {
                    System.out.println("\nDINHEIRO EM ESPÉCIE - 1 \nPIX - 2 \nForma de pagamento:");
                    int novo_pagamento = ler.nextInt();

                    if (novo_pagamento == 1) {
                        System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

                        System.out.print("\nQuantia: R$ ");
                        float dinheiro = ler.nextFloat();

                        float troco = dinheiro - total_pagamento;

                        System.out.println("\nTroco: R$ " + troco);
                        System.out.println("\nCompra finalizada!");
                    }

                    if (novo_pagamento == 2) {
                        System.out.println("=-=-= FORMA DE PAGAMENTO: PIX =-=-=");

                        System.out.println("PIX DA CANTINA IFBA: pixcantinaifba@gmail.com");

                        int pagamento_efetuado = 2;

                        while (pagamento_efetuado != 1) {
                            System.out.println("Pagamento efetuado? (SIM - 1) (NÃO - 2)");
                            pagamento_efetuado = ler.nextInt();
                        }
                    }

                }
            }
            if (fichas != 0){
                System.out.println("\nAgora o cliente possui " + (fichas - 1) + " fichas.");
                System.out.println("\nCompra finalizada!");
            }
        }
    }
}