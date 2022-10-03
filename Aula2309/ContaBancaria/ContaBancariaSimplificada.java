package Aula2309.ContaBancaria;

public class ContaBancariaSimplificada {

    String nomeDoCorrentista;
  
    float saldo;
  
    boolean contaEEspecial;
  
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
    }
}