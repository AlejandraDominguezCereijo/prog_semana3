package progra;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("El primer dato es: ");
        int dato = cubrir.nextInt();
        System.out.println("El segundo dato es: ");
        int dato2 = cubrir.nextInt();
        if (dato == dato2) {
            System.out.println("Correcto, los datos son iguales");
        } else {
            System.out.println("Error, los datos no son iguales");
        }
    }
}
