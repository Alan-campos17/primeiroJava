import java.util.Scanner;
public class exemplo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


    System.out.println("Digite o numero 1");
      double nota1 = scanner.nextDouble();

         System.out.println("Digite o numero 2 ");
         double nota2 = scanner.nextDouble();

         System.out.println("Digite o numero 2 ");
         double nota3 = scanner.nextDouble();
 double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7.0){
            System.out.println("Aprovado!");
        } else if (media >= 4.0) {
            System.out.println("Se liga");
            
        }else {
            System.out.println("Reprovado");
        }
    }
}
