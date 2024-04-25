
package aula05a;
public class Aula05A {
    public static void main(String[] args) {
     contaBanco pessoa1 = new contaBanco();
     pessoa1.setnumConta(1111);
     pessoa1.setdono("Jubileu");
     pessoa1.abrirConta("CC");
     
     
     contaBanco pessoa2 = new contaBanco();
     pessoa2.setnumConta(2222);
     pessoa2.setdono("Creuza");
     pessoa2.abrirConta("CP");
     
    
     
    pessoa1.depositar(100);
    pessoa2.depositar(500);
    
    pessoa1.fecharConta();
    
    pessoa1.sacar(150);
    pessoa2.sacar(100);
     
    pessoa1.estadoAtual();
    pessoa2.estadoAtual();
    
   
    }
    
}
