
import java.util.Scanner;

public class Tamaño {
    private static Scanner Leer;
    private static int [] num;
    public static void main(String[] args) {
        Leer=new Scanner(System.in);
        int cant;
        System.out.println("Cuantos numeros quieres ingresar");
        cant=Leer.nextInt();
        num=new int[cant];
        for(int i=0;i<num.length;i++){
            System.out.println("ingresa el numero "+(i+1));
            num [i]=Leer.nextInt();
        }
        int suma=0;
        for(int i=0;i<num.length;i++){
            suma=suma+num[i];
        }
        System.out.println("La suma de todos los numero es: "+suma);
    }
}
