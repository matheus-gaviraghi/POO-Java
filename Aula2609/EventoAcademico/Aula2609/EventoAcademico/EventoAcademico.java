package Aula2609.EventoAcademico;

class EventoAcademico {
	  private String nomeDoEvento, localDoEvento;
	  private Data inicioDoEvento, fimDoEvento;
	  private int numeroDeParticipantes;

	  /* Construtor */
	  public EventoAcademico(String n, String l, Data i, Data f, int num) {
		  nomeDoEvento = n;
	      localDoEvento = l;
	      // Cria objeto Data
	      inicioDoEvento = new Data();
	      // Inicializa valores
	      inicioDoEvento.inicializaData(i.retornaDia(), i.retornaMes(), i.retornaAno());
	      // Cria objeto Data
	      fimDoEvento = new Data();
	      // Inicializa valores
	      fimDoEvento.inicializaData(f.retornaDia(), f.retornaMes(), f.retornaAno());
	      numeroDeParticipantes = num;
	  }
	  
	  /* Implementa o método toString, que converte o objeto desse tipo para
	   * uma string na hora de apresentar esse objeto usando um prinln 
	   *
	   * @see java.lang.Object#toString()
	   */
	  public String toString() {
		  String imprimir = "";
		  imprimir += "\nEvento " + nomeDoEvento + "\n";
		  imprimir += "Local " + localDoEvento + "\n";
		  imprimir += "De " + inicioDoEvento.retornaDia() + "/"
		                    + inicioDoEvento.retornaMes() + "/"
		                    + inicioDoEvento.retornaAno() + " a "
		                    + fimDoEvento.retornaDia() + "/"
		                    + fimDoEvento.retornaMes() + "/"
		                    + fimDoEvento.retornaAno() + "\n";
		  imprimir += "Participantes " + numeroDeParticipantes + "\n\n";
		  return imprimir;
	  }
	  
}