package portfolio.oop.Interfaces;

import portfolio.oop.models.Pessoa;

public interface IPessoaService {
    Pessoa CreatePessoa(String nome, int idade);
    void imprimePessoaData(Pessoa pessoa, String tabelaNome);
    void EditPessoaData(Pessoa pessoa, String nome, int idade);
}
