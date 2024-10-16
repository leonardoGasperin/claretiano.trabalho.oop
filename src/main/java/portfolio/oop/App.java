package portfolio.oop;

import portfolio.oop.models.Aluno;
import portfolio.oop.models.Pessoa;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa pessoa = new Pessoa("José Pessoa", 20);
        Aluno aluno = new Aluno(pessoa.GetNome(), pessoa.GetIdade(), "CBXMQ004", "Programação Orientada a Objetos");
        Aluno aluno2 = new Aluno("Leonardo Vinicius De Gasperin", 32, "Sei lá", "OOP");
        
        System.out.println(pessoa.GetPessoaData("Informações de pessoa Original"));
        System.out.println(aluno.GetAlunoData("Informações de aluno Original"));

        aluno.EditNome(null);
        aluno.EditIdade(0);
        aluno.EditMatricula(null);
        aluno.EditCurso(null);

        System.out.println(aluno.GetAlunoData("Informações de aluno editado"));
        System.out.println(pessoa.GetPessoaData("Informações de pessoa após aluno ser editado"));
        System.out.println(aluno.GetPessoaData("Informações da pessoa de aluno após edição"));
        System.out.println(aluno2.GetPessoaData("EU"));
    }
}
