package progra;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("El primer dato es: ");
        int dato = cubrir.nextInt();
        int sumatorio= dato + 1;
        System.out.println("El dato mas 1 es: "+sumatorio);
        System.out.println("El segundo dato es: ");
        int dato2 = cubrir.nextInt();
        int multiplicacion = sumatorio * dato2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
    }
}
