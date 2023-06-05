import java.util.Scanner;

public class Calculadora {

    public static int sumaVector(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    public static int[] encontrarMaximo(int[] vector) {
        int maximo = vector[0];
        int posicion = 0;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
                posicion = i;
            }
        }
        int[] resultado = { maximo, posicion };
        return resultado;
    }

    public static boolean vectorOrdenado(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] sumaVectores(int[] vector1, int[] vector2) {
        int n = vector1.length;
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }
        return resultado;
    }

    public static int productoEscalar(int[] vector1, int[] vector2) {
        int n = vector1.length;
        int producto = 0;
        for (int i = 0; i < n; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }

    public static double calcularPromedio(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int suma = 0;
        int totalElementos = filas * columnas;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }

        double promedio = (double) suma / totalElementos;
        return promedio;
    }

    public static int[] maximo(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int maximo = matriz[0][0];
        int local = 0;
        int local2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < maximo) {
                    maximo = matriz[i][j];
                    local = i;
                    local2 = j;
                }
            }
        }
        int[] posicionMaximo = { local, local2 };
        return posicionMaximo;
    }

    public static String cuadrada(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        String es;
        if (filas == columnas) {
            es = "cuadrada";
        } else {
            es = "rectangular";
        }
        return es;
    }

    public static int[][] sumaM(int[][] matriza, int[][] matrizb) {
        int filas = matriza.length;
        int columnas = matriza[0].length;
        int[][] matrizs = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizs[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }
        return matrizs;
    }

    public static void Diagonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            System.out.println("La matriz no es cuadrada. No tiene diagonal principal.");
            return;
        }

        System.out.print("La diagonal principal de la matriz es: ");
        for (int i = 0; i < filas; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public static boolean esTriangularSuperior(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si la matriz es cuadrada
        if (filas != columnas) {
            return false;
        }

        // Verificar si los elementos debajo de la diagonal principal son todos cero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int[] Sumalinea(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[] sumaFilas = new int[filas];

        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
        }

        return sumaFilas;
    }

    public static boolean esDiagonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int[] multiplicarVectorMatriz(int[] vector, int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (vector.length != columnas) {
            return null;
        }

        int[] resultado = new int[filas];

        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += vector[j] * matriz[i][j];
            }
            resultado[i] = suma;
        }

        return resultado;
    }

    public static int[][] transpuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] nueva = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                nueva[j][i] = matriz[i][j];
                System.out.println(matriz[j][i] + " ");
            }
            System.out.println(" ");
        }
        return nueva;

    }

    public static int[] minimo(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int minimo = matriz[0][0];
        int local = 0;
        int local2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > minimo) {
                    minimo = matriz[i][j];
                    local = i;
                    local2 = j;
                }
            }
        }
        int[] posicionminimo = { local, local2 };
        return posicionminimo;
    }

    public static boolean esSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int[] productoEscalar(int[] vector, int escalar) {
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }

        return resultado;
    }

    public static int[] cargarVector() {
        Scanner leer = new Scanner(System.in);
        int cant;
        System.out.println("Ingresa la cantidad de números a cargar:");
        cant = leer.nextInt();
        int[] numeros = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresa el número de la posición " + (i + 1) + ":");
            numeros[i] = leer.nextInt();
        }
        return numeros;
    }

    public static int[][] cargarMatriz() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz:");
        int filas = leer.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz:");
        int columnas = leer.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el elemento de la posición (" + i + ", " + j + "):");
                matriz[i][j] = leer.nextInt();
            }
        }

        return matriz;
    }

    public static void opciones(int op) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        int[] vector2;
        int[][] matriz;
        int[][] matriz2;
        double res;
        int rest[];
        switch (op) {
            case 1:
                vector = cargarVector();
                res = sumaVector(vector);
                System.out.println("la suma del vector es: " + res);
                break;
            case 2:
                vector = cargarVector();
                rest = encontrarMaximo(vector);
                System.out.println("El elemento maximo del vector es " + rest[0]);
                System.out.println("la pocicion es " + rest[1]);
                break;
            case 3:
                vector = cargarVector();
                System.out.println("El vector esta ordenado de forma ascendente: " + vectorOrdenado(vector));
                break;
            case 4:
                vector = cargarVector();
                vector2 = cargarVector();
                rest = sumaVectores(vector, vector2);
                System.out.print("El vector resultante es: ");
                for (int i = 0; i < rest.length; i++) {
                    System.out.print(rest[i] + " ");
                }
                System.out.println();
                break;
            case 5:
                vector = cargarVector();
                vector2 = cargarVector();
                res = productoEscalar(vector, vector2);
                System.out.println("El producto escalar de los vectores es: " + res);
                break;
            case 6:
                matriz = cargarMatriz();
                res = calcularPromedio(matriz);
                System.out.println("El promedio de los elementos de la matriz es: " + res);
                break;
            case 7:
                matriz = cargarMatriz();
                int[] posicionMaximo = maximo(matriz);
                int filaMaximo = posicionMaximo[0];
                int columnaMaximo = posicionMaximo[1];

                System.out.println("El elemento máximo en la matriz es: " + matriz[filaMaximo][columnaMaximo]);
                System.out.println("Su posición es: Fila " + filaMaximo + ", Columna " + columnaMaximo);
                break;
            case 8:
                matriz = cargarMatriz();
                cuadrada(matriz);
                break;
            case 9:
                matriz = cargarMatriz();
                matriz2 = cargarMatriz();
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        System.out.println(sumaM(matriz, matriz2) + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 10:
                matriz = cargarMatriz();
                Diagonal(matriz);
                break;
            case 11:
                matriz = cargarMatriz();
                boolean resultado = esTriangularSuperior(matriz);
                System.out.println("La matriz es triangular superior: " + resultado);
                break;
            case 12:
                matriz = cargarMatriz();
                int[] sumaFilas = Sumalinea(matriz);

                for (int i = 0; i < sumaFilas.length; i++) {
                    System.out.println("La suma de los elementos de la fila " + (i + 1) + " es: " + sumaFilas[i]);
                }
                break;
            case 13:
                matriz = cargarMatriz();
                posicionMaximo = maximo(matriz);
                filaMaximo = posicionMaximo[0];
                columnaMaximo = posicionMaximo[1];

                System.out.println("El elemento máximo en la matriz es: " + matriz[filaMaximo][columnaMaximo]);
                System.out.println("Su posición es: Fila " + filaMaximo + ", Columna " + columnaMaximo);
                break;
            case 14:
                matriz = cargarMatriz();
                matriz2 = cargarMatriz();
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        System.out.println(sumaM(matriz, matriz2) + " ");
                    }
                    System.out.println(" ");
                }
                break;
            case 15:
                matriz = cargarMatriz();
                boolean resultado1 = esDiagonal(matriz);
                System.out.println("La matriz es diagonal: " + resultado1);
                break;
            case 16:
                vector = cargarVector();
                matriz = cargarMatriz();
                rest = multiplicarVectorMatriz(vector, matriz);
                if (rest == null) {
                    System.out.println("El tamaño del vector no es compatible con la matriz.");
                } else {
                    System.out.print("El vector resultante de la multiplicación es: ");
                    for (int i = 0; i < rest.length; i++) {
                        System.out.print(rest[i] + " ");
                    }
                    System.out.println();
                }
                break;
            case 17:
                matriz = cargarMatriz();
                transpuesta(matriz);
                break;
            case 18:
                matriz = cargarMatriz();
                int[] posicionminimo = minimo(matriz);
                int filaminimo = posicionminimo[0];
                int columnaminimo = posicionminimo[1];

                System.out.println("El elemento máximo en la matriz es: " + matriz[filaminimo][columnaminimo]);
                System.out.println("Su posición es: Fila " + filaminimo + ", Columna " + columnaminimo);
                break;
            case 19:
                matriz = cargarMatriz();
                resultado1 = esSimetrica(matriz);
                System.out.println("La matriz es simétrica: " + resultado1);
                break;
            case 20:
                vector = cargarVector();
                System.out.println("ingresa el escalar:");
                int escalar = leer.nextInt();
                rest = productoEscalar(vector, escalar);
                System.out.print("El vector resultante del producto escalar es: ");
                for (int i = 0; i < rest.length; i++) {
                    System.out.print(rest[i] + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("el programa finalizo");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el problema a resolver teniendo encuenta la guia");
        int op = leer.nextInt();
        opciones(op);
    }
}
