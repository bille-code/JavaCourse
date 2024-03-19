
import java.util.Scanner;


/**
 *
 * @author bille
 */
public class conversionTipos {

    public static void main(String[] args) {
        //conversión de tipos, en este caso cuando utilizamos el tipo de dato String
        //para hacer la conversión utilizamos el metodo valueOf().
        // En caso utilicemos la palabra reservada var para convertir el tipo de dato 
        // A int utilizaremos la Integer.parseInt()

        /* data Type String Metod .valueOf()
        String edad = String.valueOf("20");
        System.out.println("edad = " + edad);*/
        //Inferencia de tipos con var Integer.parseInt() para hacer la conversión de dato
        var edad = Integer.parseInt("30");

        System.out.println("edad = " + (edad + 1)); // para realizar suma es necesario parentesis para modificar la prioridad de la expresión

        // Mismo caso cuando queremos convertir un dato a double 
        // tipo de dato String metodo .valueOf()
        
        /*
        String PI = String.valueOf("3.1416");
        System.out.println("PI = " + PI);*/
        
        var PI = Double.parseDouble("3.1416");
        System.out.println("PI = " + PI);
        
        //pedir información al usuario
        
        // La clase Scanner y su metodo NextLine() regresan un tipo String por lo que
        // es necesario realizar la conversión a tipo int
//        
//        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt( consola.nextLine() );
//        System.out.println("edad = " + edad);
        
       
//       //Ejercicio con tipo de dato String y conversión de dato a tipo int
//        String edad1 = String.valueOf("20");
//        Scanner consola1 = new Scanner(System.in);
//        System.out.println("Proporciona tu edad");
//        edad1 = consola1.nextLine();
//        System.out.println("tu edad es:" + edad1);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
    }

}
