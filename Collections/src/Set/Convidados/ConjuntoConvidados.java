package Set.Convidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 0001);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 0002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 0003);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 0001);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");
        conjuntoConvidados.exibirConvidados();
    }
}
