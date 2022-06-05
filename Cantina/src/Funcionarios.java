import java.util.HashMap;
import java.util.Scanner;

public class Funcionarios {

    Scanner ler = new Scanner(System.in);

    int id = ler.nextInt();

    public void bancoFuncionario() {

        HashMap<Integer, String> funcionario = new HashMap<Integer, String>();

        funcionario.put(1234, "Josivaldo Ferreira da Silva");
        funcionario.put(4875, "Aberlado Souza dos Santos");
        funcionario.put(9658, "Carlos Ferreira Andrade");
        funcionario.put(3458, "André José da Silva Santos");

        System.out.println("\nAntigo sistema dos funcionários (Simulação): ");

        System.out.print("\nID do funcionário: ");

        System.out.println();

        System.out.println("Nome do funcionário: " + funcionario.get(id));

    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
