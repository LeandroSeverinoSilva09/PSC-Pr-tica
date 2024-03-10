import java.util.Scanner;
public class Quest14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int valorA = scanner.nextInt();

        System.out.println("Digite o valor de b:");
        int valorB= scanner.nextInt();

        int aux = valorA;
        valorA = valorB;
        valorB = aux;

        System.out.printf("O valor A é: %d e o valor B é: %d", valorA,valorB);


        scanner.close();
    }
}
