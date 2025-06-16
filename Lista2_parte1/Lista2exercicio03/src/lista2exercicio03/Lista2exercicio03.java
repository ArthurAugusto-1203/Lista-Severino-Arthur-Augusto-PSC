package lista2exercicio03;

import java.util.Scanner;

public class Lista2exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3;
        float mediaNota;

        System.out.println("digite o valor da primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("digite o valor da segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.println("digite o valor da terceira nota: ");
        nota3 = entrada.nextFloat();

        mediaNota = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é: " + mediaNota);
        
        if (mediaNota >= 0 && mediaNota < 3) {
            System.out.println("Resultado: Reprovado");

        } else if (mediaNota >= 3 && mediaNota < 7) {
            System.out.println("Resultado: Exame");
        } else if (mediaNota >= 7 && mediaNota <= 10) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Média fora do intervalo valido (o-10).");
        }

    }
}
