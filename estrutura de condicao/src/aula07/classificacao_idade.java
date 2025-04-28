package aula07;
import java.util.Scanner;

public class classificacao_idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite sua idade:");
        int idade = input.nextInt();

        if (idade>=60) {
            System.out.println("idoso");
        }
        if (idade>=18 && idade<=59) {
            System.out.println("adulto");
        }
        if (idade>=13 && idade<=17) {
            System.out.println("adolescente");
        }
        if (idade<=12) {
            System.out.println("criança");   
        }

        input.close();
    }
}
