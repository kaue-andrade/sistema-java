import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<Cliente> repository;

    public ClienteRepository(){
        this.repository = new ArrayList<Cliente>();
    }
    public void inserir(Cliente cliente){
        repository.add(cliente);
    }
    public ArrayList<Cliente> getAll(){
        return repository;
    }
    public Cliente getOne(int cpf){
        for (Cliente cliente:repository) {
            if(cliente.getCpf() == cpf){
                return cliente;
            }
        }
        return null;
    }
}