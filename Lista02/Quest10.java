import java.util.Scanner;
public class Quest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoKG, QtdLtrs;

        System.out.println("Digite o seu peso:");
        pesoKG = scanner.nextDouble();

        QtdLtrs = pesoKG * 35;
        QtdLtrs = QtdLtrs/1000;
        
        System.err.printf("A quantidade recomendade de água para voce é %.3f Litros", QtdLtrs);


        scanner.close();
    }
}
