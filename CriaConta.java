public class CriaConta{
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new conta();
        segundaConta.saldo = 50;

        System.out.println();
    }
}