import java.util.Scanner;

public class numero_decimal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1 = ler.nextInt();
        System.out.printf("numero foramtado: %02d%n",num1);

        ler.close();
    }
}
