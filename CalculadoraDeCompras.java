import java.util.Scanner;

public class CalculadoraDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços dos produtos
        double precoArroz = 5.50;
        double precoFeijao = 7.20;
        double precoMacarrao = 4.00;
        double precoLeite = 3.50;

        // Exibir opções
        System.out.println("Produtos disponíveis:");
        System.out.println("1 - Arroz (R$ " + precoArroz + ")");
        System.out.println("2 - Feijão (R$ " + precoFeijao + ")");
        System.out.println("3 - Macarrão (R$ " + precoMacarrao + ")");
        System.out.println("4 - Leite (R$ " + precoLeite + ")");

        // Entrada do nome do produto
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine().toLowerCase();

        // Entrada da quantidade
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double total = 0;

        // Calcular o valor total
        switch (produto) {
            case "arroz":
                total = precoArroz * quantidade;
                break;
            case "feijao":
            case "feijão":
                total = precoFeijao * quantidade;
                break;
            case "macarrao":
            case "macarrão":
                total = precoMacarrao * quantidade;
                break;
            case "leite":
                total = precoLeite * quantidade;
                break;
            default:
                System.out.println("Produto não encontrado.");
                scanner.close();
                return;
        }

        // Exibir resultado com 2 casas decimais
        System.out.println("Total da compra de " + quantidade + " " + produto + ": R$ " + String.format("%.2f", total));

        scanner.close();
    }
}
