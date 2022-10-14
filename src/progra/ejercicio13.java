package progra;
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("El numero es: ");
        int numero = cubrir.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(numero + " por " + i + " es igual a: " + numero * i);
        }
    }
}