
public class DemoObjetoGeometrico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo(new Ponto2D(0,0),100);
		Circulo c2 = new Circulo(new Ponto2D(10,8),2);
		Retangulo r1 = new Retangulo(new Ponto2D(-2,-2), new Ponto2D(2,2));
		Retangulo r2 = new Retangulo(new Ponto2D(-100,0), new Ponto2D(100,1));
		imprimirTodosOsDados(c1);
		imprimirTodosOsDados(c2);
		imprimirTodosOsDados(r1);
		imprimirTodosOsDados(r2);
	}
	
	public static void imprimirTodosOsDados(ObjetoGeometrico og) {
		System.out.println(og);
		System.out.println("Per�metro: " + og.calculaPerimetro());
		System.out.println("�rea: " + og.calculaArea());
		if (og instanceof Circulo) System.out.println("Um c�rculo!");
		if (og instanceof Retangulo) System.out.println("Um ret�ngulo!");
		if (og instanceof ObjetoGeometrico) System.out.println("Um objeto geom�trico!");
		System.out.println();
	}

}
