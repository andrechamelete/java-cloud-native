public enum EnumExemplo {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí");

    private String nome;
    private String sigla;

    private EnumExemplo(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}