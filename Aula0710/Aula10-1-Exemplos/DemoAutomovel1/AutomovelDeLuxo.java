
public class AutomovelDeLuxo extends AutomovelBasico {
	
	// Redeclaracao e sobreposicao de variavel final
	private static final int NUMEROMAXIMODEPRESTACOES = 36;
	
	private boolean cambioAutomatico;
	private boolean sensorCrepuscular;

	AutomovelDeLuxo(String m, String c, int comb,
					boolean a, boolean ag, boolean ma,
					boolean ca, boolean sc) {
		super(m, c, comb, a, ag, ma);
		cambioAutomatico = ca;
		sensorCrepuscular = sc;
	}
	
	AutomovelDeLuxo(String m, String c, int comb) {
		super(m, c, comb);
		cambioAutomatico = true;
		sensorCrepuscular = true;
	}
	
	public float quantoCusta() {
		float preco = super.quantoCusta();
		if (cambioAutomatico) preco += 5000;
		if (sensorCrepuscular) preco += 2500.77;
		return preco;
	}
	
	public int quantasPrestacoes() {
		return NUMEROMAXIMODEPRESTACOES;
	}

        public void teste() {
		System.out.println("TESTE!\n");
        }
	
	public String toString() {
		String imprimir = super.toString();
		if (cambioAutomatico) imprimir += "Com cambio automatico!\n";
		if (sensorCrepuscular) imprimir += "Com sensor crepuscular!\n";
		return imprimir;
	}
}
