package listaExercicios.cap4.Ex3;

public class Lampada {
    int estadoDaLampada;
    int nWatts;
    
    Lampada(int nWatts){
      this.nWatts = nWatts;
    }

    Lampada(){
      this(60);
    }

    void acende() {
      estadoDaLampada = 1;
    }
  
    void apaga() {
      estadoDaLampada = 0;
    }
  
    void mostraEstado() {
      System.out.println("Lâmpada: " + estadoDaLampada + "\nQuantidade Watts: " + nWatts);
    }
}