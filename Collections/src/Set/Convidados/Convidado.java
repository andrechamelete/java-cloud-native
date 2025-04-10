package Set.Convidados;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" + "nome = " + nome + ", código = " + codigoConvite + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    
}