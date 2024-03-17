import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double etanol;
        double gasolina;
        double total;

        System.out.println("Digite o valor do etanol:");
        etanol = scanner.nextDouble();

        System.out.println("Digite o valor da gasolina:");
        gasolina = scanner.nextDouble();

        total =  gasolina * 0.7;  

        if (etanol < total){
            System.out.println("O etanol vale mais a pena!");
        }
        else {
            System.out.println("A gasolina vale mais a pena!");
        }


        scanner.close();
    }

}
