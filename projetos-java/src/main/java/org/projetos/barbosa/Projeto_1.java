package org.projetos.barbosa;

import java.util.Scanner;

public class Projeto_1 {
    public static void main(String[] args) {
        Scanner n1Scanner = new Scanner(System.in);
        System.out.print("n1: ");
        double n1 = n1Scanner.nextDouble();
        Scanner n2scanner = new Scanner(System.in);
        System.out.print("n2: ");
        double n2 = n2scanner.nextDouble();
        double resul = n1 + n2;
        System.out.println("O resultado foi .... \n" +
                 + resul);


    }
}
