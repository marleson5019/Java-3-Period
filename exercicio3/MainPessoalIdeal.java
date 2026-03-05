package exercicio3;

public class MainPesoIdeal {
    public static void main(String[] args) {
        PesoIdeal pessoa = new PesoIdeal();
        pessoa.leDados();

        if (pessoa.validaDados()) {
            pessoa.comparaPeso();
        } else {
            System.out.println("Dados inválidos!");
        }
    }
}
