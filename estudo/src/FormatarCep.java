public class FormatarCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep não contem 8 dígitos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "12345-678"; //apenas ilustrativo
    }
}