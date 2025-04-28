import java.util.Scanner;

public class leitura_de_texto {
    public static void main(String[] args) {
        Scanner lerFrase = new Scanner(System.in);
        String frase;
        String fraseMaisc;

        System.out.println("digite uma frase: ");
        frase = lerFrase.nextLine();
        System.out.println(frase.toUpperCase());
        lerFrase.close();
    }
}
