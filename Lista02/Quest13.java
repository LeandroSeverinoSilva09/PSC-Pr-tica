import java.util.Scanner;

public class Quest13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double den1, nume1, res1;
        double den2, nume2, res2;
        double mmc, result_final;

        System.out.println("Digite a fração 1\nDigite o denominador:");
        den1 = scanner.nextDouble();
        System.out.println("Digite o numerador:");
        nume1 = scanner.nextDouble();

        System.out.println("Digite a fração 2\nDigite o denominador:");
        den2 = scanner.nextDouble();
        System.out.println("Digite o numerador:");
        nume2 = scanner.nextDouble();

        //  1n   2n
        //  -- + --
        //  2d   3d   
        

        mmc = den1 * den2;

        res1 = mmc/den1;
        res1 = res1 * nume1;

        res2 = mmc/den2;
        res2 = res2 * nume2;

        result_final= (res1 + res2);

        System.out.printf("a soma eh %.1f\n         ------\n          %.1f", result_final, mmc);






        scanner.close();
    }
}
