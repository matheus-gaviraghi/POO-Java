package listaExercicios.cap5.cap5_Ex14;

/* Escreva uma versão da classe ContaBancariaSimplificada que tenha um campo númeroDaConta
declarado como static, e que incremente o valor desse campo cada vez que uma instância
da classe for criada. Escreva também uma aplicação que crie algumas instâncias da classe
para demonstrar seu funcionamento. */

public class ContaBancariaSimplificada {

    private String nomeDoCorrentista;
    private float saldo;  
    private boolean contaEEspecial;
    static private int numeroDaConta=0;
    private int numeroDaContaAtual;

    public ContaBancariaSimplificada(String nome, float deposito, boolean eEspecial){
      nomeDoCorrentista = nome;
      saldo = deposito;
      contaEEspecial = eEspecial;
      numeroDaConta++;
      numeroDaContaAtual = numeroDaConta;
    }
  
    public ContaBancariaSimplificada(String nome){
      this(nome,0,false);
    }
  
    public void deposita(float valor) {
      saldo = saldo + valor;
    }
  
    public void retira(float valor) {
      saldo = saldo - valor;
    }
    
    //toString: modificando o metodo toString (reimplementando), estamos fazendo uma sobreposição
    
    public String toString(){
      String r;
      r = "\n" + nomeDoCorrentista + " tem saldo de " + saldo;
      r += " na conta: " + numeroDaContaAtual;
      if (contaEEspecial == true) {
        r+="\nConta especial!";
      } else {
        r+= "\nConta normal!";
      }
      return r;
    }

    // public void mostrarDados() {
    //   System.out.print(nomeDoCorrentista + " tem saldo de " + saldo);
    //   if (contaEEspecial == true) {
    //     System.out.println(" em sua conta especial!");
    //   } else {
    //     System.out.println(" em sua conta normal!");
    //   }
  
    //   System.out.print("O número da conta é: " + numeroDaConta);
    // }
}