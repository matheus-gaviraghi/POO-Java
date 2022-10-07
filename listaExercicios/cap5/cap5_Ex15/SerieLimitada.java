package listaExercicios.cap5.cap5_Ex15;

public class SerieLimitada {
    private static int valorSequencial = 0;
    private static int contador = 0;

    public SerieLimitada(){
        valorSequencial++;

        System.out.printf("Instância %d foi criada",valorSequencial);
    }
}
