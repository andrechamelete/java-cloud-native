public class IBGE {
    public static void main(String[] args) {
        for (EnumExemplo e : EnumExemplo.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}