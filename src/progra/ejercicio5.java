package progra;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("Indica el radio: ");
        int r= cubrir.nextInt();
        final double PI = 3.1415;
        double area = PI * (r * r);
        System.out.println("El area de la circunferencia es "+area);
        double longitud = 2 * PI * r;
        System.out.println("La longitud de la circunferencia es "+longitud);
    }
}
