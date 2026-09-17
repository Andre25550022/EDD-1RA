package eva1_1_scope;
public class EVA1_1_SCOPE {
    public static void main(String[] args) {
        int x = 100; //EXISTE DENTRO DEL BLOQUE DEL MAIN
        for (int i = 0; i < 10; i++){ //EXISTE SOLO DENTRO DEL FOR
            System.out.println("i = " + i);
            x ++;
        }
        System.out.println("Valor final de la i = " + i);//NO EXISTE
        System.out.println("Valor final de la x = " + x);//TODAVIA EXISTE
    }
    
    public static void OtraFuncion(){
        System.out.println("Valor de x " + x); //NO EXISTE
    }
    
}
