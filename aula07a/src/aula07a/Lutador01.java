public class Lutador01{
    //Atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos

    public void apresentar(){
      System.out.println ("Nome : " + this.getNome);
      System.out.println ("Nacionalidade : " + this.getNacionalidade);
      System.out.println ("Idade : " + this.getIdade);
      System.out.println ("Altura : " + this.getAltura);
      System.out.println ("Peso : " + this.getPeso);
      System.out.println ("Categoria : " + this.getCategoria);
      System.out.println ("Vitórias : " + this.getVitorias);
      System.out.println ("Derrotas : " + this.getDerrotas)
      System.out.println ("Empates : " + this.getEmpates);
    }
    public void status(){
     System.out.println(this.getNome + " é um peso " + this.getCategoria);
     System.out.println("Ganhou " + this.getVitorias);
     System.out.println("Perdeu " + this.getDerrotas);
     System.out.println("Empatou " + this.getEmpates);
    }
    public void ganharLuta(){
      this.setVitorias(this.getVitorias() + 1)
    }
    public void perderLuta(){
      this.setDerrotas(this.getDerrotas() + 1)
    }
    public void empatarLuta(){
      this.setEmpates(this.getEmpates() + 1)
    }

    //Métodos especiais

    public Lutador01(String no, String na, int id, float alt, float pe, int vi, int de, int emp){
        this.setnome(no);
        this.setnacionalidade(na);
        this.setidade(id);
        this.setaltura(alt);
        this.setPeso(pe);
        this.setvitorias(vi);
        this.setderrotas(de);
        this.setempates(emp);
    }

    public String getNome(){
      return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float alt){
        this.altura = alt;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        setCategoria()
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if (peso < 52.2){
            System.out.println("Inválido");
        }else if (peso <= 70.3f){
           this.categoria = "Leve"
        }else if (peso <= 83.9f){
            this.categoria = "Médio"
        }else if (peso <= 120.2f){
            this.categoria = "Pesado"
        }else{
            System.out.println ("Inválido");
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int emp){
        this.empates = emp;
    }
  


    
}