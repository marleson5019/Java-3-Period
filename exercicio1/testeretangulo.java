package exercicio1;

public class testeretangulo {
    public static void main(String[] args) {
        retangulo meuretangulo = new retangulo();
        meuretangulo.leDados();
        if(meuretangulo.verificaRetangulo()){
             System.out.println("Area do Retangulo"+Double.toString(meuretangulo.calculaArea()));
             System.out.println("Perimetro do Retangulo"+Double.toString(meuretangulo.calculaPerimetro()));
        } else {
            System.out.println("ERRO"+ "Base do retângulo é igual a altura.");
        }
    }
}
