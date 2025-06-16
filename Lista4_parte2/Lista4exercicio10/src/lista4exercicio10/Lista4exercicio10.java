package lista4exercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista4exercicio10 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[6];
        int somaPar = 0;

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(101);
            System.out.println("Número " + (i + 1) + " gerado: " + vetor[i]);

            if (vetor[i] % 2 == 0) {
                numerosPares.add(vetor[i]);
                somaPar += vetor[i];
            } else {
                numerosImpares.add(vetor[i]);
            }
        }

        System.out.println("\n--- Resultados ---");

        System.out.print("a. Números pares gerados: ");
        if (numerosPares.isEmpty()) {
            System.out.println("Nenhum número par foi gerado.");
        } else { 
           System.out.println(numerosPares);
        }

        System.out.println("b. Soma dos números pares: " + somaPar);

        System.out.print("c. Números ímpares gerados: ");
        if (numerosImpares.isEmpty()) {
            System.out.println("Nenhum número ímpar foi gerado.");
        } else {
            System.out.println(numerosImpares);
        }

        System.out.println("d. Quantidade de números ímpares: " + numerosImpares.size());
    }
}