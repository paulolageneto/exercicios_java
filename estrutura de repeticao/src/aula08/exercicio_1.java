package aula08;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int n1 = input.nextInt();
        System.out.print("digite outro numero: ");
        int n2 = input.nextInt();

        for (int i= n1; i <= n2; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
