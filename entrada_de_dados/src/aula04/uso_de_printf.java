import java.util.Date;
import java.util.Scanner;

public class uso_de_printf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerAno = new Scanner(System.in);
        Date data = new Date();

        int anoAtual = data.getYear();

        System.out.println("digite seu nome:");
        String nome = ler.next();
        System.out.println("digite seu ano de nascimento:");
        int anoNasc = lerAno.nextInt();

        System.out.printf("ola %-10, voce tem %02d%n", nome, anoAtual-anoNasc);

        ler.close();
        lerAno.close();
    }
    
}