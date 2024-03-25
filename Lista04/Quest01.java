//Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. 
//O algoritmo deverá seguir todas as regras da divisão de números reais.
import java.util.Scanner;
public class Quest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2, resultado;

        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número número:");
        num2 = scanner.nextDouble();

        if (num2 == 0){
            System.out.printf("O número %.2f não é permitido\n", num2);
        }
        else {
            resultado = num1 / num2 ;
            System.out.println("O resultado da divisão é: " + resultado);
        }

        scanner.close();
    }
}
