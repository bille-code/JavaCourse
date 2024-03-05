
/**
 *
 * @author bille
 */
public class tiposprimitivos {
    
    public static void main(String[] args) {
        
        // tipos primitivos: byte, short, int, long
        
        byte numeroByte = (byte)129; 
        /*
        cuando el valor de la varibale sobrepasa el el tamaño de almacenamiento del tipo de dato byte
        podemos convertir el valor asignado a tipo byte utilizando parentesis antes de la literal de la variable 
        a esto se le conoce como conversion de tipos
        */
        
        System.out.println("Valor byte" + numeroByte);
        System.out.println("Valor minimo Byte:" + Byte.MIN_VALUE);
        System.out.println("Valor minimo Byte:" + Byte.MIN_VALUE);
    
    
        short numeroShort = 10;
        
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de Short:" + Short.MIN_VALUE);
        System.out.println("Valor minimo de Short:" + Short.MAX_VALUE);
    
    int numeroint = (int)2147483648L;
    
        System.out.println("numeroint = " + numeroint);
        System.out.println("Valor minimo de int:" + Integer.MIN_VALUE);
        System.out.println("Valor minimo de int:" + Integer.MAX_VALUE);
    
    long numerolong = 9223372036854775807L;
    
        System.out.println("numerolong = " + numerolong);
        System.out.println("Valor minimo de int:" + Long.MIN_VALUE);
        System.out.println("Valor minimo de int:" + Long.MAX_VALUE);
    }
    
        
    
}
