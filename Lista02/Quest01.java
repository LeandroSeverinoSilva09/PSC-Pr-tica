import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int horas;
        int minutos;
        int minutos_totais;
        
        System.out.println("Digite que horas são: ");
        horas = scanner.nextInt();

        System.out.println("Digite quais são os minutos: ");
        minutos = scanner.nextInt();

        horas = horas * 60;
        minutos_totais = horas + minutos;

        System.out.printf("Até o momento já se passaram %d minutos.", minutos_totais);



        scanner.close();
    }
    
}
