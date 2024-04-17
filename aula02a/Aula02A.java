
package aula02a;
public class Aula02A { 
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "BIC CRISTAL";
        caneta1.cor = "Azul";
        caneta1.carga = 90;
        caneta1.ponta = 0.7f;
        caneta1.tampada = false;
        caneta1.rabisco = false;
        caneta1.status();
        caneta1.escrever();
        caneta1.rabiscar();
        caneta1.destampar();
    }
    
}
