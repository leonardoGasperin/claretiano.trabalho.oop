package portfolio.oop.Services;

import portfolio.oop.Interfaces.IPessoaService;
import portfolio.oop.models.Pessoa;

public class PessoaService implements IPessoaService{
    public Pessoa CreatePessoa(String nome, int idade){
        return new Pessoa(nome, idade);
    }

    public void imprimePessoaData(Pessoa pessoa, String tabelaNome){
        System.out.println(pessoa.GetPessoaData(tabelaNome));
    }
    
    public void EditPessoaData(Pessoa pessoa, String nome, int idade){
        if(nome != null && !nome.isEmpty())
            pessoa.EditNome(nome);
        if(idade >= 0)
            pessoa.EditIdade(idade);
    }
}
