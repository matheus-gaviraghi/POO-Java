package listaExercicios.cap5_Ex2;

public class DemoDataComFabricaModificado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DataComFabricaModificado seteSetembro2000 = DataComFabricaModificado.seteDeSetembro(2000);
        DataComFabricaModificado seteSetembro2004 = DataComFabricaModificado.seteDeSetembro(2004);
        DataComFabricaModificado seteSetembro2008 = DataComFabricaModificado.seteDeSetembro(2008);
        System.out.println(seteSetembro2000);
        System.out.println(seteSetembro2004);
        System.out.println(seteSetembro2008);
    }
}
