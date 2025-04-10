import java.util.concurrent.ThreadLocalRandom;

public class WhileExemplo {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("doce: " + valorDoce + " adicionado");
            mesada =mesada - valorDoce;
        }
        System.out.println("mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}