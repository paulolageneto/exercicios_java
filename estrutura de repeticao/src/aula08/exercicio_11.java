package aula08;

import java.util.Scanner;

public class exercicio_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("digite um numero: ");
    int n1 = input.nextInt();
    int tamanho = Integer.toString(n1).length();
    int soma = 0;

    for (int i = 1; i <= tamanho; i++) {
      char n = Integer.toString(n1).charAt(i);
      soma += Math.pow(Character.digit(n, 10), tamanho);
    }
    if (soma == n1) {
      System.out.println("numero digitado e um numero de armstrong " + n1);

    }
    input.close();

  }
}
