import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;
        double perimetro;
        double diagonal, quadAlt, quadBase, soma;
        double area;
        


        System.out.println("Digite o valor da Base: ");
        base = scanner.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = scanner.nextDouble();

        area =  base*altura;
        System.out.println("A area do retangulo eh:" + area);

        perimetro = (base * 2) + (altura * 2);
        System.out.println("o valor do perimetro do retangulo eh: " + perimetro);

        quadAlt = altura * altura;
        quadBase = base * base;
        soma = quadAlt + quadBase;
        diagonal = Math.sqrt(soma);

        System.out.println("O valor da diagonal do retangulo eh: " + diagonal);

        




        scanner.close();
    }
}
