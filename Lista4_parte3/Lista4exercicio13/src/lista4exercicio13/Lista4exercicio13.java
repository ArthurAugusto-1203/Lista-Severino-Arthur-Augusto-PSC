package lista4exercicio13;

import java.util.*;

public class Lista4exercicio13 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int randomNumero, newNumber;
        boolean findInArray= false;

        for (int i = 0; i < vetor.length; i++) {
            randomNumero = random.nextInt(100);
            vetor[i] = randomNumero;
        }

        System.out.print("Digite um número para verificar se está no vetor: ");
        newNumber = entrada.nextInt();

        System.out.print("O número " + newNumber + " foi encontrado nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == newNumber) {
                System.out.print(i + " ");
                findInArray = true;
            }
        }

        if (!findInArray) {
            System.out.println("O número " + newNumber + " não se encontra no vetor.");
        }

    }
}
