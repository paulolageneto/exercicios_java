package aula07;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        String palavra = input.nextLine();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(palavraInvertida)) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
        input.close();
    }
}
