package Aula09Avaliacao;

import java.util.Scanner;

public class Avaliacao01Atv02 {
    public static void main(String[] args) {
        // Cria o leitor de dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Realiza as conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\nPráticas\n");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);


    }
}
