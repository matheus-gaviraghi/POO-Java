
public class DemoAutomovel1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomovelBasico a1 = new AutomovelBasico("Up", "branco", Automovel.MOVIDOAGASOLINA); 
		AutomovelDeLuxo a2 = new AutomovelDeLuxo("Jetta", "preto", Automovel.MOVIDOAALCOOL);
//		System.out.println(a1 + " " + a1.quantoCusta() + "\n" + a1.quantasPrestacoes());
//		System.out.println(a2 + " " + a2.quantoCusta() + "\n" + a2.quantasPrestacoes());
		imprimir(a1);
		imprimir(a2);
	}

	// Polimorfismo de AutomovelBasico e AutomovelDeLuxo se passando como Automovel
	// tem que ser estatico, porque nao estamos criando um objeto ali na main pra acessar esse metodo, estamos chamando direto, e dentro de um metodo estatico o restante tambem tem que ser
	public static void imprimir(AutomovelBasico a) { // polimorfismo: esse metodo recebe qualquer objeto do tipo automovel, ou seja, de filhos da classe automovel
		System.out.println("Dados especificos do carro:\n");
		System.out.println(a);
		System.out.println("Custa: " + a.quantoCusta());
		System.out.println("Prestaces: " + a.quantasPrestacoes()); // esses metodos só funcionam porque existem em automovel
		
		if (a instanceof AutomovelDeLuxo) { // verificação durante execução: se a for do tipo da classe analisada, permite que acessemos os métodos desta classe
			((AutomovelDeLuxo)a).teste();
			// AutomovelDeLuxo x = (AutomovelDeLuxo)a; // a é uma referencia
			// x.teste();
		}

		// instanceof verifica qual é o tipo de objeto durante a execução e permite a reimpretação deste objeto como sendo de sua classe definitiva, permitindo acessar mais metodos e atributos que foram implementados nela
	}
}
