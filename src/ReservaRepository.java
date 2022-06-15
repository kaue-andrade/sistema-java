import java.util.Scanner;
import java.util.ArrayList;

public class ReservaRepository {

    int posicao;
    String novo_cpf;

    Scanner ler = new Scanner(System.in);

    private ArrayList<Reserva> repository = new ArrayList<Reserva>();

    public void ReservaRepository(){

        this.repository = new ArrayList<Reserva>();
    }

    /*Percorrendo o Array e imprimindo o cliente na reverva*/
    public void listarClientesReverva() {
        for (int pos = 0; pos < this.repository.size();pos++) {
            System.out.println( (pos+1)+"-"+this.repository.get(pos).getCliente());
        }
    }

    //Metodo que lista os cliente da reserva e possibilita excluir
    public void deletarRevervaByCliente() {

        this.listarClientesReverva();
        System.out.println("\nEscolha entre os clientes acima para deletar!\n=====================================");

        System.out.println(">>> ");
        int index = ler.nextInt();

        System.out.println("\n");
        System.out.println("Tem certeza que deseja exlcuir o cliente?(y/n)");
        String opcao = ler.next();

        if(opcao.equalsIgnoreCase("y")) {
            this.repository.remove((index-1));
            System.out.println("Excluído com sucesso!");
            this.listarClientesReverva();
        }else {
            this.listarClientesReverva();}



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

