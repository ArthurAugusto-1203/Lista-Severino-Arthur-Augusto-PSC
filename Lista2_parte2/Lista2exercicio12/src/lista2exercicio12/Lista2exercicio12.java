package lista2exercicio12;

import java.util.Scanner;

public class Lista2exercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;
        double num1, num2, resultado;

        System.out.println("Digite o 1° numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o 2° numero: ");
        num2 = entrada.nextDouble();

        System.out.println("Escolha uma opção abaixo para continuar: ");
        System.out.println("1-Somar");
        System.out.println("2-Subtrair");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Sair");
        System.out.println("Digite o numero correspondente para prosseguir.");
        escolha = entrada.nextInt();

        switch (escolha) {

            case 1: {
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                System.out.println("obrigado por utilizar nosso programa!");
                break;
            }
            case 2: {
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                System.out.println("obrigado por utilizar nosso programa!");
                break;
            }
            case 3: {
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                System.out.println("obrigado por utilizar nosso programa!");
                break;
            }
            case 4: {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                System.out.println("obrigado por utilizar nosso programa!");
                break;
            }
            case 5: {
                System.out.println("obrigado por utilizar nosso programa!");
                break;
            }
        }
    }
}
