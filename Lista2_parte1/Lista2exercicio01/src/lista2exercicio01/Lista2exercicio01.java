package lista2exercicio01;

import java.util.Scanner;

public class Lista2exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero :");
        num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro numero é maior");}
            else if (num1 == num2){
                System.out.println("os numeros possuem valores iguais");
                    } else { System.out.println("O segundo numero é maior"); 
           }
    
    }

}
