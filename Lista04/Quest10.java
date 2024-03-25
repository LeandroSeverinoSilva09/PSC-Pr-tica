import java.util.Scanner;
public class Quest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double porcentagemLucro;
        double valorVenda;
        double valorCompra;

        System.out.println("Digite o valor da compra com o fornecedor:");
        valorCompra = scanner.nextDouble();

    
        if (valorCompra < 50) {
            porcentagemLucro = 40;
        } else if (valorCompra <= 100) {
            porcentagemLucro = 30;
        } else {
            porcentagemLucro = 20;
        }

        valorVenda = valorCompra * (1 + porcentagemLucro / 100);

        System.out.println("Porcentagem do lucro: " + porcentagemLucro + "%");
        System.out.println("Valor da venda: R$" + valorVenda);

        scanner.close();
    }
}

