package listaExercicios.cap5.cap5_Ex3;
/*Escreva, para a classe DataComFabrica, um método primeiroDoMês que se comporte como
uma fábrica de instâncias. */
public class DataComFabricaModificado {
	private int dia, mes, ano;
	
	DataComFabricaModificado(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano; 
	}
	
	public static DataComFabricaModificado primeiroDoMes(int mes, int ano) {
		return new DataComFabricaModificado(1,mes, ano);
	}
}
