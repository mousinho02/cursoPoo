import classes.Livro;
import classes.Pessoa;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[2];

        p[0] = new Pessoa("Luiz", 17, "M");
        p[1] = new Pessoa("Larah", 15, "F");

        l[0] = new Livro("Aprendendo POO", "Ezequias", 900, p[0]);
        l[1] = new Livro("Aprendendo Java", "Geovanna", 700, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].detalhes();
        
        
        

        
    }
}
