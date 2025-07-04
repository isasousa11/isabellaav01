package Aula09Avaliacao;

import java.util.Scanner;

public class Avaliacao01Atv01 {
    public static void main(String[] args) {
        // Cria o leitor de dados do teclado
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do ano:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double bimestre1 = (notas[0] + notas[1]) / 2;
        double bimestre2 = (notas[2] + notas[3]) / 2;
        double bimestre3 = (notas[4] + notas[5]) / 2;
        double bimestre4 = (notas[6] + notas[7]) / 2;

        // Cálculo das médias semestrais
        double semestre1 = (bimestre1 + bimestre2) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        // Cálculo da média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibição dos resultados
        System.out.println("\nPráticas\n");

        System.out.printf("1º Bimestre: %.1f\n", bimestre1);
        System.out.printf("2º Bimestre: %.1f\n", bimestre2);
        System.out.printf("1º Semestre: %.1f\n", semestre1);
        System.out.println("----------------------");

        System.out.printf("3º Bimestre: %.1f\n", bimestre3);
        System.out.printf("4º Bimestre: %.1f\n", bimestre4);
        System.out.printf("2º Semestre: %.1f\n", semestre2);
        System.out.println("----------------------");

        System.out.printf("Média Final: %.1f\n", mediaFinal);

    }
}
