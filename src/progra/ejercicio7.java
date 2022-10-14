package progra;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("El valor es: ");
        double valor= cubrir.nextDouble();
        System.out.println("Mi segundo valor es: ");
        double valor2= cubrir.nextDouble();
        double modulo= valor%valor2;
        System.out.println("El valor de mi modulo es: "+modulo);
    }
}
