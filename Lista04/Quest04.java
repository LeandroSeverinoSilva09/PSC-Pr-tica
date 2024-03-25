//Avalie o código abaixo e determine se suas saídas estão corretas. 
//Primeiro, tente identificar a falha sem executar o programa; 
//Em seguida, implemente e veja se acertou. Se houver erros, aponte-os e proponha e implemente as correções.
import java.util.Scanner;

public class Quest04 { //AumentoDeSalario
    public static void main(String[] args) {  
    //void calculoSalario() { em java se utiliza 
        double salario;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println();
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        // Todos tem que ser else if porque se não ele vai cair em mais de uma condição.

        if(salario <= 1000) {
            salario *= taxaAumento3;
        }

        else if(salario <= 2000) {
            salario *= taxaAumento2;
        }

        else if(salario <= 3000) {
            salario *= taxaAumento1;
        }

        else if (salario <= 4000) {
            salario = (salario * taxaAumento1) + 200;
        }

        System.out.println();
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);

        entrada.close();
    }
}