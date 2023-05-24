import java.util.Scanner;
public class Menor {
    static Scanner leer;
    static int [] num1;
    public static void main(String[] args) {
        leer=new Scanner(System.in);
        int cant;
        System.out.println("ingresa la cantidad el numero de numeros a cargar");
        cant = leer.nextInt();
        num1 = new int[cant];
        for (int i = 0; i < cant; i++){
            System.out.println("ingresa el numero de la pocicion: "+(i+1));
            num1[i]=leer.nextInt();
        }
        int menor;
        menor=num1[0];
        int local;
        for(int f=1;f>num1.length;f++) {
            if (num1[f]>menor) {
                menor=num1[f];
                local=f;
            }
        }
        System.out.println("el numero menor es :"+menor);
    }
}
