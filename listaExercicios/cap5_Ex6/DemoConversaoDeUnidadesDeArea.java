package listaExercicios.cap5_Ex6;

public class DemoConversaoDeUnidadesDeArea {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversaoDeUnidadesDeArea c1 = new ConversaoDeUnidadesDeArea();
		System.out.println(c1.squaredFootToSquaredCM == ConversaoDeUnidadesDeArea.squaredFootToSquaredCM);
		System.out.println(c1.squaredMeterToSquaredFeet == ConversaoDeUnidadesDeArea.squaredMeterToSquaredFeet);
		System.out.println(c1.squaredMileToAcre == ConversaoDeUnidadesDeArea.squaredMileToAcre);
		System.out.println(c1.acreToSquaredFeet == ConversaoDeUnidadesDeArea.acreToSquaredFeet);
		double squaredMileToSquaredFeet = ConversaoDeUnidadesDeArea.squaredMileToAcre * ConversaoDeUnidadesDeArea.acreToSquaredFeet;
		System.out.println("1 milha quadrada é o equivalente à " + squaredMileToSquaredFeet + " pés quadrados");
		
	}
    
}
