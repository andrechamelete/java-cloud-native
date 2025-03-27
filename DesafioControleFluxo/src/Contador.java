import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            //completar
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");            
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é maior que parametroDois e lançar exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int x = 1; x <= contagem; x++) {
            System.out.printf("imprimindo o número %d %n", x);
        }
    }
}