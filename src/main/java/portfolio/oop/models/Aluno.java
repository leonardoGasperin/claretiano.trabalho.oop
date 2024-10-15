package portfolio.oop.models;

public class Aluno extends Pessoa {
    public String matricula;
    public String curso;
    
    public Aluno (String nome, int idade, String matricula, String curso){
        super(nome, idade);
        SetMatricula(matricula);
        SetCurso(curso);
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
}
