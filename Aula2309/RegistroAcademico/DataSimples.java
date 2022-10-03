package Aula2309.RegistroAcademico;

public class DataSimples {
    byte dia, mes;
    short ano;
  
    public void inicializaDataSimples(byte d, byte m, short a) {
      dia = d;
      mes = m;
      ano = a;
    }
  
    public boolean dataEValida(byte d, byte m, short a) {
      if ((d >= 1) && (d <= 31)) 
        if ((m >= 1) && (m <= 12)) 
          if (a >= 1) 
            return true;
     return false; 
    }
  
    public boolean eIgual(DataSimples umaDataSimples) {
      if (dia == umaDataSimples.dia)
        if (mes == umaDataSimples.mes)
          if (ano == umaDataSimples.ano)
            return true;
     return false; 
    }
  
    public void mostraDataSimples() {
      System.out.println(dia + "/" + mes + "/" + ano);
    }
}
