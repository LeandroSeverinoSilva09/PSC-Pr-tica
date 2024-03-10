import java.util.Scanner;
public class Quest17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de canetas compradas:");
        int numeroCanetas = scanner.nextInt();

        System.out.println("Digite o valor total pago:");
        double valorPago = scanner.nextDouble();

        System.out.println("Digite o valor do troco recebido:");
        double troco = scanner.nextDouble();

        double custoCaneta = (valorPago - troco) / numeroCanetas;

        System.out.println("O custo de cada caneta é: R$ " + custoCaneta);

        scanner.close();
    }
}

