
package aula03a;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("O modelo da caneta desejada e " + this.modelo);
        System.out.println("A cor da mesma e :" + this.cor);
        System.out.println("A ponta da caneta e de: " + this.ponta);
        System.out.println("A carga da caneta e :" + this.carga);
        System.out.println("A caneta esta tampada ?" + this.tampada);
    }
    public void rabiscar(){
      if (tampada == true)
            System.out.println("Nao posso rabiscar");
      else{
            System.out.println("Estou rabiscando");
      }
    }
    public void tampar(){
     this.tampada = true;
    }
    public void destampar(){
     this.tampada = false;
    
    }
   
}

