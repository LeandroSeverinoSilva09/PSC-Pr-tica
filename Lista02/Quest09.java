import java.util.Scanner;
public class Quest09 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double alturaCM;
    double pesoKG, pesoIdeal, pesoAjustado;
 
    //Considerando que será um homem que irá utilizar o programa
    // obs: O site está trocado as formulas quando seleciona o masculino é utilizado a formula do feminino.
    System.out.println("Digite o seu peso em KG:");
    pesoKG = scanner.nextDouble();

    System.out.println("Digite o sua altura em centimetros:");
    alturaCM = scanner.nextDouble();
    
    pesoIdeal = 52 + (0.75 * (alturaCM - 152.4));

    pesoAjustado = ((pesoKG - pesoIdeal) * 0.25) + pesoIdeal;
    
    System.out.printf("O seu peso ideal é: %.2f KG\n", pesoIdeal);
    System.out.printf("O seu peso ajustado é: %.2f KG", pesoAjustado);


    scanner.close();    
    }
}
