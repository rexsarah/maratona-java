package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean.
        int age = 22; // espaço na memoria de referencia age e valor 22
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 22;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'F';

        String nome = "Goku";

        System.out.println("Idade: " +age+ " anos.");
        System.out.println(verdadeiro);
        System.out.println("Oi, meu nome é " +nome);
    }
}
