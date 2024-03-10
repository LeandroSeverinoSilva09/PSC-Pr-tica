import java.util.Scanner;
public class Quest10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "ºF é igual a " + celsius + "ºC");

        scanner.close();
    }
}
