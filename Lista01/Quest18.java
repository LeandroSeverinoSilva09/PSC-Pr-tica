import java.util.Scanner;

public class Quest18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura de cada degrau, em metros:");
        double alturaDegrau = scanner.nextDouble();

        System.out.println("Digite a altura desejada, em metros:");
        double alturaDesejada = scanner.nextDouble();

        int quantidadeDegraus = (int) (alturaDesejada / alturaDegrau);

        System.out.println("Para atingir a altura desejada, suba " + quantidadeDegraus + " degraus.");

        scanner.close();
    }
}


