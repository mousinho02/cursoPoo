
package aula06a;
public  class ControleRemoto implements Controlador {
    //Váriaveis
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    public ControleRemoto(){
     this.volume = 50;
     this.ligado = false;
     this.tocando = false;
    }
    public int getVolume(){
    return volume;
    }
    public void setVolume(int volume){
    this.volume = volume;
    }
    public boolean getLigado(){
    return ligado;
    }
    public void setLigado(boolean ligado){
    this.ligado = ligado;
    }
    public boolean getTocando(){
    return tocando;
    }
    public void setTocando(boolean tocando){
    this.tocando = tocando;
    }
    //Métodos Abstratos

    @Override
    public void ligar() {
    this.setLigado(true);
    }   

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado ? " + this.getLigado());
        System.out.println("Esta tocando ? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10 ){
            System.out.println("|");
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando menu ...");       
    }

    @Override
    public void maisVolume() {
    if (this.getLigado()){
    this.setVolume(this.getVolume() + 1);
    }   
    }

    @Override
    public void menosVolume() {
    if (this.getLigado()){
    this.setVolume(this.getVolume() - 1);
    }     
    }

    @Override
    public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0){
        this.setVolume(0);
        this.setTocando(false);
    } 
    }

    @Override
    public void desligarMudo() {
    if (this.getLigado() && this.getVolume() == 0){
    this.setVolume(50);
    }   
    }

    @Override
    public void play() {
    if (this.getLigado() && ! this.getTocando()){
    this.setTocando(true);
    }     
     }

    @Override
    public void pause() {
    if (this.getLigado() && this.getTocando()){
    this.setTocando(false);
    }
    }

    @Override
    public void fecharMenua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

   