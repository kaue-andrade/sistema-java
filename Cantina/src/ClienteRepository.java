import java.util.Scanner;
import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<Cliente> repository;
    private int indice;
    private String novo_cliente;

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

        Cliente.set(cliente);

    }

    //Deletar

    public void deletar(Cliente cliente){
        repository.remove(cliente);
    }

}