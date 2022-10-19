public class RoboABateria extends RoboAbstrato {

	private final long ENERGIAPASSO = 10;
	private long energia;

	public RoboABateria(String n, int px, int py, int d, long e) {
		super(n, px, py, d);
		energia = e;
	}

	// Implementa��o do m�todo abstrato: obrigat�ria ao herdar uma classe abstrata
	public void move(int passos) {
		long energiaASerGasta = passos*ENERGIAPASSO;
		if (energiaASerGasta <= energia) {
			switch (qualDirecaoAtual()) {
				case 0: 	
					moveX(+passos); 
					break;
				case 45: 	
					moveX(+passos); 
					moveY(+passos); 
					break;
				case 90: 	
					moveY(+passos); 
					break;
				case 135: 	
					moveY(+passos); 
					moveX(-passos); 
					break;
				case 180: 	
					moveX(-passos); 
					break;
				case 225: 	
					moveX(-passos); 
					moveY(-passos); 
					break;
				case 270: 	
					moveY(-passos); 
					break;
				case 315: 	
					moveY(-passos); 
					moveX(+passos); 
					break;
			}
			energia -= energiaASerGasta;
		}
	}
	
	// Sobreposi��o de m�todo
	public String toString() {
		String retorno = super.toString();
		retorno += "Energia do Rob�: " + energia + "\n";
		return retorno;
	}
}