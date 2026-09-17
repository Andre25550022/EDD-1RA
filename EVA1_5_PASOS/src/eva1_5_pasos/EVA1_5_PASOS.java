package eva1_5_pasos;

public class EVA1_5_PASOS {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor de i: " + i);
        incrementar(i);
        System.out.println("Valor de i despues de incrementar: " + i);
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y: " + prueba.y);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y despues de incrementarObj: " + prueba.y);
    }
    
    public static void incrementar(int valor) {
        valor++;
    }
    
    public static void incrementarObj(Prueba obj) {
        obj.y++;
    }
    
    static class Prueba {
        public int y = 5;
    }
}
