/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bille
 */
public class Concatenacion {
    
    public static void main(String[] args) {
        
        String usuario = "Ruben";
        String titulo = "Desarrollador de software";
        
        var union = (titulo + " " + usuario);
        System.out.println("union = " + union);
        
        int i = 3;
        int j = 4;
        
        System.out.println(i + j); // Realiza la operación de numeros
        System.out.println( i + j +" " + usuario); // Realiza la operacion de suma primero y posteriormente la concatenación
        System.out.println(usuario + i + j); // Si en la ejecución de la expresion encuentra una cadena al inicio todo lo 
                                             // siguiente sera una cadena a esto se le llama contexto cadena. 
                                             
        System.out.println(usuario + " " + (i + j)); // Para realizar una operacion aritmetica cuando se antepone una cadena 
                                                     // esto es posible utilizando la jerarquización de operaciones utilizando
                                                     // parentesis
      
               
        
           
    }
    
}
