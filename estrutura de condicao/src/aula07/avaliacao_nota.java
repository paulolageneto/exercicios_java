package aula07;

import java.util.Scanner;

public class avaliacao_nota {
    public static void main(String[] args) {
        System.out.println("digite uma nota de 0 a 10: ");
        Scanner input = new Scanner(System.in);
        double nota = input.nextDouble();

        if (nota >= 0 && nota <= 5) {
            System.out.println("insuficiente");
        }
        if (nota > 5 && nota < 7) {
            System.out.println("regular");
        }
        if (nota >= 7 && nota < 9) {
            System.out.println("bom");
        }
        if (nota == 10) {
            System.out.println("excelente");
        }
        if (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
        }
        input.close();
    }
}
