import java.util.Scanner;
class Vectores8{
    private static Scanner leer;
    public static void main(String[] args) {
        leer=new Scanner(System.in);
        double[] numeros;
        numeros=new double[8];
        for(int i=0;i<8;i++){
            System.out.println("ingresa el "+(i+1)+" numero");
            numeros[i]=leer.nextDouble();
        }
        for(int i=0;i<8;i++){
            if(numeros[i]>36 && numeros[i]<50){
                System.out.println("numero mayores a 36");
                System.out.println(numeros[i]);
            }if (numeros[i]>50) {
                System.out.println("numero mayores a 50");
                System.out.println(numeros[i]);
            } else {
                
            }
        }
    }
}