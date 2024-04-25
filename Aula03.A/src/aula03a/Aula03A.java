
package aula03a;
public class Aula03A { 
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "BIC CRISTAL";
        caneta1.cor = "Azul";
        //caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        //caneta1.tampada = true;
        caneta1.status();
        caneta1.rabiscar();
        
    }
    
}
