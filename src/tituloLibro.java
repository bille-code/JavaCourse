
import java.util.Scanner;


/**
 *
 * @author bille
 */
public class tituloLibro {
    public static void main(String[] args) {
        
        System.out.println("Proporciona el titulo");
        
        Scanner data = new Scanner(System.in);
        
       var titulo = data.nextLine();
       
        System.out.println("Proporciona el autor");
        
        var autor = data.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
    }
        
}
