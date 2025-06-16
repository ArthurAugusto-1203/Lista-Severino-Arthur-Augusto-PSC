package lista4exercicio05;

import java.util.Random;
import java.util.Arrays;

public class Lista4exercicio05 {

    public static void main(String[] args) {
        int vetorOriginal[] = new int[10];
        Random random = new Random();

        System.out.println("Preenchendo o Vetor Original com valores aleatórios (entre -5 e 5):");
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = random.nextInt(11) - 5;
        }

        System.out.println("Vetor Original:");
        System.out.println(Arrays.toString(vetorOriginal));

        int contadorValidos = 0;
        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] > 0) {
                contadorValidos++;
            }
        }

        int vetorB[] = new int[contadorValidos];

        int indiceVetorB = 0;
        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] > 0) {
                vetorB[indiceVetorB] = vetorOriginal[i];
                indiceVetorB++;
            }
        }

        System.out.println("\nVetor B (compactado, apenas valores positivos):");
        System.out.println(Arrays.toString(vetorB));
    }
}
