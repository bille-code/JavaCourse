
import java.util.Scanner;
/**
 *
 * @author bille
 */
public class tiendaLibros {
    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);
        System.out.println("Proporciona el nombre del libro");
        String name = data.nextLine();
        System.out.println("Proporciona el Id");
        int id = Integer.parseInt(data.nextLine());
        System.out.println("Proporciona el precio");
        Double precio = Double.parseDouble(data.nextLine());
        System.out.println("Proporciona el envío gratuito");
        boolean envio = Boolean.valueOf(data.nextLine());
        
        System.out.println("El nombre del libro es:" + name);
        System.out.println("El Id del libro es:" + id);
        System.out.println("El precio del libro es:" + "$" + precio);
        System.out.println("El envio del libro es:" + envio);
    }
}
