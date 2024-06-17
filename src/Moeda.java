public class Moeda {
    private String moedaBase;
    private String moedaConversao;
    private double taxaConversao;
    private double valorTotal;

    public Moeda(MoedaDataTransfer moedaDT) {
        this.moedaBase = moedaDT.base_code();
        this.moedaConversao = moedaDT.target_code();
        this.taxaConversao = Double.valueOf(moedaDT.conversion_rate());
        this.valorTotal = Double.valueOf(moedaDT.conversion_result());
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }

    public String getMoedaConversao() {
        return moedaConversao;
    }

    public void setMoedaConversao(String moedaConversao) {
        this.moedaConversao = moedaConversao;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return  "===========================================\n" +
                "Moeda base = " + moedaBase + "\n" +
                "Moeda de conversão = " + moedaConversao + "\n" +
                "Taxa da conversão = " + taxaConversao + "\n" +
                "Valor Total da conversão = " + valorTotal + "\n" +
                "===========================================\n";
    }
}
