public class MinhaClasse {    

    public static void main (String [] args) {
        int a, b;;
        a = 5;
        b = a;

        System.out.println(a);

        int res = a == b ? 1 : 0;

        System.out.println(res);

    }

    public static String nomeCompleto (String primeiro, String segundo) {
        return primeiro + " " + segundo;
    }
}