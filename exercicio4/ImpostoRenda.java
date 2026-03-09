package exercicio4;

import java.util.Scanner;

public class ImpostoRenda {
    double valSalBruto;
    double valSalLiquido;
    double valDesconto;

    public void leDados() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário bruto: ");
        valSalBruto = sc.nextDouble();
        sc.close();
    }

    public boolean verificaDados() {
        return valSalBruto > 0;
    }

    public void calculaImposto() {
        double imposto = 0;
        double parcelaDeduzir = 0;
        double aliquota = 0;

        // Faixas da tabela IRPF
        if (valSalBruto <= 1903.98) {
            aliquota = 0;
            parcelaDeduzir = 0;
        } else if (valSalBruto <= 2826.65) {
            aliquota = 0.075;
            parcelaDeduzir = 142.80;
        } else if (valSalBruto <= 3751.05) {
            aliquota = 0.15;
            parcelaDeduzir = 354.80;
        } else if (valSalBruto <= 4664.68) {
            aliquota = 0.225;
            parcelaDeduzir = 636.13;
        } else {
            aliquota = 0.275;
            parcelaDeduzir = 869.36;
        }

        imposto = (valSalBruto * aliquota) - parcelaDeduzir;
        valDesconto = imposto;
        valSalLiquido = valSalBruto - valDesconto;
    }
}
