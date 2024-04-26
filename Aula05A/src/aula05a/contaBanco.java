
package aula05a;
public class contaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.gettipo());
        System.out.println("Dono: " + this.getdono());
        System.out.println("Saldo: " + this.getsaldo());
        System.out.println("Status: " + this.getstatus());
    }
            
    public void abrirConta(String t){
     this.settipo(t);
     this.setstatus(true);
     if (t == "CC"){
     this.setsaldo(50);
     }else if (t == "CP") {
     this.setsaldo(150);
     }
        System.out.println("Conta aberta!");
     }
    
    public void fecharConta(){
     this.setsaldo(saldo);
       if (saldo > 0){
           System.out.println("Conta com dinheiro");
       }else if (saldo < 0) {
           System.out.println("Conta em débito");
       }else {
           this.setstatus(false);
           System.out.println("Conta fechada");
       }
     
    }
   
    public void depositar(float valor){
     if(this.getstatus()){
     this.setsaldo(this.getsaldo() + valor);
         System.out.println("Deposito realizado na conta de " + this.getdono());
     } else{
         System.out.println("Não foi possivel fazer o depósito");
     }
    
    }
    public void sacar(float valor){
     if (this.getstatus()){
      if(this.getsaldo() >= valor ){
       this.setsaldo(this.getsaldo() - valor);
          System.out.println("Saque realizado com sucesso na conta de " + this.getdono() );
      }else{
          System.out.println("Saldo insuficiente");
      }
     }else{
         System.out.println("Impossivel fazer saques com conta fechada");
     }
    }
    public void pagarMensal(){
     int valor = 0;
     if (this.gettipo() == "CP"){
       valor = 12;
     }else if(this.gettipo() == "CC"){
       valor = 20;
     }
     if (this.getstatus()) {
      this.setsaldo(this.getsaldo() - valor);
         System.out.println("Mensalidade paga com sucesso por " + this.getdono());
    }else{
         System.out.println("Impossivel pagar uma conta fechada!");
     }
    }
    
    //Métodos especiais
    public contaBanco(){
    this.setsaldo(0);
    this.setstatus(false);        
    }
    public int getnumConta(){
    return numConta;
    }
    public void setnumConta(int numConta){
    this.numConta = numConta;
    }
    public String gettipo(){
    return tipo;
    } 
    public void settipo(String tipo){
    this.tipo = tipo;
    }
    public String getdono(){
    return dono;
    }
    public void setdono(String dono){
    this.dono = dono;
    } 
    public float getsaldo(){
    return saldo;
    }
    public void setsaldo(float saldo){
    this.saldo = saldo;
    }
    public boolean getstatus(){
    return status;
    }
    public void setstatus(boolean status){
    this.status = status;
    }
}
