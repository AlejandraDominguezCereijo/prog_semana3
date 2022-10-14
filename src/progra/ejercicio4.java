package progra;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("Indica la base: ");
        int base= cubrir.nextInt();
        System.out.println("Indica la altura: ");
        int altura= cubrir.nextInt();
        int area = base * altura;
        System.out.println("El area es igual a "+area);
    }
}
