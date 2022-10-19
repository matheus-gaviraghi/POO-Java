
public class DemoEmprestimoBancario1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa person = new Pessoa("Person", 54321, new Data(2, 2, 1996));
		Funcionario theMan = 
				new Funcionario("The Man", 
				12345, new Data(1, 2, 1990), 
				new Data(2, 1, 2010), 2000);
		ChefeDeDepartamento theBoss = 
				new ChefeDeDepartamento("The Boss", 
				12345, new Data(1, 2, 1980), 
				new Data(2, 1, 2000), 4000,
				"Recursos Humanos", new Data(1, 2, 2005));
		System.out.println(person + "Empr�stimo de: " + calculaEmprestimo(person));
		System.out.println(theMan + "Empr�stimo de: " + calculaEmprestimo(theMan));
		System.out.println(theBoss + "Empr�stimo de: " + calculaEmprestimo(theBoss));
	}

	// Calcula empr�stimo para os diferentes tipos de pessoa (pessoa constinua recebendo R$1.000,00)
	public static float calculaEmprestimo(Pessoa f) {		
		float emprestimo = 1000f;
		// Verifica o tipo da inst�ncia com a palavra-chave instanceof
		if (f instanceof ChefeDeDepartamento) {
			// Casting expl�cito para ChefeDeDepartamento
			ChefeDeDepartamento t = (ChefeDeDepartamento)f;
			emprestimo = 4.0f * t.qualSalario();
		} else if (f instanceof Funcionario) {
			// Casting expl�cito para Funcionario
			Funcionario t = (Funcionario)f;
			emprestimo = 2.0f * t.qualSalario();
		}
		return emprestimo;
	}

}
