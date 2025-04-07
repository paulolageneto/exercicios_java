
package aula03;


public class manipulacao_caracter {
    public static void main(String[] args) {
        String frase = "programação em Java é incrível";

        // letra a
        String parte1 = frase.substring(12);

        // letra b
        char[] caracter = frase.toCharArray();
        caracter[4] = '*';
        String asterisco = new String(caracter);

        System.out.println(parte1);
        System.out.println(caracter);
    }
}
