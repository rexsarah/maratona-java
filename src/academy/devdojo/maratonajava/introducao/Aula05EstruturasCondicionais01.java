package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 30;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Venda de bebida autorizada.");
        }
        else {
            System.out.println("Venda de bebida negada, menor de idade.");
        }
    }
}
