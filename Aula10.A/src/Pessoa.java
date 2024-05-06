public class Pessoa {
 
    private String nome;
    private String sexo;
    private int idade;

    public void fazerAniver(){
        this.idade++;
    }

    public void detalhes(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("Sexo : " + this.sexo);
        System.out.println("--------------------------");
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return this.nome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

}
