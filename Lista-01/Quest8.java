import java.util.Scanner;
public class Quest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros:");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.printf("%f metros é igual a %f centimetros",metros, centimetros);

        scanner.close();
    }
}

