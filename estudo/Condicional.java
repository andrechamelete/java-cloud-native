import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Bem vindo. Seu saldo é de %.2f. Qual valor você deseja sacar? %n", saldo);
        valorSolicitado = scanner.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.printf("Saque realizado no valor de R$ %.2f! %n", valorSolicitado);
        } else {
            System.out.println("Saldo suficiente");
        }

        scanner.close();

        System.out.printf("Seu saldo agora é de R$ %.2f!", saldo);
    }
}