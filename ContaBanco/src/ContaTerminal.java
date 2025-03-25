import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int Conta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente: ");
        String Cliente = scanner.next();

        System.out.println("Saldo atual: ");
        Double Saldo = scanner.nextDouble();

        scanner.close();

        // System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de " + Saldo + " já está disponivel para saque!");
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponivel para saque!%n", Cliente, Agencia, Conta, Saldo);
    }
}