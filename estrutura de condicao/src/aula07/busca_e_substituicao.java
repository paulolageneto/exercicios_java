package aula07;

import java.util.Scanner;

public class busca_e_substituicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite uma frase: ");
        String frase = input.nextLine();
        System.out.println("digite uma palavra que deseja buscar: ");
        String palavra = input.nextLine();

        if (frase.contains(palavra)) {
            System.out.println("frase contém a palavra " + palavra);
            System.out.println("digite uma palavra para substituir: ");
            String substituicao = input.nextLine();
            String novaFrase = frase.replace(palavra, substituicao);
            System.out.println("nova frase: " + novaFrase);
        } else {
            System.out.println("a frase nao contem a palavra " + palavra);
        }
        input.close();
    }
}
