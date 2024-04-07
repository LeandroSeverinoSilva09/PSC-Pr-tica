//Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. 
//Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
//(considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.
import java.util.Scanner;
public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, media ; 

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 )/3;

        if (media >= 7){
            System.out.println("O aluno foi aprovado com a média de: " + media);

        }
        else {
            System.out.println("O aluno foi reprovado com a média de :" + media );
        }





        scanner.close();
    }
}
