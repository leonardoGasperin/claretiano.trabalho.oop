package portfolio.oop.Interfaces;

import portfolio.oop.models.Aluno;

public interface IAlunoService {
    Aluno CreateAluno(String nome, int idade, String matricula, String curso);
    void imprimeAlunoData(Aluno aluno, String tabelaNome);
    void EditAlunoData(Aluno aluno, String nome, int idade, String matricula, String curso);
}
