public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
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
    public String toString(){
        return "Gafanhoto {" +super.toString() + " login= " + login + "total Assistidos= " + totAssistido +" }";
    }


}
