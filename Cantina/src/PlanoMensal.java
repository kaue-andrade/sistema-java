import java.util.HashMap;

public class PlanoMensal {

    public int bancoDados(String aluno){

        HashMap<String, Integer> alunos = new HashMap<String, Integer>();

        alunos.put("Kauê Andrade dos Santos", 8);
        alunos.put("Ruth  Pereira", 8);
        alunos.put("Antonio Carlos Borges de Souza", 7);
        alunos.put("Antônio Leopoldo França Filho", 6);
        alunos.put("Ítalo Ricardo de Andrade Silva", 6);

        int fichasReturn = alunos.get(aluno);

        return fichasReturn;
    }
}
