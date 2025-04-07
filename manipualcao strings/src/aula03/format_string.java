
package aula03;


public class format_string {
    public static void main(String[] args) {
        double preco = 2;
        String precoFormatado = String.format("o preco formatado %.2f", preco);
        
        System.out.println(precoFormatado);
    }
}
