import java.util.HashMap;
import java.util.Scanner;

public class Funcionarios {
    public void bancoFuncionario() {
        Scanner ler = new Scanner(System.in);

        HashMap<Integer, String> funcionario = new HashMap<Integer, String>();

        funcionario.put(1234, "Josivaldo Ferreira da Silva");
        funcionario.put(4875, "Aberlado Souza dos Santos");
        funcionario.put(9658, "Carlos Ferreira Andrade");
        funcionario.put(3458, "André José da Silva Santos");

        System.out.print("\nID do funcionário: ");
        int id = ler.nextInt();

        System.out.println();

        System.out.println("Nome do funcionário: " + funcionario.get(id));



    }

    public Funcionarios() {
    }
}
