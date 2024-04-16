
package aula02c;
public class Televisao {
    String marca;
    boolean ligo;
   boolean desligo;
   boolean mudoCanal;
   boolean aumentoVolume;
   boolean abaixoVolume;
   
   void status(){
       System.out.println("A marca da televisao é" + this.marca);
       System.out.println("Você quer deixar a televisao ligada ?" + this.ligo);
       System.out.println("Você quer mudar de canal ? " + this.mudoCanal);
       System.out.println("Você quer aumentar o volume ? " + this.aumentoVolume);
   }

   void mudarCanal(){
     if (mudoCanal == true)
           System.out.println("Mudando de canal agora");
     else{ System.out.println("Sem mudanças de canal até agora");
              
   }
   }
   void aumentarVolume(){
     if (aumentoVolume == true)
           System.out.println("Aumentando o volume");
    }
   void abaixarVolume(){
     if (abaixoVolume == true)
           System.out.println("Abaixando o volume");
   }   
}