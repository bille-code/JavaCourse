/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bille
 */
public class HolaMundo {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java");
        
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        /*la palabra resevada var hará inferencia de tipos en Java             
    1     es decir determina automaticamente el tipo de dato de acuerdo                      
    2     a la literal 
        
           La inferencia de tipos con la palabra reservada var solo
        funciona con las versiones JDK superiores a la 10 de otro modo se 
        tendrá que agregar el tipo de dato que almacenara la variable.
        */
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        /*
        Para unir dos cadenas se utiliza el operador de + a esto 
        se le llama concatenación.
        */
        var miVariableCadena2 = "Inferencia de tipos";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        
                 /*Reglas y conveciones para definir variables en Java
        
          Definir variables en Java
          - Si el nombre de la variable consta de dos palabras utilizaremos
          la convecion de lower camel case es decir la primera letra del nombre 
          deberá ser es minuscula y la primera letra de la segunda palabra será
          mayuscula
            ejemplo:
           
          var  miVariable = 1;
            
          - Esta permitido comenzar el nombre de la variable con un guion bajo

             var _miVarible = 2;

          - Esta permitido comenzar el nombre de la variable con el signo

             var $miVariable = 3;
            
             -No esta permitido comenzar el nombre de la variable con caracteres
             especiales

             var #miVariable = 4;  "Esto no esta permitido"

             - Esta permitido comenzar le nombre de la variable con acentos
             aunque esto esta permitido no es recomendable utilizar esta forma

             var ámiVariable = 5;
         */

                /*
                 Ejemplos de asginación de nombre de variables
                 */
                
                var miVariable = 1;
                System.out.println("miVariable = " + miVariable);
                var _miVariable = 2;
                System.out.println("_miVariable = " + _miVariable);
                var $miVariable = 3;
                //var #miVariable = 4; // esto no esta permitido 
                
                System.out.println("$miVariable = " + $miVariable);
                    
                
                
    }
    
}
