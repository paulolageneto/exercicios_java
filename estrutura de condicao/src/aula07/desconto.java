package aula07;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner inputPreco = new Scanner(System.in);
        Scanner inputDesconto = new Scanner(System.in);
        System.out.println("digite o preco do produto: ");
        double preco = inputPreco.nextDouble();
        System.out.println("digite o desconto: ");
        double desconto = inputDesconto.nextDouble();
        double valor = (preco * desconto) / 100;
        double precoFinal = preco - valor;

        if (desconto >= 0 && desconto <= 100) {
            System.out.printf("o preco final do produto com desconto: %.2f", precoFinal);
        } else {
            System.out.println("desconto invalido");
        }
        inputPreco.close();
        inputDesconto.close();
    }
}
