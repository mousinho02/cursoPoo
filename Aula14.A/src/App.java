public class App {
    public static void main(String[] args) throws Exception {
       
       Video v[] = new Video[2];
       v[0] = new Video("Estudando Poo");
       v[1] = new Video("Aprimorando aprendizado");
       
       Gafanhoto g[] = new Gafanhoto[2];
       g[0] = new Gafanhoto("Luiz", 17, "M", "Mousinho02");
       g[1] = new Gafanhoto("Larah", 15, "F", "Larah02");
       
       Visualizacao vis = new Visualizacao(g[0] , v[0]);
       vis.info1();

    
       
       
       
       

       
       
       


    }
}
