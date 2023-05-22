import java.util.Scanner;

class Paralelo {
    static Scanner leer;
    static int[] num1;
    static int[] num2;

    public static void main(String[] args) {
        int cant;
        System.out.println("ingresa la cantidad de filas y columnas");
        cant = leer.nextInt();
        num1 = new int[cant];
        num2 = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("ingresa el numero de superior: "+(i+1));
            num1[i]=leer.nextInt();
            System.out.println("ingresa el numero de superior: "+(i+1));
            num2[i]=leer.nextInt();
        }
        int suma;
        for(int i=0;i<cant;i++){
            System.out.println(num1[i]);
            System.out.println(num2[i]);
            suma=num1[i]+num2[i];
            System.out.println(suma);
        }
    }
}
