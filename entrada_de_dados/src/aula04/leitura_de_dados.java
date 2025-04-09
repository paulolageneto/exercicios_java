import java.util.Scanner;

public class leitura_de_dados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1 = ler.nextInt();
        System.out.println("digite outro numero: ");
        int num2 = ler2.nextInt();

        // ADIÇÃO
        int total = num1 + num2;
        System.out.println("resultado adicao: "+total);
        
        // SUBTRAÇÃO
        total = num1 - num2;
        System.out.println("subtracao: "+total);

        // DIVISÃO
        total = num1 * num2;
        System.out.println("divisao: "+total);
        
        // MULTIPLICAÇÃO
        total = num1/num2;
        System.out.println("divisao: "+total);
        
        // RESTO
        total = num1%num2;
        System.out.println("divisao: "+total);

        ler.close();
        ler2.close();

        

    }
}
