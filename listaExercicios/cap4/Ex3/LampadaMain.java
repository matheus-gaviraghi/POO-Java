package listaExercicios.cap4.Ex3;

public class LampadaMain {
    public static void main(String args[]) {
      Lampada l1 = new Lampada();
      Lampada l2 = new Lampada(100);     
      l1.acende();
      l2.apaga();
      l1.mostraEstado();
      l2.mostraEstado();
    }
}