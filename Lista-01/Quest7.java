import java.util.Scanner;
public class Quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu salário, utilize ',':");
        float salario = scanner.nextFloat();
        
        float salario_reajustado = (float) (salario + salario*0.07);

        System.out.println("O seu salário reajustado é: " + salario_reajustado);


        scanner.close();
    }

}
