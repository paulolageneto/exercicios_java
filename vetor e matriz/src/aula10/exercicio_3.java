package aula10;

import java.util.Random;
import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int[] r = new int[6];
        int[] numeros = new int[6];

        System.out.println("digite 6 numeros: ");
        for (int i = 0; i < 6; i++) {
            numeros[i] = input.nextInt();
        }

        int qtdAcertos = 0;
        for (int i = 0; i < 6; i++) {
            r[i] = random.nextInt(1, 10);
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numeros[i] == r[j]) {
                    qtdAcertos++;
                }
            }
        }
        System.out.println("numeros sorteados: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println(" ");
        System.out.println("qauntidade de acertos: " + qtdAcertos);

        input.close();

    }
}
