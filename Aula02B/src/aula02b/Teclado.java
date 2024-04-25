
package aula02b;
public class Teclado {
   String modelo;
   String cor;
   boolean digitar;
   
   void status(){
       System.out.println("O modelo do teclado é " + this.modelo);
       System.out.println("A cor momentânea do teclado é " + this.cor);
       System.out.println("Podemos digitar neste teclado ??" +this.digitar);
   }
   
   void escrever(){
    if (digitar == true)
      System.out.println("Estou digitando");
    else
       {System.out.println("Não posso digitar!!");
   }
   } 


  void mudarCor(){
    if (digitar == true)
          System.out.println("Ops, mudando minha cor imediatamente!");
    else{ System.out.println("Não posso mudar minha cor ):");
    
    }
  }
}

