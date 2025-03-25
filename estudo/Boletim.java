public class Boletim {

    public static void main(String[] args) {
        float nota = 7.5f;

        if (nota >= 7) {
            System.out.println("Aprovado");            
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}