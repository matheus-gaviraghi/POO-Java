
public class SimuladorCaixaDeBanco2 {

	private static int numeroDoCliente;
	private int numeroDoCaixa;
	
	SimuladorCaixaDeBanco2(int n) {
		numeroDoCliente = 0;
		numeroDoCaixa = n;
		System.out.println("Caixa " + numeroDoCaixa + " iniciou operação!");
	}
	
	public void iniciaAtendimento() {
		numeroDoCliente++;
		System.out.print("Cliente com a senha número " + numeroDoCliente + ", favor ");
		System.out.println("dirigir-se imediatamente ao caixa número " + numeroDoCaixa + "!");
	}
	
}
