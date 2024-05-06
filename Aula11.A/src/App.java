public class App {
    public static void main(String[] args) throws Exception {
     
        //Pessoa p1 = new Pessoa();  (ERRO)

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        v1.fazerAniver();
        v1.informacoes();
        
        Aluno al1 = new Aluno();
        al1.setNome("Claúdio");
        al1.setMatricula(11111);
        al1.setCurso("Informática");
        al1.setIdade(16);
        al1.setSexo("M");
        al1.pagarMensalidade();
        al1.informacoes();

        Professor p1 = new Professor();
        p1.setNome("João");
        p1.setEspecialidade("Doutor em TI");
        p1.setIdade(39);
        p1.setSexo("M");
        p1.setSalario(6550f);
        p1.receberAumento(2413.15f);
        p1.informacoes();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(11122);
        b1.setCurso("Engenharia");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.informacoes();

        Tecnico t1 = new Tecnico();
        t1.setNome("Heitor");
        t1.setIdade(29);
        t1.setSexo("M");
        t1.setRegistroProfissional("Trabalhando ultimamente como motorista numa empresa chamada Pescaves");
        t1.informacoes();





        

    }
}
