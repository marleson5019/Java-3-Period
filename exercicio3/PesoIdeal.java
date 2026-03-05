package exercicio3;
import java.util.Scanner;

public class PesoIdeal {
    double altura;
    double peso;
    char sexo;

    public void leDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a altura: ");
        this.altura = entrada.nextDouble();
        System.out.print("Informe o peso: ");
        this.peso = entrada.nextDouble();
        System.out.print("Informe o sexo: ");
        this.sexo = entrada.next().charAt(0);
    }

    public boolean validaDados() {
        return (altura >= 1.00 && altura <= 2.50) &&
               (peso >= 2 && peso <= 200) &&
               (sexo == 'M' || sexo == 'F');
    }

    public double calculaPesoIdeal() {
        if (sexo == 'M') {
            return (72.7 * altura) - 58;
        } else {
            return (62.1 * altura) - 44.7;
        }
    }

    public void comparaPeso() {
        double pesoIdeal = calculaPesoIdeal();
        System.out.println("Peso ideal: " + pesoIdeal);
        System.out.println("Peso atual: " + peso);

        if (peso > pesoIdeal) {
            System.out.println("Voce esta acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("Voce esta abaixo do peso ideal.");
        } else {
            System.out.println("Voce esta no peso ideal!");
        }
    }
}
