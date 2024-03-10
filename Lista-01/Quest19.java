public class Quest19 {
    public static void main(String[] args) {
        
        int x;
        double quadrado, cubo;
        for (x=0; x<11; x++){

            quadrado = Math.pow(x,2);//pow é elevado
            cubo = Math.pow(x,3);

            System.out.printf("Numero: %d Quadrado: %f Cubo: %f \n", x, quadrado, cubo);
        }
    }
}
