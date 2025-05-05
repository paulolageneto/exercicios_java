package aula07;

import java.util.Scanner;

public class ano_bissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = input.nextInt();
        boolean bissexto = false;

        // conta de divisao que encotrei na internet para descobrir se o ano e bissexto
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                } else {
                    bissexto = false;
                }
            } else {
                bissexto = true;
            }
        } else {
            bissexto = false;
        }
        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        input.close();
    }
}
