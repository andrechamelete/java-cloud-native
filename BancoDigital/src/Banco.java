import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public ContaCorrente criarContaCorrente(Cliente cliente) {
        ContaCorrente cc = new ContaCorrente(cliente);
        contas.add(cc);
        return cc;
    }

    public ContaPoupanca criarContaPoupanca(Cliente cliente) {
        ContaPoupanca cp = new ContaPoupanca(cliente);
        contas.add(cp);
        return cp;
    }    



    public Conta buscarConta(int agencia, int numero) {
        for(Conta c : contas) {
            if(c.getAgencia() == agencia && c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}
