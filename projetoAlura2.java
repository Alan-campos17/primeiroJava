import java.util.Scanner;

public class projetoAlura2 {
    public static void main(String[] args) {
        
    
    String nome = "michel Jackson";
    String tipoConta = "Corrente";
    double saldo = 2743.90;
    int opcao = 0;

    System.out.println("*********");
    System.out.println("Nome do Cliente:" + nome);
    System.out.println("Tipo conta:" + tipoConta);
    System.out.println("Saldo atual:" + saldo);
    System.out.println("***********");

    String menu = """
            **Digite sua Saldo**
            1 - Consultar Saldo
            2 - Transferir Valor
            3 - Receber Valor
            4 - Sair
            """;
    Scanner leitura = new Scanner(System.in);
    
    while (opcao != 4){
        System.out.println(menu);
        opcao = leitura.nextInt();
        if (opcao == 1) {
            System.out.println("O saldo é:" + saldo);
        }else if (opcao == 2) {
                System.out.println("Qual valor da transferência?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo:" + saldo);
                 }
                } else if (opcao == 3) {
                    System.out.println("Valor recebido:");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                
                }else if (opcao != 4) {
                    System.out.println("opcao invalida:");
                } 
                }
            }
        }
    


