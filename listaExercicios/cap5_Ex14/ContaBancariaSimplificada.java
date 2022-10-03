package listaExercicios.cap5_Ex14;

/* Escreva uma versão da classe ContaBancariaSimplificada que tenha um campo númeroDaConta
declarado como static, e que incremente o valor desse campo cada vez que uma instância
da classe for criada. Escreva também uma aplicação que crie algumas instâncias da classe
para demonstrar seu funcionamento. */

public class ContaBancariaSimplificada {

    private String nomeDoCorrentista;
    private float saldo;  
    private boolean contaEEspecial;
    static private int numeroDaConta=0;

    public ContaBancariaSimplificada(){
      numeroDaConta++;
    }
  
    public void abreConta(String nome, float deposito, boolean eEspecial) {
      nomeDoCorrentista = nome;
      saldo = deposito;
      contaEEspecial = eEspecial;
    }
  
    public void abreContaSimples(String nome) {
      nomeDoCorrentista = nome;
    }
  
    public void deposita(float valor) {
      saldo = saldo + valor;
    }
  
    public void retira(float valor) {
      saldo = saldo - valor;
    }
  
    public void mostrarDados() {
      System.out.print(nomeDoCorrentista + " tem saldo de " + saldo);
      if (contaEEspecial == true) {
        System.out.println(" em sua conta especial!");
      } else {
        System.out.println(" em sua conta normal!");
      }
  
      System.out.print("O número da conta é: " + numeroDaConta);
    }
}