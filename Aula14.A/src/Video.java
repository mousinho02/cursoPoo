public class Video implements AcoesVideo{
   private String titulo;
   private float avaliacao;
   private float views;
   private float curtidas;
   private boolean reproduzindo;

   public Video(String titulo){
      this.titulo = titulo;
      this.avaliacao = 0f;
      this.views = 0f;
      this.curtidas = 0f;
      this.reproduzindo = false;
   }

   public String getTitulo(){
    return this.titulo;
   }
   public void setTitulo(String titulo){
    this.titulo = titulo;
   }
   public float getAvaliacao (){
    return this.avaliacao;
   }
   public void setAvaliacao (float avaliacao ){
    this.avaliacao = avaliacao;
   }
   public float getViews (){
    return this.views;
   }
   public void setViews (float views ){
    this.views = views;
   }
   public float getCurtidas (){
    return this.curtidas;
   }
   public void setCurtidas (float curtidas ){
    this.curtidas = curtidas;
   }
   public boolean getReproduzindo(){
    return this.reproduzindo;
   }
   public void setReproduzindo(boolean reproduzindo ){
    this.reproduzindo = reproduzindo;
   }

   @Override
   public void play(){
    this.reproduzindo = true;
   }
   @Override
   public void pause(){
    this.reproduzindo = false;
   }
   @Override
   public void like(){
    this.curtidas ++;
   }
   public void detalhes(){
      System.out.println("Titulo do video : " + this.getTitulo);
      System.out.println("Avaliação : " + this.getAvaliacao);
      System.out.println("Visualizações : " + this.getViews);
      System.out.println("Curtidas : " + this.getCurtidas);
      System.out.println("Reproduzindo : " + this.getReproduzindo);
   }

}
