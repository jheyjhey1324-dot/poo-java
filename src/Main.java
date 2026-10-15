import java.util.Scanner;

class Financiamento {

    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;

    Financiamento(double valorDesejadoImovel, int prazoFinanciamentoanos, double taxaJurosAnual) {

        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoanos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    double calcularPagamentoMensal() {

        return (this.valorImovel / ( this.prazoFinanciamento * 12)) * (1 + ( this.taxaJurosAnual / 12));
    }

    double calculartotalPagamento() {

        return calcularPagamentoMensal() *  this.prazoFinanciamento * 12;
    }
}

class InterfaceUsuario {

     Scanner scanner = new Scanner(System.in);

     double pedirValorImovel() {
        System.out.println("Digite o valor do Imóvel: ");

        double valor = scanner.nextDouble();
        return valor;

    }

    int pedirprazoFinanciamento() {
         System.out.println("Digite o prazo do Financiamento: ");

         int prazo = scanner.nextInt();
         return prazo;
    }

    double pedirtaxaJurosAnual() {
         System.out.println("Digite a Taxa de Juros Anual: ");

         double taxa = scanner.nextDouble();
         return taxa;
    }
}

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double taxaJuros = interfaceUsuario.pedirtaxaJurosAnual();
        int prazoFinanciamentoanos = interfaceUsuario.pedirprazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoanos, taxaJuros);

        System.out.println("\n RESULTADO ");

        System.out.println("Pagamento mensal: R$ " + novoFinanciamento.calcularPagamentoMensal());
        System.out.println("Total do pagamento: R$ " + novoFinanciamento.calculartotalPagamento());
    }
}


















