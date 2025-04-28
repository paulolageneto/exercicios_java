package aula07;

import java.util.Scanner;

public class dia_da_semana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero entre 1 e 7");
        int n1 = input.nextInt();

        if (n1==1) {
            System.out.println("domingo");
        }
        if (n1==2) {
            System.out.println("segunda");
        }
        if (n1==3) {
            System.out.println("terça");
        }
        if (n1==4) {
            System.out.println("quarta");
        }
        if (n1==5) {
            System.out.println("quina");
        }
        if (n1==6) {
            System.out.println("sexta");
        }
        if (n1==7) {
            System.out.println("sabado");
        }

        input.close();
    }
}
