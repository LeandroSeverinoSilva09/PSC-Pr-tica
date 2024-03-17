import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorA;
        double valorB;
        double valorC;
        double valorX;

        System.out.println("A está para B assim como c está para x");

        System.out.println("Digite o valor A:");
        valorA = scanner.nextDouble();

        System.out.println("Digite o valor B:");
        valorB = scanner.nextDouble();

        System.out.println("Digite o valor C:");
        valorC = scanner.nextDouble();

        // A = c
        // B = x

        valorX = (valorB * valorC) / valorA;

        System.out.println("O valor de X " + valorX);



        scanner.close();
    }

}
