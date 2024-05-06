public class Tecnico extends Pessoa  {
    
    private String registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando");
    }
    public String getRegistroProfissional(){
        return this.registroProfissional;
    }
    public void setRegistroProfissional(String rp){
        this.registroProfissional =rp;
    }

}
