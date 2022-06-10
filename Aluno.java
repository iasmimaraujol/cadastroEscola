public class Aluno extends Pessoa{
    private int nota;
    private String materia;
    

    public void setNota(int nota){
        this.nota = nota;
    }
    public int getNota(){
        return this.nota;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return this.materia;
    }
    @Override
    public String toString(){
        return (getNome() + " " + getIdade()+ " " + getSexo()+ " " +getMateria() + " ");
    }

}
