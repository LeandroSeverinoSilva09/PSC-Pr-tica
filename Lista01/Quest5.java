import java.util.Scanner;
public class Quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dolar utilizando ',' a ser convertido:");
        float num = scanner.nextFloat();

        float result = (float) (num/4.95) ;

        System.out.println("O valor em real é: " + result);


        scanner.close();
    }

}
