package listaExercicios.cap5.cap5_Ex13;

public class Data {
  int dia, mes, ano;

  //  public void inicializaData(int d, int m, int a) {
  public Data(int d, int m, int a) {
    dia = d;
    mes = m;
    ano = a;
  }

  public boolean dataEValida(int d, int m, int a) {
    if ((d >= 1) && (d <= 31)) 
      if ((m >= 1) && (m <= 12)) 
        if (a >= 1) 
          return true;
    return false; 
  }

  /*
  public void mostraData() {
    System.out.println(dia + "/" + mes + "/" + ano);
  }
  */
  public String mostraData() {
    return (dia + "/" + mes + "/" + ano);
  }
}