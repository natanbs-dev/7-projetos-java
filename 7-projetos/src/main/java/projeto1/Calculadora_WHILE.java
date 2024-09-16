package projeto1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculadora_WHILE {

    // Método para multiplicação
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para calcular a porcentagem
    public static double porcentagem(double total, double porcentagem) {
        return (total * porcentagem) / 100;
    }

    // Método para calcular a raiz quadrada
    public static double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    // Método para salvar os resultados em um arquivo
    public static void salvarNoArquivo(String operacao, double resultado) {
        try (FileWriter writer = new FileWriter("resultados(Calculadora).txt", true)) {
            writer.write("Operação: " + operacao + ", Resultado: " + resultado + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Multiplicação");
            System.out.println("2. Porcentagem");
            System.out.println("3. Raiz Quadrada");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            double resultado = 0;
            String operacao = "";

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    double num2 = scanner.nextDouble();
                    resultado = multiplicar(num1, num2);
                    operacao = "Multiplicação";
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;

                case 2:
                    System.out.println("Digite o valor total:");
                    double total = scanner.nextDouble();
                    System.out.println("Digite a porcentagem:");
                    double percent = scanner.nextDouble();
                    resultado = porcentagem(total, percent);
                    operacao = "Porcentagem";
                    System.out.println("Resultado da porcentagem: " + resultado);
                    break;

                case 3:
                    System.out.println("Digite o número:");
                    double numero = scanner.nextDouble();
                    resultado = raizQuadrada(numero);
                    operacao = "Raiz Quadrada";
                    System.out.println("Resultado da raiz quadrada: " + resultado);
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            if (escolha >= 1 && escolha <= 3) {
                salvarNoArquivo(operacao, resultado);
            }
        }

        scanner.close();
    }
}
