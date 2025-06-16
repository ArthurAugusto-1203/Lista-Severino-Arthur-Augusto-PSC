package lista2exercicio10;

import java.util.Scanner;

public class Lista2exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;

        System.out.println("Digite um entre 1 e 7: ");
        escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: System.out.println("Não existe dia da semana "
                    + "com o numero indicado.");
                break;
        }
    }

}
