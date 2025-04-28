package aula07;

import java.util.Scanner;

public class maior_de_idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite sua idade:");
        int idade = input.nextInt();

        if (idade>=18) {
            System.out.println("voce é maior de idade");
        }else{
            System.out.println("voce é menor de idade");
        }

        input.close();
    }
}
