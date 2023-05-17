
import java.util.Scanner;

/**
 * Ejercicio 30 version 2 Básicos
 * 
 * @author Discoduroderoer
 */
public class Contador {
    public static void main(String[] args) {
        
        //Pedimos el numero
       Scanner leer=new Scanner(System.in);
       int num=leer.nextInt();
        
       int contador=1;
        
        //Hasta que no se introduzca -1 no se sale
       while(num!=-1){
            
           contador++;
            
           num=leer.nextInt(); //Pedimos de nuevo el número
            
       }
         
       System.out.println("Fin, se ha introducido "+contador+" numeros");
        
    }

}
