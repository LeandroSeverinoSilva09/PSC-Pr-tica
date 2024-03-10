import java.util.Scanner;
public class Quest15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        Double valorA = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        Double valorB = scanner.nextDouble();

        System.out.println("Digite o valor de C:");
        Double valorC = scanner.nextDouble();

        double delta = valorB * valorB - 4 *valorA * valorC;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raizUnica = -valorB / (2 * valorA);
            System.out.println("A equação possui uma raiz real: " + raizUnica);
        } else {
            double raiz1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
            double raiz2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
            System.out.println("A equação possui duas raízes reais: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
        scanner.close();
    }
}
