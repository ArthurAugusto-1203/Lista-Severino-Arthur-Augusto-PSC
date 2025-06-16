package lista3exercicio8;

import java.util.Scanner;

public class Lista3exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contador = 0, acumulador = 0;
        System.out.println("Digite o numero: ");
        num = entrada.nextInt();
        for (int i = num; i > 0; i--) {
            contador = contador + 1;
            acumulador = acumulador + i;
        }
        System.out.println("vezes executadas: " + contador);
        System.out.println("Soma dos numeros: " + acumulador);

    }

}
