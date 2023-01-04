import java.util.Iterator;
import java.util.HashSet;

public class ColecaoHashSet {
	public static void main(String args[]) {
		// Cria 4 pessoas:
		PessoaY a = new PessoaY("D",1);
		PessoaX b = new PessoaX("C",2);
		PessoaX c = new PessoaX("B",3);
		PessoaY d = new PessoaY("A",4);
		
		// Cria um conjunto (do tipo interface Set) que implementa um HashSet
		// Esse conjunto é definido para lidar com elementos da classe PessoaX (assim como suas classes filhas)
		java.util.Set<PessoaX> hashSet = new HashSet<PessoaX>();
		
		// Utilizando método da coleção (add) para adicionar objetos do tipo PessoaX e PessoaY
		hashSet.add(c);
		hashSet.add(b);
		hashSet.add(d);
		hashSet.add(a); 
		// Observando o resultado, a adição foi feita na ordem a,c,b,d. Por não ser uma coleção
		// ordenada, não se tem garantia que a ordem de adição será a mesma que a definida no codigo
		
		
		// mesmo tentando adicionar o mesmo elemento novamente, o Set não permite repetição de elementos
		hashSet.add(a); 
		hashSet.add(b);
		hashSet.add(c);
		hashSet.add(d);
		
		// Utiliza método size() para obter a quantidade de elementos do conjunto
		System.out.println("Quantidade de elementos no conjunto: " + hashSet.size());
		
		// Utiliza método contains() para verificar se o objeto a existe ou não
		if (hashSet.contains(a)) {
			System.out.println("Contém Elemento: " + a);
		}
		
		// Utiliza iterador para imprimir todos os elementos do hashSet
		for (Iterator<PessoaX> it = hashSet.iterator(); it.hasNext(); ) {
			PessoaX t = it.next();
			System.out.print("HashSet: " + t);
		}
		
		// Utiliza método para remove() para remover elemento da hashSet 
		hashSet.remove(a);
		
		// Utiliza iterador para imprimir todos os elementos da hashSet
		System.out.println();
		for (Iterator<PessoaX> it = hashSet.iterator(); it.hasNext(); ) {
			PessoaX t = it.next();
			System.out.print("HashSet: " + t);
		}
		// Utiliza método size() para obter a quantidade de elementos da hashSet
		System.out.println("Tamanho de elementos no HashSet: " + hashSet.size());		
	}
}

class PessoaX {
	private String nome;
	private int id;
	
	public PessoaX(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	protected int getId() {
		return id;
	}
	
	protected String getNome() {
		return nome;
	}
	
	public String toString() {
		return "PessoaX (" + id + "): " + nome + "\n";
	}
}

class PessoaY extends PessoaX {
	
	public PessoaY(String nome, int id) {
		super(nome, id);
	}
	
	public String toString() {
		return "PessoaY (" + this.getId() + "): " + this.getNome() + "\n";
	}
}