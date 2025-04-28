import java.util.Scanner;

public class palavra_unica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("digite uma unica palavra: ");
            String palavra = ler.next();
            System.out.println("voce digitou: " + palavra);

        } catch (java.util.NoSuchElementException e) {
            System.out.println("erro:nenhuma palavra foi fornecida ");
        } finally {
            ler.close();
        }

    }
}
