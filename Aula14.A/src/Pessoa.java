public abstract class Pessoa {
  
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;
    public abstract void ganharExp();

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
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
    public int getExperiencia(){
        return this.experiencia;
    }
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
}

