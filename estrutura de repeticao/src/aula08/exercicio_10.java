package aula08;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("selecione a operacao: ");
            System.out.println(" +  -  *  /");
            System.out.println("digite x para sair");
            String operador = input.next();
            
            if (operador.equals("x")) {
                System.out.println("saindo...");
                input.close();
                break;
            }
            
            System.out.println("digite um numero: ");
            int n1 = input.nextInt();
            System.out.println("digite outro numero: ");
            int n2 = input.nextInt();


            switch (operador) {
                case "+":
                    System.out.println("soma: " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("subtracao: " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("multiplicacao: " + (n1 * n2));
                    break;
                case "/":
                    if (n2 != 0) {
                        System.out.println("divisao: " + (n1 / n2));
                    } else {
                        System.out.println("nao e possivel dividir por zero");
                    }
                    break;
                default:
                    System.out.println("operador invalido");
            }
        }
    }
}
