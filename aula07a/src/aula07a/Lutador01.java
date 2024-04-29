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
     System.out.println(this.getNome + " tem " + this.getVitorias + " vitorias");
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
        this.setpeso(pe);
        this.setvitorias(vi);
        this.setderrotas(de);
        this.setempates(emp);
    }

    public String getNome(){
      return nome;
    }
    public void setNome(String no){
        nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        nacionalidade = na
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float alt){
        altura = alt;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        peso = pe;
        setCategoria()
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String c){
        categoria = c;
        if (peso < 50){
            System.out.println("Inválido");
        }else if (peso <= 70 ){
           categoria = "Leve"
        }else if (peso <= 85){
            categoria = "Médio"
        }else if (peso <= 125){
            categoria = "Pesado"
        }else{
            System.out.println ("Inválido")
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        vitorias = vi
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int emp){
        empates = emp;
    }
  


    
}