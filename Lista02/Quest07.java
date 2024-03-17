import java.util.Scanner;
public class Quest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float largura, comprimento, area, valorM2, valorTotal;

        System.out.println("Digite a largura:");
        largura = scanner.nextFloat();

        System.out.println("Digite a comprimento:");
        comprimento = scanner.nextFloat();

        System.out.println("Informe o valor do metro quadrado da ceramica:");
        valorM2 = scanner.nextFloat();

        area = largura * comprimento;

        area = (float) Math.ceil(area);
        area = (float) (area * 0.10);

        valorTotal = area * valorM2;

        System.out.printf("A quantidade de ceramica que voce ira precisar no total é %.2f metros quadrados.\n", area);

        System.out.printf("o valor total que voce ira gastar sera %.2f reais.", valorTotal);

        
        
        scanner.close();
    }

}
