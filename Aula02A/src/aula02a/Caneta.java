
package aula02a;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    boolean rabisco;
    void status(){
        System.out.println("O modelo da caneta desejada e " + this.modelo);
        System.out.println("A cor da mesma e :" + this.cor);
        System.out.println("A ponta da caneta e de: " + this.ponta);
        System.out.println("A carga da caneta e :" + this.carga);
        System.out.println("Voce quer destampar a caneta ?" + this.tampada);
        System.out.println("Voce quer rabiscar ? " + this.rabisco);
    }
    
    void destampar(){
      if(tampada == false)
          System.out.println("Caneta  esta tampada");
          else{
              System.out.println("Caneta nao esta tampada");
      }
    }
    void escrever(){
      if (tampada == false)
            System.out.println("Caneta nao pode escrever pois esta tampada");
      else{
            System.out.println("Escrevendo");
      }
    }
    void rabiscar(){
       if (rabisco == true)
            System.out.println("Estou rabiscando");
       else{
           System.out.println("Nao posso rabiscar");
       }
    }
   
}

