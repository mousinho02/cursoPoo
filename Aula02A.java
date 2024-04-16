
package aula02p;

public class Aula02P {

    
    public static void main(String[] args) {
      Caneta caneta1 = new Caneta();  
      caneta1.modelo = "Faber Castel";
      caneta1.cor = "Azul";
      caneta1.ponta = 0.5f;
      caneta1.tampada = true;
      caneta1.status();
      caneta1.rabiscar();
      
      Caneta caneta2 = new Caneta();
      caneta2.modelo = "BIC";
      caneta2.cor = "Vermelho";
      caneta2.ponta = 1.0f;
      caneta2.tampada = false;
      caneta2.status();
      caneta2.rabiscar();
              
    }
    
}
