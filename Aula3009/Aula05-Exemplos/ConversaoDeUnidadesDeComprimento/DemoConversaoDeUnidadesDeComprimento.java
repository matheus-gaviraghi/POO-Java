
public class DemoConversaoDeUnidadesDeComprimento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversaoDeUnidadesDeComprimento conv = new ConversaoDeUnidadesDeComprimento();
		System.out.println("20 p�s s�o " + 
				conv.pesParaCentimetros(20) + " em cm!");
		System.out.println("5 polegadas s�o " + 
				conv.polegadasParaCentimetros(5) + " em cm!");
		System.out.println("20 p�s s�o " + 
				ConversaoDeUnidadesDeComprimento.pesParaCentimetros(20) + " em cm!");
		System.out.println("5 polegadas s�o " + 
				ConversaoDeUnidadesDeComprimento.polegadasParaCentimetros(5) + " em cm!");
	}

}
