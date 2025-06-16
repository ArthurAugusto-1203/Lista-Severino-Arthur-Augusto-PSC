package lista4exercicio06;

import java.util.*;

public class Lista4exercicio06 {

    public static void main(String[] args) {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int vetorC[] = new int[5];

        Random random = new Random();
        System.out.println("Preenchendo o Vetor A com valores aleatórios (entre 1 e 10):");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(10) + 1;
        }
        System.out.println("Vetor A: " + Arrays.toString(vetorA));

        System.out.println("\nPreenchendo o Vetor B com valores aleatórios (entre 1 e 10):");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = random.nextInt(10) + 1;
        }
        System.out.println("Vetor B: " + Arrays.toString(vetorB));

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[vetorB.length - 1 - i];
        }

        System.out.println("\n--- Resultado da Subtração ---");
        System.out.println("Vetor C (A[i] - B[último-i]): " + Arrays.toString(vetorC));

    }

}
