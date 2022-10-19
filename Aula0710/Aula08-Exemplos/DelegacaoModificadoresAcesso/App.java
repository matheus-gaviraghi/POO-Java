package DelegacaoModificadoresAcesso;
public class App {
  public static void main(String args[]) {
    x _x = new x();
    _x.k = 10;
    y _y = new y();
    _y.x1.k = 15;
    z _z = new z();
    _z.y1.x1.k = 50;

    System.out.println(_x.k);
    System.out.println(_y.x1.k);
    System.out.println(_z.y1.x1.k);
  } 
}
