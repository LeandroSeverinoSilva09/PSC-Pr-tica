//Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. 
//Essa situação é determinada através do IMC (Índice de Massa Corpórea), 
//que é definida pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo: 

import java.util.Scanner;
public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double peso;
        int altura = 0;
        double imc;
        
        System.out.println("Digite seu peso:");
        peso = scanner.nextDouble();

        System.out.println("Digite seu altura em metros utilizando '.':");
        peso = scanner.nextInt();

        imc = peso/ Math.pow(altura, 2);
        
        if (imc<20){
            System.out.println("Abaixo do peso");
        }
        if (imc >=20 && imc <25){
            System.out.println("Peso Normal");
        }
        if (imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }
        if ( imc >= 30 && imc <40){
            System.out.println("Obeso");
        }
        if (imc >= 40) {
            System.out.println("Obeso Mórbido");
        }










        scanner.close();
    }
}
