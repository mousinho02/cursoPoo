
package aula02b;
public class Aula02B {
    public static void main(String[] args) {
       Teclado teclado1 = new Teclado();
       teclado1.modelo = "Mancer"; 
       teclado1.cor = "Colorido";
       teclado1.digitar = true;
       teclado1.status();
       teclado1.escrever();
       teclado1.mudarCor();
    }
    
}
