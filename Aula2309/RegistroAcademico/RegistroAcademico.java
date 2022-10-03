package Aula2309.RegistroAcademico;

public class RegistroAcademico {
    String nomeDoAluno;
    int numeroDaMatricula;
    Data dataDeNascimento;
    boolean eBolsista;
    int anoDeMatricula;
  
    private int curso;
    private int percentualCurso;
  
  //  public void inicializaRegistro(String nome, int matricula, Data data, 
  //                                 boolean bolsa, int ano) {
  //  public void inicializaRegistro(String nome, int matricula, Data data, 
  //                                 boolean bolsa, int ano, int c, int p) {
    public RegistroAcademico(String nome, int matricula, Data data, 
                             boolean bolsa, int ano, int c, int p) {
      nomeDoAluno = nome;
      numeroDaMatricula = matricula;
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
  /*
      System.out.println(nomeDoAluno + " matriculado em " + anoDeMatricula + 
                         " com matrícula número " + numeroDaMatricula);
      System.out.print("Nascido em ");
      dataDeNascimento.mostraData();
      if (eBolsista)
        System.out.println("É bolsista");
  */
      String msg;
      msg = nomeDoAluno + " matriculado em " + anoDeMatricula + 
            " com matrícula número " + numeroDaMatricula + "\n";
      msg += "Nascido em " + dataDeNascimento.mostraData() + "\n";
      if (eBolsista)
        msg += "É bolsista"; 
      System.out.println(msg);
    }
}
