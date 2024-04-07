import java.util.Scanner;
public class Quest08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l1, l2, l3;
        boolean triangulo=false;

        System.out.println("Digite o primeiro lado do triângulo: ");
        l1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        l2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        l3 = scanner.nextDouble();

        if (l2 + l3 > l1 || l1 + l2 > l3 || l1 + l3 > l2 ){
            triangulo = true;
        }
        else {
            System.out.println("Os valores digitados não correspondem a um triângulo");
        }
        if (triangulo){
            if (l1 == l2 && l2== l3){
                System.out.println("O triângulo é equilátero!!");
            }
            else if(l1==l2 || l2==l3 || l3==l1){
                System.out.println("o triâgulo é isocelis!!");
            }
            else if(l1!=l2 || l2!=l3 || l3!=l1){
                System.out.println("O triângulo é escaleno!!");
            }
        }

        scanner.close();
    }
    
}
