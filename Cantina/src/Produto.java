import java.util.Scanner;

public class Produto {

    Scanner ler = new Scanner(System.in);

    public void produto(){

        System.out.print("\nQual é o produto que deseja comprar? ");
        String produto_p = ler.next();

        float bala_ice_kiss = (float) 0.10;
        float pirulito_pop = (float) 0.50;
        float chocolate_sonho_de_valsa = (float) 1.50;
        float pacote_de_jujuba = (float) 1.0;
        float trident = (float) 2.50;
        float pipoca_doce = (float) 1.50;

        System.out.println("Valor da bala ice kiss: R$" + bala_ice_kiss);
        System.out.println("Valor do pirulito pop: R$" + pirulito_pop);
        System.out.println("Valor do chocolate sonho de valsa: R$" + chocolate_sonho_de_valsa);




    }
}
