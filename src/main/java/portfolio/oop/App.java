package portfolio.oop;

import portfolio.oop.Interfaces.IAlunoService;
import portfolio.oop.Interfaces.IPessoaService;
import portfolio.oop.Services.AlunoSarvice;
import portfolio.oop.Services.PessoaService;
import portfolio.oop.models.Aluno;
import portfolio.oop.models.Pessoa;

public class App 
{
    public static void main( String[] args )
    {
        IPessoaService _pessoaService = new PessoaService();
        IAlunoService _alunoService = new AlunoSarvice();
        Pessoa pessoa = _pessoaService.CreatePessoa("José Pessoa", 20);
        Aluno aluno = _alunoService.CreateAluno(pessoa.GetNome(), pessoa.GetIdade(), "CBXMQ004", "Programação Orientada a Objetos");
        Aluno aluno2 = _alunoService.CreateAluno("Leonardo Vinicius De Gasperin", 32, "Sei lá", "OOP");
        
        _pessoaService.imprimePessoaData(pessoa, "Informações de pessoa Original");
        _alunoService.imprimeAlunoData(aluno, "Informações de aluno Original");
        _alunoService.EditAlunoData(aluno, "Zezé", -3, null, "Engenharia de Software");
        _alunoService.imprimeAlunoData(aluno, "Informações de aluno editado");
        _pessoaService.imprimePessoaData(pessoa, "Informações de pessoa após aluno ser editado");
        _pessoaService.imprimePessoaData(aluno, "Informações da pessoa de aluno após edição");
        _pessoaService.EditPessoaData(pessoa, "José Pessoa", 45);
        _pessoaService.imprimePessoaData(pessoa, "Pessoa após edição");
        _alunoService.imprimeAlunoData(aluno2, "Aluno após edição de pessoa");
        _alunoService.imprimeAlunoData(aluno2, "Eu");
    }
}
