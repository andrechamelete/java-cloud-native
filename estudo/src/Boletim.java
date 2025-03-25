public class Boletim {

    public static void main(String[] args) {
        float nota = 6.5f;

        System.out.print("teste 1: ");
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovador";

        System.out.println("teste 2: " + resultado);
    }

    
}