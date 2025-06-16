package lista4exercicio01;

import java.util.*;

public class Lista4exercicio01 {

    public static void main(String[] args) {
        Random random = new Random();
        int vetor[];
        int menor, maior, posMenor = 1, posMaior = 1;

        vetor = new int[15];

        vetor[0] = random.nextInt();
        menor = vetor[0];
        maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Valor #" + (i + 1) +": ");
            vetor[i] = random.nextInt();
            System.out.println(vetor[i]);

            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i + 1;
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i + 1;
            }
        }
        System.out.println("--------------------------------");
        System.out.println("O maior valor: " + maior);
        System.out.println("Posição maior valor: " + posMaior);
        System.out.println("O menor valor: " + menor);
        System.out.println("Posição menor valor: " + posMenor);

    }

}
