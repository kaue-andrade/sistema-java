import java.util.Scanner;
import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<Cliente> repository;
    int posicao;
    String novo_cpf;

    Scanner ler = new Scanner(System.in);

    public ClienteRepository(){
        this.repository = new ArrayList<Cliente>();
    }
    public void inserir(Cliente cliente){
        boolean add = repository.add(cliente);
    }

    public ArrayList<Cliente> getAll(){
        return repository;
    }
    public Cliente getOne(String cpf){
        for (Cliente cliente:repository) {
            if(cliente.getCpf() == cpf){
                return cliente;
            }
        }
        return null;
    }

    //Teste de alteração

    public void alterar(Cliente cliente){

        System.out.print("\nPosição que deseja alterar: ");
        posicao = ler.nextInt();

        System.out.print("\nPosição que deseja alterar: ");
        novo_cpf = ler.next();

        repository.get(posicao).set(novo_cpf);

    }

    //Deletar

    public void deletar(Cliente cliente){
        repository.remove(cliente);
    }

}