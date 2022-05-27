import java.util.Scanner;

public class CantinaMain {
    public static void main(String[] args) {

        //Criação dos Scanners

        Scanner ler = new Scanner(System.in);

        //Instanciando objetos

        Produtos p1 = new Produtos();
        PlanoMensal a1 = new PlanoMensal();

        System.out.println("=-=-= Cantina - IFBA =-=-=");

        p1.bancoProdutos();

        a1.bancoMensal();
        //a1.bancoMensal();

    }
}
