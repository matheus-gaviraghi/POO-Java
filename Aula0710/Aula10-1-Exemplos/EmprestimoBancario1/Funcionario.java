
// Mecanismo de Heran�a (Funcionario herda todas as informa��es de Pessoa)
public class Funcionario extends Pessoa {
	private float salario;
	private Data admissao;
	
	Funcionario(String nome, int id, Data nasc, Data adm, float sal) {
		// Chama o construtor da classe pai
		super(nome, id, nasc);
		admissao = adm;
		salario = sal;
	}
	
	public String toString() {
		// Palavra-chave super novamente, acessando m�todo da classe pai (herdada)
		return super.toString() + "Admiss�o: " + admissao + "Sal�rio: " + salario + "\n";
	}
	
	// Palavra-chave final indica que esse m�todo n�o pode ser sobreposto por outros m�todos de mesma
	// assinatura em classes filhas (herdeiras)
	public final float qualSalario() {
		return salario;
	}
}
