public class DemoRoboSimples {

	public static void main(String[] args) {
		// Cria��o dos robos utilizando diferentes construtores a partir da
		// sobrecarga de m�todos
		RoboSimples quebraOsso = new RoboSimples("Quebra Osso", 20, 10, 'S');
		RoboSimples barbaridade = new RoboSimples("Che Barbaridade!");
		RoboSimples semNome = new RoboSimples();
		// Movimenta��o dos robos
		quebraOsso.move(10);
		barbaridade.mudaDirecao('L');
		barbaridade.move(5);
		semNome.move();
		// Apresenta a posi��o atual de cada rob�
		System.out.print(quebraOsso);
		System.out.print(barbaridade);
		System.out.print(semNome);
	}
}
