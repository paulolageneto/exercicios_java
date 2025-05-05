package aula08;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n1 = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }
        input.close();
    }
}
