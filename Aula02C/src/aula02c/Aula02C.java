
package aula02c;
public class Aula02C {
    public static void main(String[] args) {
    Televisao televisao1 = new Televisao();
    televisao1.marca = "AOC";
    televisao1.abaixoVolume = false;
    televisao1.aumentoVolume = true;
    televisao1.desligo = true;
    televisao1.ligo = false;
    televisao1.mudoCanal = false;
    televisao1.status();
    televisao1.mudarCanal();
    televisao1.abaixarVolume();
    televisao1.aumentarVolume();
    
    
    }
    
}
