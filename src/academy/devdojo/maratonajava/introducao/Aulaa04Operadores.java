package academy.devdojo.maratonajava.introducao;

public class Aulaa04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num01 = 10;
        double num02 = 20;
        double resultado = num01 * num02;
        // System.out.println(num02 + num01);
        // System.out.println(resultado);

        // %
        int resto = 20 % 2;
        // System.out.println(resto);

        // < > <= >= == != retornam valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        // System.out.println("isDezMaiorQueVinte? "+isDezMaiorQueVinte);
        // System.out.println("isDezMenorQueVinte? "+isDezMenorQueVinte);
        // System.out.println("isDezIgualaVinte? "+isDezIgualaVinte);

        // && (AND) ; || (OR) ; ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        //System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        //System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaC = 200;
        double valorTotalContaP = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaC > valorPlaystation || valorTotalContaP > valorPlaystation;

        //System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = ; += ; -+ ; *= ; /+ ; %=
        double bonus = 1800;
        bonus += 1000;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ -- tem diferenca do momento de execucao se colocar atras ou na frente
        int contador = 0;
        contador +=1;
        contador++;
        System.out.println(contador);
    }
}
