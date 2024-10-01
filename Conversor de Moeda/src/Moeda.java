public enum Moeda {
    DOLAR(5.2),
    EURO(5.6),
    REAL(1.0),
    LIBRA(6.2);

    private final double taxaDeConversao;

    Moeda(double taxaDeConversao) {
        this.taxaDeConversao = taxaDeConversao;
    }

    public double getTaxaDeConversao() {
        return taxaDeConversao;
    }
}
