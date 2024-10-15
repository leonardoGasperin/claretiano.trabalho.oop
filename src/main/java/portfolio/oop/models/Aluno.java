package portfolio.oop.models;

public class Aluno extends Pessoa {
    public String matricula;
    public String curso;
    
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

    public String ImprimeAlunoInfo(Aluno aluno){
        return this.ImprimePessoaInfo(this) +
               "\nMatricula: " + this.GetMatricula() +
               "\nCurso: " + this.GetCurso();
    }
}
