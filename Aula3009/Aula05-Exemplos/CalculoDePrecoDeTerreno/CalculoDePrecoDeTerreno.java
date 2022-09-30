
public class CalculoDePrecoDeTerreno {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco;
		System.out.print("O pre�o do terreno N1 � ");
		preco = precoDoTerreno(450, 1);
		System.out.println(preco);

		System.out.print("O pre�o do terreno Q1 � ");
		preco = CalculoDePrecoDeTerreno.precoDoTerreno(475, 4);
		System.out.println(preco);

		System.out.print("O pre�o do terreno F3 � ");
		System.out.println(precoDoTerreno(525, 2));  		// Uso de this?

	}
	
	private static double precoDoTerreno(double area, int localizacao) {
		double preco = 0;
		if (localizacao == 1) preco = area * 22.00; 
		if (localizacao == 2) preco = area * 27.00; 
		if (localizacao == 3) preco = area * 29.50; 
		if (localizacao == 4) preco = area * 31.50; 
		if (localizacao == 5) preco = area * 34.50; 
		return preco;
	}

}
