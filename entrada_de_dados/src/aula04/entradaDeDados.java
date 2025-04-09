import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = ler.next();
        System.out.println("bem vindo! "+nome);

        ler.close();
    }
}
