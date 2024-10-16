package portfolio.oop.models;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    
    public Aluno (String nome, int idade, String matricula, String curso){
        super(nome, idade);
        this.SetMatricula(matricula);
        this.SetCurso(curso);
    }

    private void SetMatricula(String matricula){
        this.matricula = matricula;
    }

    private void SetCurso(String matricula){
        this.matricula = matricula;
    }

    public String GetMatricula(){
        return this.matricula;
    }

    public String GetCurso(){
        return this.matricula;
    }

    public void EditMatricula(String matricula){
        this.SetMatricula(matricula);
    }

    public void EditCurso(String matricula){
        this.SetCurso(curso);
    }

    public String GetAlunoData(String tabelaNome){
        return this.GetPessoaData(tabelaNome) +
               "\n|| Matricula:\t" + this.GetMatricula() +
               "\n|| Curso:\t\t" + this.GetCurso() +
               "\n==================================";
    }
}
