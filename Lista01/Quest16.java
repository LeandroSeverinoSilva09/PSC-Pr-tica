import java.util.Scanner;
public class Quest16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida, em km:");
        double distancia = scanner.nextDouble();

        System.out.println("Digite a quantidade de combustível consumida, em litros:");
        double ltrsConsumidos = scanner.nextDouble();

        double consumoMedio = distancia / ltrsConsumidos;

        System.out.println("O consumo médio de combustível é: " + consumoMedio + " km/l");

        scanner.close();
    }
}
