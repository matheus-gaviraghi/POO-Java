/* Escreva um construtor para a classe Data que receba os valores correspondentes
ao dia, mês e ano, e inicialize os campos da classe, verificando antes se a data é válida. */

package listaExercicios.cap4.Ex1;

public class Data {
    private int ano, dia, mes;
    private static boolean dataValida;

    public Data(int d, int m, int a){
        
        if (verificaData(d, m, a)){
            ano = a;
            dia = d;
            mes = m;
            System.out.println("Data válida e setada: " + dia + "/" + mes + "/" + ano);
        }
        else System.out.println("Data inválida!");
        
    }

    public boolean verificaData(int d, int m, int a) {
        if (d > 0 && d <= 31) {
            if (m > 0 && m <= 12) {
                if (a > 0)
                    dataValida = true;
            }
        } else
            dataValida = false;
        return dataValida;
    }
}