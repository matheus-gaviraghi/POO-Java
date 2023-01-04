


public class ExemploExcecaoVetor1 {
	public static void main(String args[]) {
		String vetor[] = {"Exemplo", "Teste" };
		try {
			for (int i = 0; i  <= 3 ; i++) {
				System.out.println(vetor[i]);
			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Erro acessando vetor posicao ? ");
		} finally {
                	System.out.println("CONTINUANDO CÓDIGO ...");
		}
	}
}

