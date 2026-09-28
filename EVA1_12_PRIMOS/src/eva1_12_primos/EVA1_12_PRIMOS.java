package eva1_12_primos;
import java.util.Scanner;

public class EVA1_12_PRIMOS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = sc.nextInt();

        //Metodo 1 hasta n - 1
        boolean primo1 = true;

        if (n < 2) {
            primo1 = false;
        } else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    primo1 = false;
                    break;
                }
            }
        }

        // Metodo 2 hasta raiz n

        boolean primo2 = true;

        if (n < 2) {
            primo2 = false;

        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo2 = false;
                    break;
                }
            }
        }

        // RESULTADOS

        if (primo1) {
            System.out.println("El numero " + n + " es primo");
        } else {
            System.out.println("El numero " + n + " no es primo");
        }

        if (primo2) {
            System.out.println("El numero " + n + " es primo");
        } else {
            System.out.println("El numero " + n + " no es primo");
        }

        sc.close();
    }
    
}
