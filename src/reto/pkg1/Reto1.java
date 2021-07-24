
package reto.pkg1;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 57312
 */
public class Reto1 {

     public static void main(String[] args) {
        
         System.out.println(menu());
        
    }
    
    public static int menu(){
        Scanner leer = new Scanner (System.in); 
        
        boolean salir = false; 
        int opcion;
        
        while (!salir){
            
            System.out.println("1. Cargar calificaciones Estudiante.");
            System.out.println("2. Imprimir Boletin");
            System.out.println("3. Imprimir estado");
            System.out.println("4. Salir.");
            
            System.out.println("Introduce un numero entero");
            opcion = leer.nextInt();
            
            switch(opcion){
                
                case 1: 
                    System.out.println(cargarCalificaciones());
                    break;
                    
                case 2: 
                    
                    break; 
                    
                case 3: 
                    
                    break; 
                    
                case 4: 
                    
                    break;
            
            
            }
            
            
        
        
        }
        
        return 0;
    
    }
    
    public static float cargarCalificaciones(){
       Scanner leer = new Scanner(System.in);
       float mat,  cien,  ing, info, dep;
        System.out.println("Digite la nota de matemáticas: ");
        mat = leer.nextFloat();
        System.out.println("Digite la nota de Ciencias: ");
        cien = leer.nextFloat();
        System.out.println("Digite la nota de Inglés: ");
        ing = leer.nextFloat();
        System.out.println("Digite la nota de Informática: ");
        info = leer.nextFloat();
        System.out.println("Digite la nota de deportes: ");
        dep = leer.nextFloat();
        
        System.out.println("notas cargadas con éxito.");
        
       
        return menu();
    }
    
    
}
