package progra;
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("La edad es: ");
        int edad = cubrir.nextInt();
        boolean r= carnet(edad);
        System.out.println(r);
    }
    public static boolean carnet (int edad) {
        boolean PuedeConducir;
        if (edad >= 18) {
            PuedeConducir = true;
        }
        else {
            PuedeConducir = false;
        }
        return PuedeConducir;
    }
}
