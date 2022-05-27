import java.util.HashMap;
import java.util.Scanner;

public class PlanoMensal {

    private String aluno;
    private int confirmar_pag;
    private int novo_pagamento;
    private float dinheiro;
    private int pagamento_efetuado;

    public void bancoMensal() {

        Scanner ler = new Scanner(System.in);

        HashMap<String, Integer> alunos = new HashMap<String, Integer>();

        alunos.put("Kauê Andrade dos Santos", 0);
        alunos.put("Ruth Oliveira Pereira", 8);
        alunos.put("Antonio Carlos Borges de Souza", 7);
        alunos.put("Antônio Leopoldo França Filho", 6);
        alunos.put("Ítalo Ricardo de Andrade Silva", 6);

        System.out.print("\nNome do aluno: ");
        aluno = ler.nextLine();

        System.out.println("\nNúmero de fichas do aluno " + aluno + ": " + alunos.get(aluno));

        if (alunos.get(aluno) == 0) {
            System.out.println("\nO cliente possui 0 fichas.");
        }

        if (alunos.get(aluno) != 0) {
            System.out.println("\nAgora o cliente possui " + (alunos.get(aluno) - 1) + " fichas. Faça a modificação no banco de dados.");
        }

        if (alunos.get(aluno) == 0) {
            System.out.println("\nO cliente tem 0 fichas! Não é possível efetuar a compra");

            System.out.print("\nDeseja usar outra forma de pagamento (SIM - 1) (NÃO - 2)? ");
            confirmar_pag = ler.nextInt();

            if (confirmar_pag != 1) {
                System.out.println("\nA compra não foi efetuada! Processo finalizado.");
            }

            if (confirmar_pag == 1) {
                System.out.print("\nDINHEIRO EM ESPÉCIE - 1 \nPIX - 2 \n\nForma de pagamento: ");
                novo_pagamento = ler.nextInt();

                if (novo_pagamento == 1) {
                    System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

                    System.out.print("\nQuantia: R$ ");
                    float dinheiro = ler.nextFloat();

                    //float troco = dinheiro - total_pagamento;

                    //System.out.println("\nTroco: R$ " + troco);
                    System.out.println("\nCompra finalizada!");
                }

                if (novo_pagamento == 1) {
                    System.out.println("\n=-=-= FORMA DE PAGAMENTO: DINHEIRO EM ESPÉCIE =-=-=");

                    System.out.print("\nQuantia: R$ ");
                    dinheiro = ler.nextFloat();

                    //float troco = dinheiro - total_pagamento;

                    //System.out.print("\nTroco: R$ " + troco);
                    //System.out.println("\nCompra finalizada!");
                }

                if (novo_pagamento == 2) {
                    System.out.println("=-=-= FORMA DE PAGAMENTO: PIX =-=-=");

                    System.out.println("PIX DA CANTINA IFBA: pixcantinaifba@gmail.com");

                    pagamento_efetuado = 2;

                    while (pagamento_efetuado != 1) {
                        System.out.println("Pagamento efetuado? (SIM - 1) (NÃO - 2)");
                        pagamento_efetuado = ler.nextInt();
                    }
                }
            }
        }
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getConfirmar_pag() {
        return confirmar_pag;
    }

    public void setConfirmar_pag(int confirmar_pag) {
        this.confirmar_pag = confirmar_pag;
    }

    public int getNovo_pagamento() {
        return novo_pagamento;
    }

    public void setNovo_pagamento(int novo_pagamento) {
        this.novo_pagamento = novo_pagamento;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getPagamento_efetuado() {
        return pagamento_efetuado;
    }

    public void setPagamento_efetuado(int pagamento_efetuado) {
        this.pagamento_efetuado = pagamento_efetuado;
    }
}
