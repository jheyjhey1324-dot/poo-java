package main;
import java.util.ArrayList;
import util.interfaceusuario;
import modelo.financiamento;

public class main {
    public static void main(String[] args) {

        interfaceusuario iu = new interfaceusuario();

        ArrayList<financiamento> financiamento = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {

            System.out.println("\n===FINANCIAMENTO " + i + "===");

            int prazofinanciamentoanos = iu.pedirprazofinanciamento();
            double taxaJuros = iu.pedirtaxaJurosAnual();

            financiamento novofinanciamento = new financiamento(valorImovel, prazofinanciamentoanos, taxaJuros);

            financiamento.add(novofinanciamento);

        }

        double totalImoveis = 0;
        double totalfinanciamento = 0;

        System.out.println("\n=== DETALHES DOS FINANCIAMENTOS ===");

        for (int i = 0; i < financiamento.size(); i++) {
            financiamento f = financiamento.get(i);

            double valorfinanciamento = f.calculartotalPagamento();

            System.out.printf("Financiamento %d - Valor do imóvel: R$ %.2f | Valor do financiamento: R$ %.2f%n",
                    i + 1, f.getValorImovel(), valorfinanciamento);

            totalImoveis += f.getValorImovel();
            totalfinanciamento += valorfinanciamento;
        }


        System.out.println("\n===RESUMO GERAL===");

        System.out.printf("Total de todos os imóveis: R$ %.2f%n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalfinanciamento);

    }
}