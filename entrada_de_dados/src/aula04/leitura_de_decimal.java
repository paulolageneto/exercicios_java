import java.util.Scanner;

public class leitura_de_decimal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("digite um número decimal: ");
            double numero = ler.nextDouble();
            System.out.println("você digitou: " + numero);
        } catch (java.util.InputMismatchException e) {
            System.out.println("erro: digite um número decimnal.");
            System.err.println("erro: " + e.getMessage());
        } finally {
            ler.close();
        }

    }
}
