package portfolio.oop.models;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.SetName(nome);
        this.SetIdade(idade);
    }

    public String GetName(String nome){
        return this.nome;
    }

    public int GetIdade(int idade){
        return this,idade;
    }

    private void SetName(String nome){
        this.nome = nome;
    }

    private void SetIdade(int idade){
        this.idade = idade;
    }
}
