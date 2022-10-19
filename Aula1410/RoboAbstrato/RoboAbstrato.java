
// Classes abstratas n�o podem ser instanciadas
public abstract class RoboAbstrato {

	// Campos n�o podem ser abstratos: ou � utilizado na classe (private), 
	// ou herdado (est� pronto para ser usado pelas classes filhas)
	private String nomeRobo;
	private int posicaoXAtual, posicaoYAtual;
	private int direcaoAtual;	// em graus nesse momento
	
	// Construtores n�o podem ser abstratos: construtores inicializam informa��es 
	// espec�ficas da classe. Como redefinir construtor para uma classe ancestral?
	RoboAbstrato(String n, int px, int py, int d) {
		nomeRobo = n;
		posicaoXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}
	
	public void move() {
		// Executa m�todo abstrato!
		move(1);
	}
	
	// M�todo abstrato n�o tem corpo de execu��o
	public abstract void move(int passos);
	
	public void moveX(int passos) {
		posicaoXAtual += passos;
	}

	public void moveY(int passos) {
		posicaoYAtual += passos;
	}
	
	public void mudaDirecao(int novaDirecao) {
		direcaoAtual = novaDirecao;
	}
	
	public int qualDirecaoAtual() {
		return direcaoAtual;
	}
	
	public String toString() {
		String posicao;
		posicao = "Nome do Rob�: " + nomeRobo + "\n";
		posicao += "Posi��o do Rob�: (" + posicaoXAtual + "," + posicaoYAtual + ")\n";
		posicao += "Dire��o do Rob�: " + direcaoAtual + "\n";
		return posicao;
	}
}
