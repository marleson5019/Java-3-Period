package exercicio4;

public class CalculoIRPF {
    public static void main(String[] args) {
        ImpostoRenda meuIRPF = new ImpostoRenda();
        meuIRPF.leDados();

        if (meuIRPF.verificaDados()) {
            meuIRPF.calculaImposto();
            System.out.println("Salario Bruto: " + meuIRPF.valSalBruto);
            System.out.println("Desconto IR: " + meuIRPF.valDesconto);
            System.out.println("Salario Liquido: " + meuIRPF.valSalLiquido);
        } else {
            System.out.println("ERRO: O valor do salario Bruto nao e valido!");
        }
    }
}
