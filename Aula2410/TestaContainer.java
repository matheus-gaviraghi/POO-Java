import javax.swing.*;
import java.awt.*;

public class TestaContainer {
  public static void main(String args[]) {
    JFrame janela = new JFrame("Ola Janela 1!");
    janela.setBounds(100, 100, 300, 300);
    janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    FlowLayout flow = new FlowLayout(); // posicionamento (layout) dos elementos
//    FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
//    FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
    Container caixa = janela.getContentPane();
    caixa.setLayout(flow);
    for (int i = 1;i <= 6;i++) {
      caixa.add(new JButton("Aperte " + i));
      janela.setVisible(true);
    }
    JLabel label = new JLabel("Exemplo de Texto!"); 
    caixa.add(label);
    JTextField campo = new JTextField(15); 
    caixa.add(campo);

    for (int x = 100, y = 100; x < 1000; x++, y++) {
        try {
          janela.setBounds(x, y, 300+x, 300+y);
          Thread.sleep(100);
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    try {
      Thread.sleep(5000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    janela.pack();
  } 
}