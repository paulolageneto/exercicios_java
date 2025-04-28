import java.util.Scanner;

public class leitura_de_caracteres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um caracter:");
        char caracter = ler.next().charAt(0);   
        String caracter1 = Character.toString(caracter);
        System.out.println(caracter1.toUpperCase());
        ler.close();
    }
}
