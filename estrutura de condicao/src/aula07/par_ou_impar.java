package aula07;

import java.util.Scanner;

public class par_ou_impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero inteiro:");
        int n1 = input.nextInt();

        if (n1%2==0) {
            System.out.println("numero é par");
        }else{
            System.out.println("numero é impar");
        }

        input.close();

    }
}
