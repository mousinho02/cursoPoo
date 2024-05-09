public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.login = login;
        this.experiencia = 0;
        this.totAssistido = 0;
    }
    
    @Override 
    public void ganharExp(){
       this.experiencia ++;
    }

    public void viuMaisUm(){
        this.totAssistido ++;
    }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public int getTotAssistido(){
        return this.totAssistido;
    }
    public void setTotAssistido(int totAssistido){
        this.totAssistido = totAssistido;
    } 

}
