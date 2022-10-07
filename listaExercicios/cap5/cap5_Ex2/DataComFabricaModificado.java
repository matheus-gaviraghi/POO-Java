package listaExercicios.cap5.cap5_Ex2;
// Escreva,para a classe DataComFabrica,um método sete De Setembro que se
// comporte como uma fábrica de instâncias.
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
	
	// Fábrica de instância da classe DataComFabrica, reproduzindo 
	// objetos relativos ao 7 de setembro de determinado ano!
	public static DataComFabricaModificado seteDeSetembro(int ano) {
		return new DataComFabricaModificado(7, 9, ano);
	}
}
