import Classes.Animal;
import Classes.Arara;
import Classes.Ave;
import Classes.Cachorro;
import Classes.Canguru;
import Classes.Cobra;
import Classes.GoldFish;
import Classes.Mamifero;
import Classes.Peixe;
import Classes.Repitil;
import Classes.Tartaruga;

public class App {
    public static void main(String[] args) throws Exception {
        Ave a = new Ave();
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        Repitil r = new Repitil();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        c.locomover();
        k.emitirSom();
        k.abanarRabo();
        j.locomover();
        t.locomover();
        g.alimentar();
        e.locomover();

        

        
    }
}
