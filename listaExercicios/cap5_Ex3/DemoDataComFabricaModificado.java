package listaExercicios.cap5_Ex3;

public class DemoDataComFabricaModificado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        DataComFabricaModificado primeiroDiaJan2000 = DataComFabricaModificado.primeiroDoMes(1,2000);
        DataComFabricaModificado primeiroDiaFev2004 = DataComFabricaModificado.primeiroDoMes(2,2004);
        DataComFabricaModificado primeiroDiaMarco2008 = DataComFabricaModificado.primeiroDoMes(3,2008);
        System.out.println(primeiroDiaJan2000);
        System.out.println(primeiroDiaFev2004);
        System.out.println(primeiroDiaMarco2008);
    }
}
