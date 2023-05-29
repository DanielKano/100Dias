import java.util.Scanner;

public class paises {
    static Scanner leer;
    static String[] Pais;
    static int[] pob;

    public static void main(String[] args) {
        int cant;
        System.out.println("ingresa la cantidad de paises a cargar");
        cant = leer.nextInt();
        Pais= new String[cant];
        pob= new int[cant];
        for (int i = 0; i < cant; i++){
            System.out.println("Ingresa el pais numero: "+(i+1));
            Pais[i]=leer.next();
            System.out.println("Ingresa la poblacion del pais numero: "+(i+1));
            pob[i]=leer.nextInt();
        }
        for (int j = 0; j < cant; j++){
            for (int i = 0; i < cant-j; i++){
                if(Pais[i].compareTo(Pais[i]+1)>0){
                    String auxp;
                    auxp=Pais[i];
                    Pais[i]=Pais[i+1];
                    Pais[i+1]=auxp;
                    int aux;
                    aux=pob[i];
                    pob [i]=pob [i+1];
                    pob [i+1]=aux;
                }
            }
        }
        System.out.println("Paises ordenados alfebaticamente");
        for (int i = 0; i < Pais.length; i++){
            System.out.println(Pais[i]);
            System.out.println(pob[i]);
        }
    }
}
