package progra;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner cubrir= new Scanner(System.in);
        System.out.println("Indica el nombre: ");
        String nombre= cubrir.nextLine();
        System.out.println("Indica la localidad: ");
        String localidad= cubrir.nextLine();
        System.out.println("Indica el gusto: ");
        String gusto= cubrir.nextLine();
        System.out.println("Mi nombre es "+nombre+ ", mi localidad es "+localidad+ " y me gusta "+gusto);
    }
}
