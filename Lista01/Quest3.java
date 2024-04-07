import java.util.Scanner;

public class Quest3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        
        String nome = scanner.next();
        
        System.out.println("Seja bem vindo " + nome);

        scanner.close();
    }
}
