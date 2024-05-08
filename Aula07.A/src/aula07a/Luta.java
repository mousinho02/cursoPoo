package aula07a;

import java.util.Random;

public class Luta {
  
    //Atributos   
  private Lutador01 desafiado;
  private Lutador01 desafiante;
  private int rounds;
  private boolean aprovada;

  //Métodos 
  public void marcarLuta(Lutador01 lutador1, Lutador01 lutador2){
    if (lutador1.getCategoria() == lutador2.getCategoria() && (lutador1 != lutador2) ){
        this.aprovada = true;
        this.desafiado = lutador1;
        this.desafiante = lutador2;
    }else {
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
    }
  }
  public void Lutar(){
    if(this.aprovada){
    System.out.println("### DESAFIADO ###");
    this.desafiado.apresentar();
    System.out.println("### DESAFIANTE ###");
    this.desafiante.apresentar();; 
    System.out.println("===================");
    System.out.println("RESULTADO DA LUTA");


    Random aleatorio = new Random();    
    int vencedor = aleatorio.nextInt(3);
    switch (vencedor) {
        case 0:
        
         System.out.println("EMPATE!!");
         this.desafiado.empatarLuta();
         this.desafiante.empatarLuta();
        break;

        case 1:
       
         System.out.println("Vitória do " + this.desafiado.getNome());
         this.desafiado.ganharLuta();
         this.desafiante.perderLuta();
        break;

        case 2:
       
        System.out.println("Vitória do " + this.desafiante.getNome());
        this.desafiante.ganharLuta();
        this.desafiado.perderLuta();
        break;
    }
    System.out.println("====================");
    }else{
        System.out.println("Impossivel Lutar!");
    }
  }

  //Métodos especiais 
  public Lutador01 getDesafiado(){
    return desafiado;
  }
  public void setDesafiado(Lutador01 dd){
    this.desafiado = dd;
  }
  public Lutador01 getDesafiante(){
    return desafiante;
  }
  public void setDesafiante(Lutador01 df){
    this.desafiante = df;
  }
  public int getRounds(){
    return rounds;
  }
  public void setRounds(int r){
    this.rounds = r;
  }
  public boolean getAprovada(){
    return aprovada;
  }
  public void setAprovada(boolean a){
    this.aprovada = a;
  }

}
