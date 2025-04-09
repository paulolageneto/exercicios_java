import java.util.Scanner;

public class inteiro_e_decimal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);

        try {
            System.out.println("digite um numero inteiro: ");
            int numINT = ler.nextInt();
            System.out.println("digite um numero decimal: ");
            double numDOUBLE = ler2.nextDouble();
            System.out.println("voce digitou: " + numINT + " e " + numDOUBLE);
        } catch (java.util.InputMismatchException e) {
            System.out.println("erro: digite um numero inteiro e um numero decimal.");
            System.err.println("erro" + e.getMessage());
        } finally {
            ler.close();
            ler2.close();
        }
    }
}
