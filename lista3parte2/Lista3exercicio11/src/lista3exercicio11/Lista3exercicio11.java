package lista3exercicio11;

public class Lista3exercicio11 {

    public static void main(String[] args) {

        double habitBruzu = 90000000;
        double habitMilano = 200000000;
        double taxaBruzu = 0.03;
        double taxaMilano = 0.015;
        int anos = 0;

        while (habitBruzu < habitMilano) {

            habitBruzu *= (1 + taxaBruzu);
            habitMilano *= (1 + taxaMilano);
            anos++;

        }
        System.out.println("Serão necessários " + anos + " anos para que a população dos Bruzundangas "
                + "alcance ou ultrapasse a população dos Milanos.");
        System.out.printf("População Bruzundangas após %d anos: %.0f\n", anos, habitBruzu);
        System.out.printf("População Milano após %d anos: %.0f\n", anos, habitMilano);

    }

}
