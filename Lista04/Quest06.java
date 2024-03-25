import java.util.Scanner;
public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int estação = 0;

        System.out.println("informe a estação do ano\n1 para Primavera\n2 para Verão\n3 para Outono\n4 para Inverno ");
        estação = scanner.nextInt();

        switch (estação) {
            case 1:
                System.out.println("A floração das plantas e o desabrochar das flores são características marcantes.");
                break;
            case 2:
                System.out.println("O verão é geralmente a estação mais quente do ano.");
                break;
            case 3:
                System.out.println("O outono é caracterizado pela queda das folhas das árvores.");
                break;
            case 4:
                System.out.println("O inverno é geralmente a estação mais fria do ano.");
                break;
            default:
                System.out.println("Nenhuma estação foi escolida!");
                break;
        }

        scanner.close();
    }
}