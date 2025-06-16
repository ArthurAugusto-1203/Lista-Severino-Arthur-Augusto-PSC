package lista2exercicio06;

import java.util.Scanner;

public class Lista2exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso = 0, altura = 0;
        double imc;

        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 20) {

            System.out.println("Situação: Abaixo do peso");
        } else if (imc >= 20 && imc < 25) {

            System.out.println("Situação: com peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Situação: com sobre peso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Situação: obeso");
        } else if (imc >= 40) {
            System.out.println("Situação: obeso mórbido");
        }

    }

}
