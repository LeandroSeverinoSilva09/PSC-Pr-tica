import java.util.Scanner;
public class Quest4 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Digite seu numero de telefone:");
        String telefone = scanner.nextLine(); //String porque o ddd pode ser digitado sem problemas

        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(telefone);


        scanner.close();
    }
}
