package exercicio2;

public class testetriangulo {
    public static void main(String[] args) {
        triangulo meutriangulo = new triangulo();
        meutriangulo.leDados();
        if(meutriangulo.verificaTriangulo()){
             System.out.println("Area do Triangulo"+Double.toString(meutriangulo.calculaArea()));
        } else {
            System.out.println("ERRO"+ "Nao e triangulo.");
        }
    }
}
