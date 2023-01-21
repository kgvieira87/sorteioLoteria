import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) throws Exception {
int quantidade = 0;
        Random gerador = new Random();
Scanner sc = new Scanner (System.in);

System.out.println("Informe a quantidade de números desejada:");
quantidade = sc.nextInt();

System.out.println("Os números sorteados foram:");
    
        for ( quantidade = 0; quantidade < 6; quantidade++) {
         
            System.out.println( gerador.nextInt(60));
         }
      
    }
}

