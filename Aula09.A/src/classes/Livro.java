package classes;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos
    public void detalhes(){
        System.out.println("Titulo do livro " + this.getTitulo);
        System.out.println("Autor do livro " + this.getAutor);
        System.out.println("Total de páginas no livro " + this.getTotPaginas);
        System.out.println("Página atual " + this.getPagAtual);
        System.out.println("O livro está aberto ? " + this.getAberto);
        System.out.println("Quem está lendo o livro ? " + this.getLeitor);
    }

    //Métodos Especiais 
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int tp){
        this.totPaginas = tp;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int pa){
        this.pagAtual = pa; 
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean ab){
        this.aberto = ab;
    }
    public Pessoa getLeitor(){
        return this.leitor
    }
    public void setLeitor(Pessoa leitor1){
        this.leitor = leitor1;
    }
    
    //Implementação da Interface
    @Override
    public void abrir(){
        this.setAberto(true);
    }

    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void folhear(int p){
        this.pagAtual = p;
    }

    @Override
    public void avancarPag(){
       this.setPagAtual(+1);
    }
    @Override
    public void voltarPag(){
        this.pagAtual(-1);
    }


}