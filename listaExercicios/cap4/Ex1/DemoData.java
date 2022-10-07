package listaExercicios.cap4.Ex1;
import java.util.Scanner;

public class DemoData {
    
    public static void main (String[] args){
        System.out.println("Digite uma data: ");
        System.out.println("Dia: ");
		Scanner leitura = new Scanner(System.in);
		int dia = leitura.nextInt();
        System.out.println("Mês: ");
        int mes = leitura.nextInt();
        System.out.println("Ano: ");
        int ano = leitura.nextInt();
		leitura.close();

        Data data = new Data(dia, mes, ano);

    }
}
