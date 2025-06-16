package lista4exercicio08;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lista4exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[15];

        System.out.println("Por favor, digite 15 números inteiros:");
        Random random = new Random();
        
        for (int i = 0; i < 15; i++) {
            while (true) {
                //limitei a  10 para resultados mais simples.
                vetor[i] = random.nextInt(10);
                    break;
                }
        }

        double largestValue = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > largestValue) {
                largestValue = vetor[i];
            }
        }

        if (largestValue == 0) {
            System.out.println("\nErro: O maior valor no vetor é zero. Não é possível dividir por zero.");
        } else {
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = vetor[i] / largestValue;
            }

            System.out.println("\nVetor após os cálculos (elementos divididos pelo maior valor):");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
            }
        }

    }
}
