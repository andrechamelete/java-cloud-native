public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, int agenciaDestino, int numeroDestino, Banco banco) {
        Conta contaDestino = banco.buscarConta(agenciaDestino, numeroDestino);
        if (contaDestino == null) {
            System.out.println("Conta de destino náo encontrada");
            return;
        }

        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }

        this.sacar(valor);
        contaDestino.depositar(valor);

        System.out.println(String.format("Transferência de R$%.2f realizada para a conta %d - agência %d.", (double) valor, numeroDestino, agenciaDestino));
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    protected abstract void imprimirExtrato();

    @Override
    public String toString() {
        return "Conta [cliente=" + cliente.getNome() + ", agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
