package Data;

public class Ghost extends Square {
    
    private static String nombre;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Ghost.nombre = nombre;
    }
    
    public static void movementGhosts(String movement, int[][] boardIntegers, int i, int j) {       
    }
    
}
