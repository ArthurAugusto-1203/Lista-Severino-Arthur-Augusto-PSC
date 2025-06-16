package lista2exercicio05;

import java.util.Scanner;

public class Lista2exercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float altura, peso;
        int genero;
        double pesoIdeal;

        System.out.println("precisarei da sua altura");
        System.out.println("Exemplo: 1,68");
        System.out.println("digite sua altura: ");
        altura = entrada.nextFloat();

        System.out.println("digite '1' para feminino");
        System.out.println("digite '2' para masculino");
        System.out.println("Qual o seu genero: ");
        genero = entrada.nextInt();
        
        if (genero == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é: " + pesoIdeal);
        } else if (genero == 2) {

            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Esse é o seu peso ideal: " + pesoIdeal);
        } else {
            System.out.println("Genero Invalido! Esolha uma das opções.");
        }

    }

}
