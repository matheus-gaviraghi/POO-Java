package listaExercicios.cap5.cap5_Ex13;

public class Data {
  int dia, mes, ano;

  //  public void inicializaData(int d, int m, int a) {
  public Data(int d, int m, int a) {
    if(dataEValida(d, m, a)){
      dia = d;
      mes = m;
      ano = a;
    } else{
      dia = 0;
      mes = 0;
      ano = 0;
    }
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
