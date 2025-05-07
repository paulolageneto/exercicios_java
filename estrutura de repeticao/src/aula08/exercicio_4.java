package aula08;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n1 = input.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n1; i++) {
            System.out.print(a + " ");
            int c = a;
            a = b;
            b = c + b;
        }
        input.close();
    }
}
