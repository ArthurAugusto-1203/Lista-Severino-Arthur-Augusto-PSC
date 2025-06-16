package lista4exercicio04;

import java.util.Random;
import java.util.Arrays;

public class Lista4exercicio04 {

    public static void main(String[] args) {
        int[] vetorOriginal = new int[30];
        int[] vetorModificado = new int[30];
        Random random = new Random();

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = random.nextInt(6);
        }

        System.out.println("Vetor Original: ");
        System.out.println(Arrays.toString(vetorOriginal));

        for (int i = 0; i < vetorOriginal.length; i++) {
            if (vetorOriginal[i] == 0) {
                vetorModificado[i] = 1;
            } else {
                vetorModificado[i] = vetorOriginal[i];
            }
        }

        System.out.println("\nVetor Modificado (0 substituído por 1):");
        System.out.println(Arrays.toString(vetorModificado));
    }
}