package aula08;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n1 = input.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
            i++;
        }
        input.close();
    }
}
