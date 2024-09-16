package projeto1;

import java.util.Scanner;

public class Projeto_01 {
    public static void main(String[] args) {
        System.out.print("\n===Olá pessoal\n este é o estudo sobre as classes" +
                "no intellij");
        Scanner n1Scanner = new Scanner(System.in);
        System.out.print("\nn1: ");
        double n1 = n1Scanner.nextDouble();
        Scanner n2scanner = new Scanner(System.in);
        System.out.print("\nn2: ");
        double n2 = n2scanner.nextDouble();
        double resul = n1 + n2;
        System.out.println("O resultado foi .... \n" +
                + resul);

    }
}
