import java.util.Scanner;

public class soma {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o numero 1");
      int numero1 = scanner.nextInt();

         System.out.println("Digite o numero 2 ");
         int numero2 = scanner.nextInt();

         int soma = numero1 + numero2;
        System.out.println("A soma é " + soma);
        scanner.close();
    }
    
}
