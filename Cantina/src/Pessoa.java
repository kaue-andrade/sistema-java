package com.company.Heranca;

public abstract class Pessoa {

   private int cpf;
   private String nome;
   private String fone;
   protected String Classe;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String setFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String aClasse) {
        Classe = aClasse;
    }

    public String toString(){
       return ("Nome: " + nome + " classe: " + Classe);
    }
}
