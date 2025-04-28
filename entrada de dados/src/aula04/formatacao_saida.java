import java.util.Date;

public class formatacao_saida {
    public static void main(String[] args) {
        Date data = new Date();

        System.out.printf("%td / %tm / %tY", data, data, data);
    }
}
