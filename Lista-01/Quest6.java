import java.util.Scanner;
public class Quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = scanner.nextInt();
        int dias = idade * 365;

        String saida_formatada = String.format("Voce já viveu %d dias", dias);
        System.out.println(saida_formatada);
        
        scanner.close();


    }

}
