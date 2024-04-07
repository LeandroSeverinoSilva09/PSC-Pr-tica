//Escreva um programa em Java para ler o número total de eleitores de um município, 
//o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores
import java.util.Scanner;
public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numTotal;
        double numVotoBranco, percVTB;
        double numVotoNulo, percVTN;
        double numVotoValido, percVTV;

        System.out.println("Digite o numero total de eletores do municipio:");
        numTotal = scanner.nextDouble();

        System.out.println("Digite o numero total de votos brancos:");
        numVotoBranco = scanner.nextDouble();

        System.out.println("Digite o numero total de votos nulos:");
        numVotoNulo = scanner.nextDouble();

        System.out.println("Digite o numero total de votos válidos:");
        numVotoValido = scanner.nextDouble();

        percVTB = (numVotoBranco/numTotal)*100;
        percVTN = (numVotoNulo/numTotal)*100;
        percVTV = (numVotoValido/numTotal)*100;

        System.out.printf("O percentual de eletores que votaram em branco é: %.2f\n", percVTB);
        System.out.printf("O percentual de eletores que votaram em nulo é: %.2f\n", percVTN);
        System.out.printf("O percentual de eletores que votaram em válido é: %.2f", percVTV);



        scanner.close();
    }
}