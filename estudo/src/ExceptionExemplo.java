import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionExemplo {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Sobrenome: ");
        String sobrenome =  scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        scanner.close();

        System.out.printf("Bom dia, %s %s, sua idade é %d anos %n", nome, sobrenome, idade);
        } catch (InputMismatchException e) {
            System.err.println("Os campos 'nome' e 'sobrenome' devem ser e letras, e o campo 'idade', um número inteiro.");
        }
    }
}