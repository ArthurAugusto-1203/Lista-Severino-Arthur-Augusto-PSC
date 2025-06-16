package lista4exercicio09;

import java.util.*;

public class Lista4exercicio09 {

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
        int Vetor[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < Vetor.length; i++) {
            Vetor[i] = random.nextInt(100);

            boolean resultadoPrimo = Lista4exercicio09.isPrimo(Vetor[i]);
            if (resultadoPrimo == true){
            System.out.println("Número: " + Vetor[i]);
            System.out.println("Posição no vetor: " + i);
            System.out.println("É primo? " + resultadoPrimo);
            System.out.println("-------------------");
        }
        }
    }
}