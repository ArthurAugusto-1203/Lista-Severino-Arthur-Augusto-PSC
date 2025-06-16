package lista3exercicio5;

import java.util.Scanner;

public class Lista3exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("escolha dentre abaixo sua resposta para a pesquisa: ");
        System.out.println("1-Alcool");
        System.out.println("2-Gasolina");
        System.out.println("3-Diesel");
        System.out.println("4- fim");

        int escolha = 0;
        int alcool = 0, diesel = 0, gasolina = 0;
        System.out.println("Esolha um numero: ");
        escolha = entrada.nextInt();
        while (escolha != 4) {

            switch (escolha) {
                case 1:

                    System.out.println("Alcool");
                    alcool = alcool +1;
                    break;
                case 2:
                    System.out.println("Gasolina");
                    gasolina = gasolina +1;
                    break;
                case 3:
                    System.out.println("Diesel");
                    diesel = diesel +1;
                    break;
                case 4:
                    System.out.println("MUITO ORBIGADO");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
            System.out.println("Esolha outra opção");
            escolha = entrada.nextInt();
        }
        System.out.println("Preferencias: ");
        System.out.println("Alcool: " +alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        
    }
}
