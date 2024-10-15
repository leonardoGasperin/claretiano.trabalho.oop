package portfolio.oop.models;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.SetName(nome);
        this.SetIdade(idade);
    }

    private void SetName(String nome){
        this.nome = nome;
    }

    private void SetIdade(int idade){
        this.idade = idade;
    }

    public String GetName(){
        return this.nome;
    }

    public int GetIdade(){
        return this.idade;
    }
}
