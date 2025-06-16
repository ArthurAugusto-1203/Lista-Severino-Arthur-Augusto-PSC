package lista3exercicio4;

import java.util.Scanner;

public class Lista3exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a massa inicial em gramas: ");
        double massa = entrada.nextDouble();
        double massaInicial = massa;

        int tempoSegundos = 0;
        int meiaVida = 50;

        while (massa >= 0.5) {
            massa /= 2;
            tempoSegundos += meiaVida;
        }
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.println("\nMassa inicial: " + massaInicial + " gramas");
        System.out.printf("Tempo necessário para a massa ser menor que"
                + " 0.5 gramas: %d horas, %d minutos e %d segundos.%n", horas, minutos, segundos);

    }
}
