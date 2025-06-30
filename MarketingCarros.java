import java.util.Scanner;

public class MarketingCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir opções de marcas
        System.out.println("Marcas disponíveis:");
        System.out.println("BMW");
        System.out.println("Volkswagen");
        System.out.println("Toyota");
        System.out.println("Nissan");

        // Perguntar ao usuário sua marca preferida
        System.out.print("Digite sua marca de carro favorita: ");
        String marca = scanner.nextLine().toLowerCase();

        // Exibir mensagem de marketing conforme a marca escolhida
        switch (marca) {
            case "bmw":
                System.out.println("BMW - Dirigir é sentir o prazer de estar no controle. Elegância e desempenho alemão!");
                break;
            case "volkswagen":
                System.out.println("Volkswagen - Tecnologia e confiança para você e sua família!");
                break;
            case "toyota":
                System.out.println("Toyota - Qualidade que dura gerações. Confiabilidade japonesa em cada curva!");
                break;
            case "nissan":
                System.out.println("Nissan - Inovação que emociona. Pronta para te levar além!");
                break;
            default:
                System.out.println("Marca não reconhecida. Por favor, escolha entre BMW, Volkswagen, Toyota ou Nissan.");
                break;
        }

        scanner.close();
    }
}
