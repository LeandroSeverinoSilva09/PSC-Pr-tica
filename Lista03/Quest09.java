import java.util.Scanner;
public class Quest09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade<16){
            System.out.println("Não é eleitor");
        }
        if (idade > 17 && idade>=16){
            System.out.println("Eleitor facultativo");
        }
        if (idade > 65 && idade > 18){
            System.out.println("Eleitor obrigatório");
        }
        if (idade > 65){
            System.out.println("Eleitor facultativo");
        }



        scanner.close();
    }

}
