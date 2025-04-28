package aula07;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("digite 3 lados de um triangulo:");
        double lado1 = input1.nextDouble();
        double lado2 = input2.nextDouble();
        double lado3 = input3.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("os lados formam um triangulo");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("triangulo equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("triangulo escaleno");
            } else {
                System.out.println("triangulo isosceles");
            }
        } else {
            System.out.println("os lados nao formam um triangulo");

        }
        input1.close();
        input2.close();
        input3.close();

    }
}
