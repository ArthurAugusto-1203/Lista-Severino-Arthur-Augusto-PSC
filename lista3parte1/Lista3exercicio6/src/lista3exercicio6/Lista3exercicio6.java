package lista3exercicio6;

import java.util.Scanner;

public class Lista3exercicio6 {

    public static void main(String[] args) {
        int contador = 0, escolha = 0;
        int soma = 0, somaAritimetica = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        System.out.println("Digite zero para encerrar o alocamento");
        escolha = entrada.nextInt();
        while (escolha != 0) {
            if (escolha % 2 == 0) {
                contador = contador + 1;
                soma = soma + escolha;
            }
            System.out.println("Digite o proximo: ");
            escolha = entrada.nextInt();

        }
        somaAritimetica = soma / contador;
        System.out.println("A média aritimetica é: " + somaAritimetica);

    }

}
