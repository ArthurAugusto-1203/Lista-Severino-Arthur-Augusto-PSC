package lista2exercicio04;

import java.util.Scanner;

public class Lista2exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro valor (X):");
        double x = entrada.nextDouble();

        System.out.println("Por favor, digite o segundo valor (Y):");
        double y = entrada.nextDouble();

        System.out.println("Por favor, digite o terceiro valor (Z):");
        double z = entrada.nextDouble();

        if (x > 0 && y > 0 && z > 0
                && (x + y > z)
                && (x + z > y)
                && (y + z > x)) {
            System.out.println("Os valores X, Y e Z PODEM formar um triângulo.");
        } else {
            System.out.println("Os valores X, Y e Z NÃO podem formar um triângulo.");
            if (x <= 0 || y <= 0 || z <= 0) {
                System.out.println("Motivo: Um ou mais lados possuem comprimento"
                        + " menor ou igual a zero.");
            } else {
                System.out.println("Motivo: O comprimento de um lado é maior ou"
                        + " igual à soma dos outros dois lados (não satisfaz a desigualdade triangular).");
            }
        }

    }
}
