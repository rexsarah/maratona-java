package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        // while, do while, for

        int count = 0;
        while (count < 10) { // tem q resultar em valor booleano
            System.out.println(count); // ou ++count dentro do sout
            count += 1; // ou count++;
        }

        do {
            System.out.println("dentro do do-while");
            count++;
        } while (count < 10);

        for(int i=0; i<10; i++) {
            System.out.println("For " +i);
        }
    }
}

