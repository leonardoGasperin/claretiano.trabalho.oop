package portfolio.oop.Services;

import portfolio.oop.Interfaces.IAlunoService;
import portfolio.oop.models.Aluno;

public class AlunoSarvice implements IAlunoService {
    public Aluno CreateAluno(String nome, int idade, String matricula, String curso){
        return new Aluno(nome, idade, matricula, curso);
    }

    
    public void imprimeAlunoData(Aluno aluno, String tabelaNome){
        System.out.println(aluno.GetAlunoData(tabelaNome));
    }


    public void EditAlunoData(Aluno aluno, String nome, int idade, String matricula, String curso){
        if(nome != null && !nome.isEmpty())
            aluno.EditNome(nome);
        if(idade >= 0)
            aluno.EditIdade(idade);
        if(matricula != null && !matricula.isEmpty())
            aluno.EditMatricula(matricula);
        if(curso != null && !curso.isEmpty())
            aluno.EditCurso(curso);
    }
}
