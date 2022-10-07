package listaExercicios.cap5.cap5_Ex13;

/*Escreva uma versão da classe RegistroAcademico que tenha o campo númeroDeMatrícula declarado
como static, e que incremente o valor desse campo cada vez que uma instância da classe 
for criada. Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar
seu funcionamento. */

public class RegistroAcademico {
    private String nomeDoAluno;
    static private int numeroDaMatricula = 0;
    private Data dataDeNascimento;
    private boolean eBolsista;
    private int anoDeMatricula;
  
    private int curso;
    private int percentualCurso;

    public RegistroAcademico(String nome, Data data, 
                             boolean bolsa, int ano, int c, int p) {
      nomeDoAluno = nome;
      numeroDaMatricula ++;
      dataDeNascimento = data;
      eBolsista = bolsa;
      anoDeMatricula = ano;
  
      curso = c;
      percentualCurso = p;
    }
  
    public double calculaMensalidade() {
      double m = 0;
      switch (curso) {
        case 1: m = 400;
                break;   
        case 2: m = 450;
                break;
        case 3: m = 500;
                break;
        case 4: m = 450;
                break;
        default: System.out.println("Curso não encontrado!\n");
      }
      m = m * (percentualCurso / 100.0);
      return m;
    }
  
    public void mostraRegistro() {
 
      String msg;
      msg = nomeDoAluno + " matriculado em " + anoDeMatricula + 
            " com matrícula número " + numeroDaMatricula + "\n";
      msg += "Nascido em " + dataDeNascimento.mostraData() + "\n";
      if (eBolsista)
        msg += "É bolsista"; 
      System.out.println(msg);
    }
}
