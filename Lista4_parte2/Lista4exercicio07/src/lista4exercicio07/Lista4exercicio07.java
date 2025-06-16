package lista4exercicio07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lista4exercicio07 {

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vetorOriginal = new int[15];
        Random random = new Random();

        System.out.println("Preenchendo o Vetor Original com valores aleatórios (entre 1 e 50):");
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = random.nextInt(50) + 1;
        }
        System.out.println("Vetor Original: " + Arrays.toString(vetorOriginal));

        ArrayList<Integer> primosEncontrados = new ArrayList<>();

        System.out.println("\nVerificando números primos no vetor original...");
        for (int numero : vetorOriginal) {
            if (isPrimo(numero)) {
                primosEncontrados.add(numero);
            }
        }

        int[] vetorResultantePrimos = new int[primosEncontrados.size()];
        for (int i = 0; i < primosEncontrados.size(); i++) {
            vetorResultantePrimos[i] = primosEncontrados.get(i);
        }

        System.out.println("\nVetor Resultante (apenas números primos):");
        System.out.println(Arrays.toString(vetorResultantePrimos));
    }
}
