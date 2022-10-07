package listaExercicios.cap5.cap5_Ex14;

public class ContaBancariaSimplificadaMain {

	public static void main(String[] args) {
		ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("Matheus", 1000, true);
		conta1.toString();
		conta1.deposita(500);
		
		ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Eduardo");
		conta2.deposita(5000);
		System.out.println(conta1 + " " + conta2); // coloco o " " porque se fizer só o + ele tenta somar os objetos
	}

}
