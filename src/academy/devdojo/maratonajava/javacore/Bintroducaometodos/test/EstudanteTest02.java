package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Moshiri";
        estudante01.idade = 15;
        estudante01.sexo = 'F';

        estudante02.nome = "Vandrunt";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
