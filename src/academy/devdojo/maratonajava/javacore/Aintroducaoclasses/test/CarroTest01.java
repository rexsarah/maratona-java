package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = 20;
        carro1.ano = 2021;

        Carro carro2 = new Carro();
        carro2.nome = "Chevrolet Onix";
        carro2.modelo = 40;
        carro2.ano = 2016;

        // referenciar outro objeto

        // carro2 = carro1; so pode fazer isso com objetos do mesmo tipo

        System.out.println("Carro 1: " + carro1.nome + ", modelo " + carro1.modelo + ". Do ano " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + ", modelo " + carro2.modelo + ". Do ano " + carro2.ano);
    }
}
