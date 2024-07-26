package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // metodos

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }
    // parametros

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);  // nao armazena valor
    }

    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if(num2 != 0) {
            return num1 / num2;
        }
            return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 99;
        b = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma = soma + num;
        }
        System.out.println(soma);
    }
}
