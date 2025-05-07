package aula08;


import java.util.Random;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int numero_secreto = r.nextInt(100);
        int chute =0;

        while (true) {
            System.out.print("digite um numero: ");
            chute = input.nextInt();
            
            if (chute > numero_secreto){
                System.out.println("numero é maior!");
            }if (chute < numero_secreto){
                System.out.println("numero é menor!");
            }if (chute == numero_secreto){
                System.out.println("parabens! voce acertou o numero secreto!");
                break;
            }
            
        }
        input.close();
    }
}
