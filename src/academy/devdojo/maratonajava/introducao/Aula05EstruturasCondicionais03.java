package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // operador ternario
        // doar se salario for > 5000
        double salario = 7000;

        // (condicao) ? verdadeiro : falso;
        // ele funciona dentro de um sout

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo." : "Ainda não tenho condições, mas vou ter.";

        //boolean possoComprar = salario > 5000 ? true : false;

        System.out.println(resultado);
    }
}
