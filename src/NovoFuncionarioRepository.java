import java.util.Scanner;
import java.util.ArrayList;

public class NovoFuncionarioRepository {

    int posicao;
    String novo_cpf;

    Scanner ler = new Scanner(System.in);

    private ArrayList<NovoFuncionario> repository;

    public void NovoFuncionarioRepository(){

        this.repository = new ArrayList<NovoFuncionario>();

    }
    public void inserir(NovoFuncionario funcionario){

        repository.add(funcionario);

    }
    public ArrayList<NovoFuncionario> getAll(){

        return repository;
    }
    public NovoFuncionario getOne(String cpf){
        for (NovoFuncionario funcionario:repository) {
            if(funcionario.getCpf() == cpf){
                return funcionario;
            }
        }
        return null;
    }

    //Alteração no ArrayList

    public void alterar(NovoFuncionario funcionario){

        System.out.print("\nPosição que deseja alterar: ");
        posicao = ler.nextInt();

        System.out.print("\nPosição que deseja alterar: ");
        novo_cpf = ler.next();

        repository.get(posicao).set(novo_cpf);

    }

    public void deletar(NovoFuncionario funcionario){
        repository.remove(funcionario);
    }

}
