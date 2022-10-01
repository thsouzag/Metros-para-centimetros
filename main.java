import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
// Variavel
   double N1 , conversão;
// processamento
    System.out.println("digite o valor de metros  ?");
    N1 = console .nextDouble();
  
   conversão = N1*100;
  
// saida 
  System.out.println("\n a conversão de metros para centimetro e  ! \t" + conversão);
   
  }
}