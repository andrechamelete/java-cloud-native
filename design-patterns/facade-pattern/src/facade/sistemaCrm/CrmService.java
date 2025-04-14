package facade.sistemaCrm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado) {
        System.out.println("Cliente salvo no CRM");
    }
     
}
