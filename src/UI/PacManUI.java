package UI;

import java.util.Scanner;
import Data.*;

public class PacManUI {

    public static void welcome() {
        System.out.println("********************************************************************");
        System.out.println("******************* BIENVENIDOS AL JUEGO PACMAN ********************");
        System.out.println("********************************************************************");
    }

    public static void mainMenu() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("**************** Por favor ingresa el número de la *****************");
        System.out.println("******************* opción que desees ejecutar: ********************");
        System.out.println("********************************************************************");
        System.out.println("[1] Iniciar partida");
        System.out.println("[2] Controles");
        System.out.println("[3] Acerca de");
        System.out.println("[0] Salir");
        System.out.println("********************************************************************");
        System.out.println("");
    }

    public static void controls() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("Los controles de Pacman son simples:");
        System.out.println("- Presiona w para moverte hacia Arriba");
        System.out.println("- Presiona s para moverte hacia Abajo");
        System.out.println("- Presiona a para moverte hacia Izquierda");
        System.out.println("- Presiona d para moverte hacia Derecha");
        System.out.println("- Presiona q para salir de la partida actual");
        System.out.println("********************************************************************");
        System.out.println("");
    }

    public static void about() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("*****  Pacman, el clásico juego de arcade, fue originalmente  ******");
        System.out.println("*******  creado por Namco a principios de los años ochenta.  *******");
        System.out.println("***  La idea es simple, guia a Pacman por el laberinto para que  ***");
        System.out.println("***  pueda comer todos los pequeños puntos blancos, evitando a  ****");
        System.out.println("******************  los desagradables fantasmas.  ******************");
        System.out.println("**  Si consigues comer una píldora de energía, podras comerte a  ***");
        System.out.println("***********  los fantasmas durante un tiempo limitado.  ************");
        System.out.println("*****  Ocasionalmente, aparece una fruta que te da un bono de  *****");
        System.out.println("*****  puntuación cuando se come. Basta de charla, ¡A comer!  ******");
        System.out.println("********************************************************************");
        System.out.println("");
    }

    public static void invalidOption() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("*************** Opción no válida, intenta de nuevo. ****************");
        System.out.println("********************************************************************");
        System.out.println("");
    }

    public static void farewell() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("******************** Estas saliendo del juego. *********************");
        System.out.println("*************** Gracias por tu visita, hasta luego. ****************");
        System.out.println("********************************************************************");
        System.out.println("");
    }

    public static void win() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("****************** ! FELICITACIONES HAS GANADO ¡ *******************");
        System.out.println("********************************************************************");
        System.out.println("");
    }
    
    public static void hitWall() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("************* Has golpeado la pared, intenta de nuevo. *************");
        System.out.println("********************************************************************");
        System.out.println("");
    }
    
    public static void lost() {
        System.out.println("");
        System.out.println("********************************************************************");
        System.out.println("************************* ! HAS PERDIDO ¡ **************************");
        System.out.println("********************************************************************");
        System.out.println("");
    }

    public static int readOption() {
        Scanner option = new Scanner(System.in);
        return option.nextInt();
    }

    public static String readMovement() {
        Scanner Movement = new Scanner(System.in);
        return Movement.next();

    }

    public static void printMatrix(Square[][] boardObjects) {
        for (int i = 0; i < boardObjects.length; i++) {
            for (int j = 0; j < boardObjects[0].length; j++) {
                System.out.print(boardObjects[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
