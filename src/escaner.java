
import java.util.Scanner;

/**
 *
 * @author bille
 */
public class escaner {

    public static void main(String[] args) {

        System.out.println("Escribe tu nombre");

        Scanner consola = new Scanner(System.in); // Con la clase Scanner y el metodo nextLine() podremos solicitar
        // información al usuario y  recuperar  información de la consola 
        var nombre = consola.nextLine();

        System.out.println("Esctibe el titulo");
        var titulo = consola.nextLine();

        System.out.println("Resultado:" + titulo + " " + nombre);

    }

}
