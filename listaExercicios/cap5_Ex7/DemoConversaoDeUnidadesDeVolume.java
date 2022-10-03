package listaExercicios.cap5_Ex7;

import java.util.Scanner;

public class DemoConversaoDeUnidadesDeVolume {

    public static void main(String[] args) {

		System.out.println("Digite o valor em litros a ser convertido (use vírgula para valores não inteiros): ");
		Scanner leitura = new Scanner(System.in);
		float leituraEntrada = leitura.nextFloat();
		leitura.close();

		// System.out.println(leituraEntrada);
		System.out.println("Conversão para centímetros cúbicos: " + leituraEntrada*ConversaoDeUnidadesDeVolume.literToCM3);
		System.out.println("Conversão para metros cúbicos: " + leituraEntrada/ConversaoDeUnidadesDeVolume.meter3ToLiters);
		System.out.println("Conversão para pés cúbicos: " + (leituraEntrada/ConversaoDeUnidadesDeVolume.meter3ToLiters)*ConversaoDeUnidadesDeVolume.meter3ToFeet3);
		System.out.println("Conversão para galões: " + (leituraEntrada/ConversaoDeUnidadesDeVolume.galonToLiters));	
		System.out.println("Conversão para polegadas cúbicas: " + (leituraEntrada/ConversaoDeUnidadesDeVolume.galonToLiters)*ConversaoDeUnidadesDeVolume.galonToInches3);

	}
    
}
