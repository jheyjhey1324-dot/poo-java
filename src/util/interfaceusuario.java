package util;

import java.util.Scanner;

public class interfaceusuario {

    Scanner scanner = new Scanner(System.in);

    public double pedirvalorImovel() {
        double valor;
        do {
            System.out.print("Digite o valor do imóvel R$: ");
            valor = scanner.nextDouble();
            if (valor <= 0 ) {
                System.out.println("Erro: o preço deve ser maior que zero");
            }
        } while (valor <= 0);
          return valor;
    }

    public int pedirprazofinanciamento() {
        int prazo;
        do {
            System.out.println("Digite o prazo do Financiamento: ");
            prazo = scanner.nextInt();
            if (prazo <= 0) {
                System.out.println("Erro: o prazo deve ser maior que zero");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double pedirtaxaJurosAnual() {
        double taxa;
        do {
            System.out.println("Digite a Taxa de Juros Anual: ");
            taxa = scanner.nextDouble();
            if (taxa <= 0) {
                System.out.println("Erro a taxa deve ser maior que zero");
            }
        } while (taxa <= 0);
        return taxa;
    }
}

