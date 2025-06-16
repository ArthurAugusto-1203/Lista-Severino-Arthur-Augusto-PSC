package lista3exercicio12;

import java.util.Scanner;

public class Lista3exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double somaSalarios = 0;
        int totalPessoas = 0;
        int maiorIdade = 0;
        int menorIdade = Integer.MAX_VALUE;
        int quantidadeMulheres = 0;
        double menorSalario = Double.MAX_VALUE;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';

        System.out.println("--- Pesquisa Populacional ---");
        System.out.println("Digite os dados da população. Para finalizar, digite uma idade negativa.");

        while (true) {
            System.out.print("\nDigite a idade (negativa para finalizar): ");
            int idade = entrada.nextInt();

            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F/I - Masculino/Feminino/Não Informado): ");
            char sexo = entrada.next().toUpperCase().charAt(0);

            System.out.print("Digite o salário: ");
            double salario = entrada.nextDouble();

            totalPessoas++;
            somaSalarios += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo == 'F') {
                quantidadeMulheres++;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }

        System.out.println("\n--- Resultados da Pesquisa ---");

        if (totalPessoas > 0) {
            double mediaSalarios = somaSalarios / totalPessoas;
            System.out.printf("a. Média dos salários do grupo: R$ %.2f%n", mediaSalarios);

            System.out.println("b. Maior idade do grupo: " + maiorIdade + " anos");
            System.out.println("   Menor idade do grupo: " + menorIdade + " anos");

            System.out.println("c. Quantidade de mulheres na região: " + quantidadeMulheres);

            System.out.println("d. Pessoa com o menor salário (R$ " + String.format("%.2f", menorSalario) + "):");
            System.out.println("   Idade: " + idadeMenorSalario + " anos");
            System.out.println("   Sexo: " + (sexoMenorSalario == 'M' ? "Masculino" : (sexoMenorSalario == 'F' ? "Feminino" : "Não Informado")));

        } else {
            System.out.println("Nenhum dado foi inserido na pesquisa.");
        }

    }

}
