
package exercicio1;
import java.util.Scanner;

public class retangulo {
    double base;
    double altura;
    public void leDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a Base: ");
        this.base = entrada.nextDouble();
        System.out.println("Informe a Altura: ");
        this.altura = entrada.nextDouble();
    }
    
    public boolean verificaRetangulo(){
        return base != altura;
    }
    
    public double calculaArea(){
        return base * altura;
    }
    
    public double calculaPerimetro(){
        return 2* (base+altura);
    }
}
