package aula07;

import java.util.Scanner;

public class classificacao_numeros {
    public static void main(String[] args) {
        Scanner inputN1 = new Scanner(System.in);
        Scanner inputN2 = new Scanner(System.in);
        Scanner inputN3 = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        int n1 =  inputN1.nextInt();
        System.out.println("digite o segundo numero:");
        int n2 =  inputN2.nextInt();
        System.out.println("digite o terceiro numero:");
        int n3 =  inputN3.nextInt();

        int menor, meio, maior; 

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                meio = n2;
                maior = n3;
            } else {
                meio = n3;
                maior = n2;
            }
        }
        if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                meio = n1;
                maior = n3;
            } else {
                meio = n3;
                maior = n1;
            }
        }else {
            menor = n3;
            if (n1 <= n2) {
                meio = n1;
                maior = n2;
            } else {
                meio = n2;
                maior = n1;
            }
        }
        System.out.println("ordem crescente: " + menor + ", " + meio + ", " + maior);
        System.out.println("ordem decrescente: " + maior + ", " + meio + ", " + menor);

        inputN1.close();
        inputN2.close();
        inputN3.close();
    }
}
