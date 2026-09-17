package eva1_8_arreglos_objetos;

public class EVA1_8_ARREGLOS_OBJETOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = null;
        //System.out.println("Arreglo " + arreglo);
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo =" + arreglo);
        System.out.println("Arreglo[0] =" + arreglo[0]);
        System.out.println("Arreglo[1] =" + arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("Arreglo[0] =" + arreglo[0]);
        System.out.println("Arreglo[1] =" + arreglo[1]);

        System.out.println("Arreglo[0].a =" + arreglo[0].a);
        System.out.println("Arreglo[1].a =" + arreglo[1].a);
        
    }
    
}

class Ejemplo {
    int a;   
}
