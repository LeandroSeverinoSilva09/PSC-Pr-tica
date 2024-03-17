import java.util.Scanner;
public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float largura, comprimento, area;

        System.out.println("Digite a largura:");
        largura = scanner.nextFloat();

        System.out.println("Digite a comprimento:");
        comprimento = scanner.nextFloat();

        area = largura * comprimento;

        area = (float) Math.ceil(area);
        area = (float) (area * 0.10);

        System.out.printf("A quantidade de ceramica que voce ira precisar no total é %.2f metros quadrados\n", area);
        
        
        scanner.close();
    }

}
