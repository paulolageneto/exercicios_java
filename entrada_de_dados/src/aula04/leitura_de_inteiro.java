import java.util.Scanner;

public class leitura_de_inteiro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("digite um número inteiro: ");
            int numero = ler.nextInt();
            System.out.println("você digitou: " + numero);
        } catch (java.util.InputMismatchException e) {
            System.out.println("erro: digite um número inteiro.");
            System.err.println("erro: " + e.getMessage());
        } finally {
            ler.close();
        }

    }
}
