
public class ChefeDeDepartamento extends Funcionario {
	private String departamento;
	private Data promocaoAChefe;
	
	public ChefeDeDepartamento(String nome, int id, Data nasc, 
			Data adm, float sal, String dep, Data prom) {
		// Chama construtor na classe pai (Funcionario)
		super(nome, id, nasc, adm, sal);
		departamento = dep;
		promocaoAChefe = prom;
	}

	public String toString() {
		// super � uma refer�ncia para o pai, executando o m�todo toString de Funcionario nesse caso
		return super.toString() + "Departamento: " + departamento + " Data de Promo��o: " + promocaoAChefe + "\n";
	}
	
	public String qualDepartamento() {
		return departamento;
	}
}
