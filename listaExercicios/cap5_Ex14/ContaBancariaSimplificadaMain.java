package listaExercicios.cap5_Ex14;

public class ContaBancariaSimplificadaMain {

	public static void main(String[] args) {
		ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
		conta1.abreConta("Matheus", 10000, true);
		conta1.mostrarDados();
		
		ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();
		conta2.abreConta("Eduardo", 100, false);
		conta2.mostrarDados();
	}

}
