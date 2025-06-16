package lista4exercicio11;

import java.util.*;

public class Lista4exercicio11 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] vetor = new int[15];
        double soma = 0;
        double media;
        boolean encontrouMenor = false;

        int minValor = 0;
        int maxValor = 100;

        System.out.println("Gerando 15 números inteiros aleatórios (entre " + minValor + " e " + maxValor + "):");

        for (int i = 0; i < 15; i++) {
            vetor[i] = random.nextInt(maxValor - minValor + 1) + minValor;
            System.out.println("Elemento da posição " + i + ": " + vetor[i]);
            soma += vetor[i];
        }

        media = soma / 15;

        System.out.println("\nA média dos elementos é: " + media);

        System.out.println("\nElementos menores que a média e suas posições:");
        for (int i = 0; i < 15; i++) {
            if (vetor[i] < media) {
                System.out.println("Elemento: " + vetor[i] + " na posição: " + i);
                encontrouMenor = true;
            }
        }

        if (!encontrouMenor) {
            System.out.println("Nenhum elemento no vetor é menor que a média.");
        }
    }
}