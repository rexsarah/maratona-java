package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        // idade < 15 cat infantil
        // idade >= 15 && < 18 cat juvenil
        // idade >= 18 cat adulta

        int idade = 25;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        }
        else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }
        else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
