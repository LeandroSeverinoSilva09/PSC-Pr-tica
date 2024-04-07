import java.util.Scanner;
public class Quest13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora de trabalho:");
        double valor_Hora = scanner.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês:");
        double horas_Trabalhadas = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto do INSS:");
        double percentual_INSS = scanner.nextDouble();

        double salario_Bruto = valor_Hora * horas_Trabalhadas;
        double desconto_INSS = (percentual_INSS / 100) * salario_Bruto;
        double salario_Liquido = salario_Bruto - desconto_INSS;

        System.out.println("Salário Líquido: " + salario_Liquido);

        scanner.close();
    }
}
