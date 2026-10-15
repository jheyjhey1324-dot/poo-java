package modelo;

public class financiamento {



    private double valorImovel;
    private int prazofinanciamento;
    private double taxaJurosAnual;

    public financiamento(double valorDesejadoImovel, int prazofinanciamentoanos, double taxaJurosAnual) {

        this.valorImovel = valorDesejadoImovel;
        this.prazofinanciamento = prazofinanciamentoanos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazofinanciamento() {
        return  prazofinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;

    }

public void exibirDadosfinanciamento() {
        System.out.println("Dados do Financiamento");
        System.out.println("Valor do imóvel: R$" + valorImovel);
        System.out.println("Prazo: " + prazofinanciamento + "anos");
        System.out.println("Taxa de juros anual: " + taxaJurosAnual + "%");
        System.out.println("Pagamento mensal: R$" + calcularPagamentoMensal());
        System.out.println("Total do financiamento: " + calculartotalPagamento());
}





















    // Metodo para calcular pagamento mensal
    public double calcularPagamentoMensal() {

        return (this.valorImovel / ( this.prazofinanciamento * 12)) * (1 + ( this.taxaJurosAnual / 12));
    }

    // Pagamento mensal multiplicado pelo total de meses
    public double calculartotalPagamento() {

        return calcularPagamentoMensal() *  this.prazofinanciamento * 12;
    }


}



