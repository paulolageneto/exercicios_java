package aula10;

import java.util.Random;
import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = { "pedra", "papel", "tesoura" };
        int computador = random.nextInt(3);
        String computadorEscolha = opcoes[computador];

        System.out.println("escolha: pedra, papel ou tesoura");
        String escolha = input.nextLine();
        System.out.println("computador escolheu: " + computadorEscolha);

        if (escolha.equals(computadorEscolha)) {
            System.out.println("empate");
        }
        if (escolha.equals("pedra") && computadorEscolha.equals("tesoura")
                || escolha.equals("papel") && computadorEscolha.equals("pedra")
                || escolha.equals("tesoura") && computadorEscolha.equals("papel")) {
            System.out.println("voce ganhou");
        } else {
            System.out.println("voce perdeu");
        }

        input.close();

    }
}