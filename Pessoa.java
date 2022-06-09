public class Pessoa{
   private String sexo;
   private String nome;
   private int idade;

   public Pessoa(String sexo, String nome, int idade){
       setSexo(sexo);
       setNome(nome);
       setIdade(idade);
   }   

   public void setSexo(String sexo){
       this.sexo = sexo;
   }
   public String getSexo(){
       return this.sexo;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return this.nome;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   public int getIdade(){
       return this.idade;
   }
}