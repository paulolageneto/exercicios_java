package aula07;

import java.util.Scanner;

public class calculo_bonus {
    public static void main(String[] args) {
        Scanner inputSalario = new Scanner(System.in);
        Scanner inputTempo = new Scanner(System.in);

        System.out.println("digite seu salario:");
        double salario = inputSalario.nextDouble();
        System.out.println("digite seu tempo de serviço (em anos):");
        int tempo = inputTempo.nextInt();

        if (tempo >= 5) {
            double bonus = salario * 1.1;
            System.out.println("novo salario: "+bonus);
        }else{
            System.out.println("nao tem bonus");
        }

        inputSalario.close();
        inputTempo.close();
    }
}
