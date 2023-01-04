package listaExercicios.cap5.cap5_Ex13;

public class DemoRegistroAcademico {
    public static void main(String args[]) {
        RegistroAcademico aluno1, aluno2, aluno3;
        aluno1 = new RegistroAcademico("Michael Goodrich", new Data(10, 10, 2000), true, 2012, 1, 20);
        aluno1.mostraRegistro();
        System.out.println("Mensalidade = " + aluno1.calculaMensalidade());

        aluno2 = new RegistroAcademico("Michael Goodrich", new Data(10, 10, 2000), true, 2012, 2, 30);
        System.out.println("\nPróximo aluno\n");
        aluno2.mostraRegistro();
        System.out.println("Mensalidade = " + aluno2.calculaMensalidade());

        aluno3 = new RegistroAcademico("Michael Goodrich", new Data(50, 10, 2000), true, 2012, 3, 50);
        System.out.println("\nPróximo aluno\n");
        aluno3.mostraRegistro();
        System.out.println("Mensalidade = " + aluno3.calculaMensalidade());
    }
}
