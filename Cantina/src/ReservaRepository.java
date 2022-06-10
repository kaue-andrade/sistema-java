import java.util.Scanner;
import java.util.ArrayList;

public class ReservaRepository {

    int posicao;
    String novo_cpf;

    Scanner ler = new Scanner(System.in);

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

        System.out.print("\nPosição que deseja alterar: ");
        posicao = ler.nextInt();

        System.out.print("\nPosição que deseja alterar: ");
        novo_cpf = ler.next();

        repository.get(posicao).set(novo_cpf);

    }

    public void deletar(Reserva reserva){
        repository.remove(reserva);
    }

}

