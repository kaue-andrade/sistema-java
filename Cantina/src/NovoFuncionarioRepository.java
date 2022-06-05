import java.util.ArrayList;

public class NovoFuncionarioRepository {

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

    //Teste de alteração

    public void alterar(NovoFuncionario funcionario){

        NovoFuncionario.set(funcionario);

    }

    public void deletar(NovoFuncionario funcionario){
        repository.remove(funcionario);
    }

}

