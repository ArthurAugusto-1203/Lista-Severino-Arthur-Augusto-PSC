
package lista4exercicio12;

import java.util.*;

public class Lista4exercicio12 {

    public static void main(String[] args) {
        int numeroAlunos = 10;
        double notas[] = new double[numeroAlunos]; 
        Random random = new Random();


        System.out.println("Gerando notas dos alunos:");
        for (int i = 0; i < numeroAlunos; i++) {
        
            double nota = random.nextDouble() * 10;
        
            nota = Math.round(nota * 100.0) / 100.0;
            notas[i] = nota;
            System.out.printf("Aluno %d: %.2f%n", (i + 1), notas[i]);
        }

        double somaNotas = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            somaNotas += notas[i];
        }
        double media = somaNotas / numeroAlunos;
        System.out.println("\n------------------------------------");
        System.out.printf("A média das notas é: %.2f%n", media);
        System.out.println("------------------------------------");


        System.out.println("\nAlunos com notas abaixo da média:");
        boolean encontrouAbaixo = false;
        for (int i = 0; i < numeroAlunos; i++) {
            if (notas[i] < media) {
                System.out.printf("- Aluno %d: %.2f%n", (i + 1), notas[i]);
                encontrouAbaixo = true;
            }
        }
        if (!encontrouAbaixo) {
            System.out.println("Nenhum aluno com nota abaixo da média.");
        }

        System.out.println("\nAlunos com notas maiores ou iguais à média:");
        boolean encontrouAcimaOuIgual = false;
        for (int i = 0; i < numeroAlunos; i++) {
            if (notas[i] >= media) {
                System.out.printf("- Aluno %d: %.2f%n", (i + 1), notas[i]);
                encontrouAcimaOuIgual = true;
            }
        }
        if (!encontrouAcimaOuIgual) {
            System.out.println("Nenhum aluno com nota maior ou igual à média.");
        }
    }
}