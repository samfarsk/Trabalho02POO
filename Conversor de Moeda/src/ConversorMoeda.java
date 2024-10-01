public class ConversorMoeda {
    public double converter(Moeda de, Moeda para, double valor) {
        double valorEmReais = valor * de.getTaxaDeConversao();
        return valorEmReais / para.getTaxaDeConversao();
    }
}
