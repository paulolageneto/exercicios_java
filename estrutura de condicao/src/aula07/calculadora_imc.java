package aula07;

import java.util.Scanner;

public class calculadora_imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite seu peso em kg: ");
        double peso = input.nextDouble();
        System.out.println("digite sua altura em metros: ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("seu imc é: " + imc);

        // de acordo com o google
        if (imc < 18.5) {
            System.out.println("esta abaixo do peso.");
        }
        if (imc >= 18.5 && imc < 24.9) {
            System.out.println("esta com peso normal.");
        }
        if (imc >= 25 && imc < 29.9) {
            System.out.println("esta com sobrepeso.");
        } else {
            System.out.println("está obeso.");
        }
        input.close();
    }
}
