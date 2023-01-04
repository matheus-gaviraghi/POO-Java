import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

// É necessario implementar a interface Comparator e passar como argumento na criação do TreeSet
class PessoaComparator implements Comparator<PessoaX> {
	public int compare(PessoaX a, PessoaX b) {
		return a.getNome().compareTo(b.getNome());
	}
}

public class ColecaoTreeSet {
	public static void main(String args[]) {
		// Cria 4 pessoas:
		PessoaY a = new PessoaY("D",1);
		PessoaX b = new PessoaX("C",2);
		PessoaX c = new PessoaX("B",3);
		PessoaY d = new PessoaY("A",4);
		
		// Cria um conjunto (do tipo interface Set) que implementa uma árvore rubro-negra (TreeSet)
		// Esse conjunto é definido para lidar com elementos da classe PessoaX (assim como suas classes filhas)
		java.util.Set<PessoaX> treeSet = new TreeSet<>(new PessoaComparator());
		

		// Para criar um TreeSet, ou a classe deve implementar o Comparable, ou temos que passar
		// obrigatoriamente o método Comparator no construtor do TreeSet
		
		// Utilizando método da coleção (add) para adicionar objetos do tipo PessoaX e PessoaY
		treeSet.add(c);
		treeSet.add(b);
		treeSet.add(d);
		treeSet.add(a); 
		// Observando o resultado, ocorre uma organizaçao automatica dos elementos
		
		// mesmo tentando adicionar novamente elementos que já compõem o TreeSet,
		// estes não são adicionados, visto que a coleção Set não permite repetição de elementos
		treeSet.add(a); 
		treeSet.add(b);
		treeSet.add(c);
		treeSet.add(d);
		
		// Utiliza método size() para obter a quantidade de elementos do conjunto
		System.out.println("Quantidade de elementos no conjunto: " + treeSet.size());
		
		// Utiliza método contains() para verificar se o objeto a existe ou não
		if (treeSet.contains(a)) {
			System.out.println("Contém Elemento: " + a);
		}
		
		// Utiliza iterador para imprimir todos os elementos do treeSet
		for (Iterator<PessoaX> it = treeSet.iterator(); it.hasNext(); ) {
			PessoaX t = it.next();
			System.out.print("treeSet: " + t);
		}
		
		// Utiliza método para remove() para remover elemento da treeSet 
		treeSet.remove(a);
		
		// Utiliza iterador para imprimir todos os elementos da treeSet
		System.out.println();
		for (Iterator<PessoaX> it = treeSet.iterator(); it.hasNext(); ) {
			PessoaX t = it.next();
			System.out.print("treeSet: " + t);
		}
		// Utiliza método size() para obter a quantidade de elementos da treeSet
		System.out.println("Tamanho de elementos no treeSet: " + treeSet.size());		
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