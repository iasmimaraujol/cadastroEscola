public class Professor{
    private int salario;
    private String especialidade;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void receberAumento(float valor){
        this.salario += valor;
    }
}