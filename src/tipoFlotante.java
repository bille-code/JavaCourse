

/**
 *
 * @author bille
 */
public class tipoFlotante {
    
    public static void main(String[] args) {
        
        /*
        Los tipo de datos Flotantes pueden aceptar valores enteros así como valores
        con punto decimal, es importante saber que el valor al tener un punto es de tipo double
        
        Cuando la literal excede el valor maximo que permite el tipo float se pude hace la conversion
        de tipo utilizando una D que indica que es double y entre parentesis el tipo float, sin embargo el 
        valor es Infinity 
        */
        
        float numeroFloat = (float)3.4028235E38D;
        
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo:" + Float.MIN_VALUE);
        System.out.println("Valor Maximo:" + Float.MAX_VALUE);
        
        
        /*
        De igual manera en los tipos de datos double aceptan literales enteras sin problema
        asi como literales con punto decimal.
        
        */
        
        double numeroDouble = 1.7976931348623157E308D;
        
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo Double:" + Double.MIN_VALUE);
        System.out.println("Valor minimo Double:" + Double.MAX_VALUE);
    
        /*
        
        */
        
        
    }
    
}
