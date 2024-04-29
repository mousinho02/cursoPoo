package aula07a;

public class UFC {
    public static void main(String[] args) throws Exception {
        Lutador01 lutador[] = new Lutador01[6];
        
          lutador[0] = new Lutador01("Pretty Boy" , "França" , 31, 1.75f, 68.9f, 11, 3, 1 );
        
          lutador[1] = new Lutador01("Putscript" , "Brasil" , 29, 1.68f, 57.8f, 14, 2, 3 );
        
          lutador[2] = new Lutador01("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1) ;
        
          lutador[3] = new Lutador01 ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
          lutador[4] = new Lutador01("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
          lutador[5] = new Lutador01("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
          Luta UEC01 = new Luta();
          UEC01.marcarLuta(lutador[4], lutador[5]);
          UEC01.Lutar();
    }      
}
