public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;

    public void cancelarMatr(){
       this.matr = false;
    }

    public boolean getMatr(){
     return this.matr;
    }
    
    public void setMatr(boolean matr){
        this.matr = matr
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
}
