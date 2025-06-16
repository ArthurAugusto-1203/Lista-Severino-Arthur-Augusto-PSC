package lista2exercicio02;

import java.util.Scanner;

public class Lista2exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2;
        double somaNota;

        System.out.println("digite o valor da primeira nota: ");
        nota1 = entrada.nextInt();
        System.out.println("digite o valor da segunda nota: ");
        nota2 = entrada.nextInt();

        somaNota = nota1 + nota2;

        if (somaNota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}
