import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorA, quadA;
        int valorB, quadB;
        int soma;
        double valorC;

        System.out.println("Informe o valor de A: ");
        valorA = scanner.nextInt();

        System.out.println("Informe o valor de B: ");
        valorB = scanner.nextInt();
        
        quadA = valorA * valorA;
        quadB = valorB * valorB;
        soma = quadA + quadB;
        valorC = Math.sqrt(soma);

        System.err.println("o valor da hipotenusa eh: " + valorC);



        scanner.close();
    }

}
