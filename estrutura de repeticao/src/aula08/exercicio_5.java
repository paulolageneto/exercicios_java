package aula08;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.print("digite um numero: ");
            int n1 = input.nextInt();
            if (n1 % 2 != 0) {
                System.out.println("numero e impar: " + n1);
            } else {
                System.out.println("numero e par:" + n1);
            }

        }
        
    }
}
