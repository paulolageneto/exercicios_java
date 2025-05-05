package aula08;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int maior = 0;
        int menor = 1;

        System.out.println("digite quantidade de numeros q deseja fornecer: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("digite um numero: ");
            int n1 = input.nextInt();
            if (n1 > maior) {
                maior = n1;
            }
            if (n1 < menor) {
                menor = n1;
            }

        }

        System.out.println("maior numero: " + maior);
        System.out.println("menor numero: " + menor);
        input.close();
    }
}