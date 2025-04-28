package aula07;

import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args) {
        Scanner inputOp = new Scanner(System.in);
        Scanner inputN1 = new Scanner(System.in);
        Scanner inputN2 = new Scanner(System.in);

        System.out.println("esclha a operação (+    -    *   /)");
        char op = inputOp.next().charAt(0);

        System.out.println("digite o primeiro numero:");
        double n1 = inputN1.nextDouble();
        System.out.println("digite o segundo numero:");
        double n2 = inputN2.nextDouble();


        if (op=='+') {
            System.out.println(n1+n2);
        }
        if (op=='-') {
            System.out.println(n1-n2);
        }
        if (op=='*') {
            System.out.println(n1*n2);
        }
        if (op=='/') {
            System.out.println(n1/n2);
        }
        inputOp.close();
        inputN1.close();
        inputN2.close();
    }
}
