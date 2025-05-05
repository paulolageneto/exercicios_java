package aula08;

import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite uma palavra: ");
        String palavra = input.nextLine();
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho; i++) {
            System.out.println(palavra.charAt(i) + " ");
        }
        input.close();
    }
}
