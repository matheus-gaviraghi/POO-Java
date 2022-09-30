package codigos.Aula2309;


public class ContaBancariaSimplificadaMain {

	public static void main(String[] args) {
		ContaBancariaSimplificada c1;
		c1 = new ContaBancariaSimplificada();
		c1.abreContaSimples("Nome Teste 1");
		c1.abreConta("Nome Teste 2", 1000, true);
		c1.deposita(1000);
		c1.retira(500);
		c1.mostrarDados();
	}

}
