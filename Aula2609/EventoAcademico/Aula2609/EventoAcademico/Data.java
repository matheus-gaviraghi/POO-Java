package Aula2609.EventoAcademico;
class Data {
	private byte dia, mes;
	private short ano;
	
	public void inicializaData(byte d, byte m, short a) {
		dia = d;
		mes = m;
		ano = a;
	}
	
	public byte retornaDia() {
		return dia;
	}

	public byte retornaMes() {
		return mes;
	}

	public short retornaAno() {
		return ano;
	}
}
