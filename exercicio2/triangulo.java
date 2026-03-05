
package exercicio2;
import java.util.Scanner;

public class triangulo{
    double ladoA;
    double ladoB;
    double ladoC;
    public void leDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o LadoA: ");
        this.ladoA = entrada.nextDouble();
        System.out.println("Informe o LadoB: ");
        this.ladoB = entrada.nextDouble();
        System.out.println("Informe o ladoC: ");
        this.ladoC = entrada.nextDouble();
    }
    
    public boolean verificaTriangulo(){
        return ladoA<ladoB+ladoC && ladoB<ladoA+ladoC && ladoC<ladoA+ladoB;
    }
    
    public double calculaArea(){
        double s = (ladoA+ ladoB+ ladoC)/2;
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
    }
}
