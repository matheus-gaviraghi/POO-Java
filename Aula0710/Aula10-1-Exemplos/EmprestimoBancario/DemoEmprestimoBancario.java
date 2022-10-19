
public class DemoEmprestimoBancario{

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
		System.out.println(person + "Empréstimo de: " + calculaEmprestimo(person));
		System.out.println(theMan + "Empréstimo de: " + calculaEmprestimo(theMan));
		System.out.println(theBoss + "Empréstimo de: " + calculaEmprestimo(theBoss));
	}

	// Qualquer pessoa tem emprestimo de R$1.000,00
	public static float calculaEmprestimo(Pessoa p) {
		return 1000f;
	}

	// Funcionários (Funcionario ou ChefeDeDepartamento) tem empréstimos baseados em salário
	public static float calculaEmprestimo(Funcionario f) {
		float emprestimo = 0;
		// Verifica o tipo da instância com a palavra-chave instanceof
		if (f instanceof ChefeDeDepartamento) {
			emprestimo = 4.0f * f.qualSalario();
		} else if (f instanceof Funcionario) {
			emprestimo = 2.0f * f.qualSalario();
		}
		return emprestimo;
	}

}
