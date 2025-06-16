package lista3exercicio10;

import java.util.Scanner;

public class Lista3exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pense em um número entre 1 e 8 (inclusive).");
        System.out.println("Vou tentar adivinhá-lo em no máximo 3 perguntas de 'sim' ou 'não'.");
        System.out.println("Responda 's' para sim e 'n' para não.");
        System.out.println("----------------------------------------");

        int low = 1;
        int high = 8;
        int guessedNumber = -1;

        System.out.print("O número que você pensou é maior que 4? (s/n): ");
        String resposta1 = entrada.nextLine().trim().toLowerCase();

        if (resposta1.equals("s")) {

            low = 5;
            high = 8;
        } else if (resposta1.equals("n")) {

            low = 1;
            high = 4;
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' ou 'n'. Reinicie o programa.");
            entrada.close();
            return;
        }

        int mid = low + (high - low) / 2;
        System.out.print("O número que você pensou é maior que " + mid + "? (s/n): ");
        String resposta2 = entrada.nextLine().trim().toLowerCase();

        if (resposta2.equals("s")) {

            low = mid + 1;

        } else if (resposta2.equals("n")) {

            high = mid;
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' ou 'n'. Reinicie o programa.");
            entrada.close();
            return;
        }
        System.out.print("O número que você pensou é " + low + "? (s/n): ");
        String resposta3 = entrada.nextLine().trim().toLowerCase();

        if (resposta3.equals("s")) {
            guessedNumber = low;
        } else if (resposta3.equals("n")) {

            guessedNumber = high;
        } else {
            System.out.println("Resposta inválida. Por favor, responda 's' ou 'n'. Reinicie o programa.");
            entrada.close();
            return;
        }

        System.out.println("----------------------------------------");
        System.out.println("Eu adivinhei! O número que você pensou é: " + guessedNumber);

        entrada.close();
    }
}
