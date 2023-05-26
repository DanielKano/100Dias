import java.util.Scanner;

public class Menor {
    static Scanner leer;
    static int[] num1;

    public static void main(String[] args) {
        leer = new Scanner(System.in);
        int cant;
        System.out.println("ingresa la cantidad el numero de numeros a cargar");
        cant = leer.nextInt();
        num1 = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("ingresa el numero de la pocicion: " + (i + 1));
            num1[i] = leer.nextInt();
        }
        for (int j = 0; j < cant - 1; j++) {
            for (int i = 0; i < (cant - 1) - j; i++) {
                if (num1[i] > num1[i + 1]) {
                    int aux;
                    aux = num1[i];
                    num1[i] = num1[i + 1];
                    num1[i + 1] = aux;
                }
            }   
        }
        System.out.println("numero de menor a mayor");
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
