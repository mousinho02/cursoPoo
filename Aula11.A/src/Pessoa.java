public abstract class Pessoa {
  
  private String nome;
  private int idade;
  private String sexo;

  public void fazerAniver(){
    this.idade ++;
  }
  public String getNome(){
    return this.nome;
  }
  public void setNome(String nome){
    this.nome = nome ;
  }
  public int getIdade(){
    return this.idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }
  public String getSexo(){
    return this.sexo;
  }
  public void setSexo(String sexo){
    this.sexo = sexo;
  }
  
  public void informacoes(){
    System.out.println("Nome :" + this.getNome());
    System.out.println("Idade : " + this.getIdade());
    System.out.println("Sexo : " + this.getSexo());
    System.out.println("------------------------------");
  }

}
