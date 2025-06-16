package lista3severino;

import java.util.Scanner;

public class exercicio2Lista3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        while (valor <= 100000) {
            System.out.println(valor);
            valor += 1000;
        }

    }
}
