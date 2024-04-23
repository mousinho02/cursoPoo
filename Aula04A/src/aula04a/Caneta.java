
package aula04a;
public class Caneta {
    public String modelo;
    private float ponta;
    public String cor;
    public boolean tampada;

public Caneta(String m, String c, float p){
  this.modelo = m;
  this.cor = c;
  this.ponta = p;
  tampar();
  
}    
public String getmodelo(){
return this.modelo;
}
public void setmodelo(String m){
this.modelo = m;
}
public float getponta(){
return this.ponta;
}
public void setponta(float p){
this.ponta = p;
}
public void tampar(){
this.tampada = true;
}
public void destampar(){
this.tampada = false;
}
public void status(){
    System.out.println("SOBRE A CANETA");
    System.out.println("MODELO : " + this.modelo);
    System.out.println("PONTA : " + this.ponta);
    System.out.println("COR : " + this.cor);
    System.out.println("TAMPADA : " + this.tampada);
}
}

