import java.util.;
import java.util.ArrayList;

public class ReservaRepository {

    int posicao;
    int novo_cpf;

    private ArrayList<Reserva> repository;

    public void ReservaRepository(){

        this.repository = new ArrayList<Reserva>();
    }
    public void inserir(Reserva reserva){

        repository.add(reserva);
    }
    public ArrayList<Reserva> getAll(){

        return repository;
    }
    public Reserva getOne(String cpf){
        for (Reserva reserva:repository) {
            if(reserva.getCpf() == cpf){
                return reserva;
            }
        }
        return null;
    }

    //Teste de alteração

    public void alterar(Reserva reserva){



        Reserva.set(reserva);

    }

    public void deletar(Reserva reserva){
        repository.remove(reserva);
    }

}

