package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // nao pode dar array com tipos primitivos
        // byte, short, int, long, float e double 0
        // char
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Luffy";
        nomes[1] = "Zoro";
        nomes[2] = "Nami";
        nomes[3] = "Usopp";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
