package aula07;

import java.util.Scanner;

public class caixa_eletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("valor do saldo: R$20000,00");
        System.out.println("saque por notas");
        System.out.println("digite o valor do saque: ");
        int saque = input.nextInt();

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;

        if (saque >=100){
            nota100 = saque / 100;
            saque = saque % 100;
        }if (saque >=50){
            nota50 = saque / 50;
            saque = saque % 50;
        }if (saque >=20){
            nota20 = saque / 20;
            saque = saque % 20;
        }if (saque >=10){
            nota10 = saque / 10;
            saque = saque % 10;
        }if (saque >=5){
            nota5 = saque / 5;
            saque = saque % 5;
        }if (saque >=2){
            nota2 = saque / 2;
            saque = saque % 2;
        }

        System.out.printf("Notas de 100: %d\n", nota100);
        System.out.printf("Notas de 50: %d\n", nota50);
        System.out.printf("Notas de 20: %d\n", nota20);
        System.out.printf("Notas de 10: %d\n", nota10);
        System.out.printf("Notas de 5: %d\n", nota5);
        System.out.printf("Notas de 2: %d\n", nota2);

        input.close();

    }
}
