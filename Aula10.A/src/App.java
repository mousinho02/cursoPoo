public class App {
    public static void main(String[] args) throws Exception {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Claúdio");
       p4.setNome("Fabiana");

       p1.setIdade(19);
       p4.setIdade(35);
       
       p1.detalhes();
       p2.detalhes();
       p3.detalhes();
       p4.detalhes();

       p2.setCurso("Informática");
       p3.setSalario(2500.75f);
       p4.setSetor("Estoque");

        
    }
}
