package codigos.Aula1609;

public class Lampada {
    int estadoDaLampada;
  
    void acende() {
      estadoDaLampada = 1;
    }
  
    void apaga() {
      estadoDaLampada = 0;
    }
  
    void mostraEstado() {
      System.out.println("Lâmpada: " + estadoDaLampada);
    }
}