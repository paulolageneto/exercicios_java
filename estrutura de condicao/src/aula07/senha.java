package aula07;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("crie uma senha com pelo menos 8 caracteres incluindo 1 letra e 1 numero");
        String senha = input.nextLine();
        boolean temLetra = false;
        boolean temNumero = false;
        boolean caracteres = false;

        if (senha.length() >= 8) {
            caracteres = true;
        }
        if (senha.matches(".*[a-zA-Z].*")) {
            temLetra = true;
        }
        if (senha.matches(".*[0-9].*")) {
            temNumero = true;
        }
        if (temLetra && temNumero && caracteres) {
            System.out.println("senha valida");
        } else {
            System.out.println("senha invalida");
        }
        input.close();
    }
}
