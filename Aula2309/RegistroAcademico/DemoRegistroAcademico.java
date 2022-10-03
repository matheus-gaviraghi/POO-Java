package Aula2309.RegistroAcademico;

public class DemoRegistroAcademico {
    public static void main(String args[]) {
    //     RegistroAcademico aluno1, aluno2;
        RegistroAcademico aluno1;
    //    Data d = new Data();
    //    d.inicializaData(10, 10, 2000);
        aluno1 = new RegistroAcademico("Michael Goodrich", 20120090, new Data(10, 10, 2000), true, 2012, 2, 50);
    //    aluno1.inicializaRegistro("Michael Goodrich", 20120090, d, true, 2012, 2, 50);
    
        aluno1.mostraRegistro();
     
        System.out.println("Mensalidade = " + aluno1.calculaMensalidade());
    
    //    aluno2 = new RegistroAcademico();
    //    aluno2.mostraRegistro();
      }
}
