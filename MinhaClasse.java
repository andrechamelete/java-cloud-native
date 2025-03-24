public class MinhaClasse {    

    public static void main (String [] args) {
        String primeiro = "Andre";
        String segundo = "Chamelete";

        String nome = nomeCompleto(primeiro, segundo);

        System.out.println(nome);

    }

    public static String nomeCompleto (String primeiro, String segundo) {
        return primeiro + " " + segundo;
    }
}