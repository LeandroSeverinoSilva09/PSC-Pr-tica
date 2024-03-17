import java.util.Scanner;
public class Quest08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double arquivoMB;
        double velocidade;
        double tempo;

        System.out.println("Digite o tamanho do seu arquivo em MB:");
        arquivoMB = scanner.nextDouble();

        System.out.println("Digite a velocidade da sua internet em Mbps:");
        velocidade = scanner.nextDouble();
        
        // a velocidade é em megabits e o arquivo em megabytes vamos converter o arquivo para megabits
        arquivoMB = arquivoMB * 8.0;  // 1 byte são 8 bits
        
        tempo = arquivoMB/velocidade;
        
        System.out.printf("O tempo gasto será de %.3f segundos", tempo);


        scanner.close();
    }
}
