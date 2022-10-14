package progra;
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("El primer dato es: ");
        int dato = cubrir.nextInt();
        System.out.println("El segundo dato es: ");
        int dato2 = cubrir.nextInt();
        System.out.println("El tercer dato es: ");
        int dato3 = cubrir.nextInt();
        if (dato == dato2) {
            System.out.println("Correcto, primer y segundo dato son iguales");
        } else {
            System.out.println("Error, primer y segundo dato no son iguales");
        }
        if (dato == dato3) {
            System.out.println("Correcto, primer y tercer dato son iguales");
        } else {
            System.out.println("Error, primer y tercer no son iguales");
        }
        if (dato2 == dato3) {
            System.out.println("Correcto, segundo y tercer dato son iguales");
        } else {
            System.out.println("Error, segundo y tercer dato no son iguales");
        }
    }
}