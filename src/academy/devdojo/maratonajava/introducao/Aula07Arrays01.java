package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    // array é referencia
    // o indice sempre começa de 0
    public static void main(String[] args) {
        int [] idades = new int[3]; // precisa dizer qts espaços de memoria ta alocando
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        //System.out.println(idades);
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
