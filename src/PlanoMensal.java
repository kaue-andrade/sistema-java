public class PlanoMensal {

    private String nome;
    private int fichas;

    public PlanoMensal(String nome, int fichas) {
        this.nome = nome;
        this.fichas = fichas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }
}