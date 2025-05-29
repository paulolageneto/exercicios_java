package aula10;

import java.util.Random;
import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int vidas = 5;

        String[] palavras = { "programacao", "java", "computador", "garrafa" };
        String palavraSecreta = palavras[random.nextInt(palavras.length)];
        char[] progresso = new char[palavraSecreta.length()];

        boolean[] letrasDescobertas = new boolean[palavraSecreta.length()];

        // coloca _ na palavra
        for (int i = 0; i < progresso.length; i++) {
            progresso[i] = '_';
        }

        while (vidas > 0) {
            System.out.println("vidas restantes: " + vidas);
            System.out.print("Palavra: ");
            // imprime o progresso da palavra
            for (char c : progresso) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.println("digite uma letra:");
            char letraDigitada = input.next().charAt(0);
            boolean acertou = false;

            // verifica se a letra existe na palavra
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letraDigitada) {
                    progresso[i] = letraDigitada;
                    letrasDescobertas[i] = true;
                    acertou = true;
                }
            }

            if (acertou == false) {
                vidas--;
                System.out.println("letra errada!");
            } else {
                System.out.println("letra correta!");
            }

            System.out.println("-------------------------");

            if (palavraSecreta.equals(new String(progresso))) {
                System.out.println("parabens! voce adivinhou a palavra: " + palavraSecreta);
                break;
            }

            if (vidas == 0) {
                System.out.println("voce perdeu! a palavra era: " + palavraSecreta);
            }

        }
        input.close();
    }
}
