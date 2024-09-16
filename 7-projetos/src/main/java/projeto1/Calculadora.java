package projeto1;

import java.util.Scanner;

public class Calculadora {

    // Método para multiplicação
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double adicao(double a, double b) {
        return a - b;
    }

    // Método para calcular a porcentagem
    public static double porcentagem(double total, double porcentagem) {
        return (total * porcentagem) / 100;
    }

    // Método para calcular a raiz quadrada
    public static double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação:");
        System.out.println("1=Multiplicação");
        System.out.println("2=Porcentagem");
        System.out.println("3=Raiz Quadrada");
        System.out.println("4=Adição");

        int escolha = scanner.nextInt();
        double resultado = 0;

        switch (escolha) {
            case 1:
                System.out.println("n1= ");
                double num1 = scanner.nextDouble();
                System.out.println("n2= ");
                double num2 = scanner.nextDouble();
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case 2:
                System.out.println("valor total:");
                double total = scanner.nextDouble();
                System.out.println("porcentagem:");
                double percent = scanner.nextDouble();
                resultado = porcentagem(total, percent);
                System.out.println("Resultado da porcentagem: " + resultado);
                break;

            case 3:
                System.out.println("n1= ");
                double numero = scanner.nextDouble();
                resultado = raizQuadrada(numero);
                System.out.println("Resultado da raiz quadrada: " + resultado);
                break;

            case 4:
                System.out.println("n1= ");
                double n1 = scanner.nextDouble();
                System.out.println("n2= ");
                double n2 = scanner.nextDouble();
                resultado = n1 + n2;
                System.out.println("resultado da soma é ===" + resultado);
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}