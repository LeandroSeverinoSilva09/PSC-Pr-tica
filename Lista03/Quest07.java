import java.util.Scanner;
public class Quest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int qtd;
        double preco, precoTotal, precoDesconto=0;
        

        System.out.println("Digite o nome do produto: ");
        nome = scanner.nextLine();

        System.out.println("Digite a quantidade do produto: ");
        qtd = scanner.nextInt();
        
        System.out.println("Digite o preço unitário do produto: ");
        preco = scanner.nextDouble();

        precoTotal = qtd *preco;

        if(qtd <=5){
            precoDesconto = precoTotal- (precoTotal* 0.02);
        }
        if(qtd>5 && qtd<=10){
            precoDesconto = precoTotal- (precoTotal* 0.03);
        }
        if(qtd >10 && qtd < 30){
            precoDesconto = precoTotal- (precoTotal* 0.05);
        }
        if(qtd>=30){
            precoDesconto = precoTotal- (precoTotal* 0.10);
        }

        System.out.printf("O preço total do produto %s é %f\n.", nome,preco);
        System.out.println("o preço com desconto é: " + precoDesconto);



        









        scanner.close();
    }

}
