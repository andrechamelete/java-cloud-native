public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital");

        Cliente joao = new Cliente("Joao");
        Cliente Maria = new Cliente("Maria");

        Conta cc = banco.criarContaCorrente(joao);
        Conta cp = banco.criarContaPoupanca(Maria);

        cc.depositar(500);

        cc.transferir(200, cp.getAgencia(), cp.getNumero(), banco);

        System.out.println(banco.buscarConta(1, 1));
        System.out.println(banco.buscarConta(1, 2));

    }
}