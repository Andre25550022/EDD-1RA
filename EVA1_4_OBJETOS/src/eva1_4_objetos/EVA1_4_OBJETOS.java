package eva1_4_objetos;

public class EVA1_4_OBJETOS {

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println(prueba);

        //eliminar objeto
        //terminar programa --> Garbage Collector --> liberar memoria
        //Eliminar directamente el objeto
        prueba = null;
    }
    
}
