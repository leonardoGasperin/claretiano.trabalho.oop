package portfolio.oop.models;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.SetNome(nome);
        this.SetIdade(idade);
    }

    private void SetNome(String nome){
        this.nome = nome;
    }

    private void SetIdade(int idade){
        this.idade = idade;
    }

    public String GetNome(){
        return this.nome;
    }

    public int GetIdade(){
        return this.idade;
    }

    public void EditNome(String nome){
        this.SetNome(nome);
    }

    public void EditIdade(int idade){
        this.SetIdade(idade);
    }

    public void ImprimePessoaInfo(Pessoa pessoa){
        System.out.println( "Nome: " + this.GetNome() +
                            "\nIdade: " + this.GetIdade());
    }
}
