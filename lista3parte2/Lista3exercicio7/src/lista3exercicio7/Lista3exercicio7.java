package lista3exercicio7;

import java.util.Scanner;

public class Lista3exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero para verificar: ");
        int number = entrada.nextInt();
        boolean primo = true;
        
        if (number <= 1) {
            primo = false;
        } else if (number == 2) {
            primo = true;
        } else if (number % 2 == 0) {
            primo = false;
        } else {
            for (int i = 3; i * i <= number; i += 2) {
                if (number % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo == true) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " NÃO é um número primo.");
        }
    }
}
