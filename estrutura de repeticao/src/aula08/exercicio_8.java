package aula08;

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int n1 = input.nextInt();
     
        int fatorial = 1;
        for (int i = 1; i <= n1; i++) {
            fatorial *= i;
        }
        System.out.println("fatorial:" + fatorial);
        input.close();
    }
}
