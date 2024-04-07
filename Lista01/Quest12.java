import java.util.Scanner;
public class Quest12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");

        int valor = scanner.nextInt();

        int ante = valor - 1;
        int suces = valor + 1;

        System.out.println("Antecessor: " + ante);

        System.out.println("Sucessor: " + suces);

        scanner.close();
    }
}
