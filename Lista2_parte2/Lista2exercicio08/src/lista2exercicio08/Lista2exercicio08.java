package lista2exercicio08;

import java.util.Scanner;

public class Lista2exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua Idade: ");
        idade = entrada.nextInt();

        if (idade <= 7) {
            System.out.println("Nadador de categoria Infantil");
        } else if (idade > 7 && idade <= 10) {
            System.out.println("Nadador de categoria Juvenil");
        } else if (idade > 10 && idade <= 15) {
            System.out.println("Nadador de categoria Adolescente");
        } else if (idade > 16 && idade <= 30) {
            System.out.println("Nadador de categoria Adulto");
        } else if (idade > 30) {
            System.out.println("Nadador de categoria Senior");
        }
    }

}
