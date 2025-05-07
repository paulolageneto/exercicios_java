package aula08;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
