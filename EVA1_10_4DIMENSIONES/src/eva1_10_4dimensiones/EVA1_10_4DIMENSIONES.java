package eva1_10_4dimensiones;

public class EVA1_10_4DIMENSIONES {
    public static void main(String[] args) {
        int[][][][] arreglo = new int[2][2][2][2];

        for (int i = 0; i < arreglo.length; i++) { // PRIMER DIMENSION ---> FILAS
            for (int j = 0; j < arreglo[i].length; j++) { // SEGUNDA DIMENSION ---> COLUMNAS
                for (int k = 0; k < arreglo[i][j].length; k++) { // TERCERA DIMENSION ---> PROFUNDIDAD
                    for (int l = 0; l < arreglo[i][j][k].length; l++) { // CUARTA DIMENSION ---> ARREGLOS
                        arreglo[i][j][k][l] = (int) (Math.random() * 100);
                    }
                }
            }
        }

        for (int i = 0; i < arreglo.length; i++) { // PRIMER DIMENSION ---> FILAS
            for (int j = 0; j < arreglo[i].length; j++) { // SEGUNDA DIMENSION ---> COLUMNAS
                for (int k = 0; k < arreglo[i][j].length; k++) { // TERCERA DIMENSION ---> PROFUNDIDAD
                    for (int l = 0; l < arreglo[i][j][k].length; l++) { // CUARTA DIMENSION ---> ARREGLOS
                        System.out.print("[" + arreglo[i][j][k][l] + "] ");
                    }
                }
            }
        }
    }
    
}
