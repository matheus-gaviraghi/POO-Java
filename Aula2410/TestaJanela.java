import javax.swing.*;

public class TestaJanela {
  public static void main(String args[]) {
    JFrame janela = new JFrame("Ola Janela!");
    janela.setBounds(-10, 0, 300, 300);
//    janela.setSize(1920,1080);
    janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//    janela.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
//    janela.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    janela.setVisible(true); 

    for (int x = 100, y = 100; x < 1000; x++, y++) {
      try {
        janela.setBounds(x, y, 300, 300);
        Thread.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}