package lista3exercicio9;

import java.util.Scanner;

public class Lista3exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num = entrada.nextInt();
        System.out.println("Os numeros divisores de " + num + " são: ");
        for (int i = 2; i <= num; i ++) {
            if (num % i == 0) {
                System.out.println(i);
            }

        }

    }
}
