package aula08;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inverso = 0;

        System.out.print("digite um número: ");
        int n1 = input.nextInt();

        // conta q encontrei no google
        while (n1 > 0) {
            int digito = n1 % 10;
            inverso = inverso * 10 + digito;
            n1 = n1 / 10;
        }
        System.out.println("numero invertido: " + inverso);
        input.close();
    }
}
