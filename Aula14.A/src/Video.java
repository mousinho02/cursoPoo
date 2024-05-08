public class Video implements AcoesVideo{
   private String titulo;
   private float avaliacao;
   private float views;
   private float curtidas;
   private boolean reproduzindo;

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

}
