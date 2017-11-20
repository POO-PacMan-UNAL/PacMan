package BusinessLogic;

import Data.*;
import UI.*;
import java.util.Random;
import java.applet.AppletContext;

public class Methods {

    /*public static void startGame() {

        boolean condition = true; hola
        String movement;
        int movementG;

        initializeMatrix(Board.getFixedIntegerBoard(), Board.getIntegersBoard());
        
        while (condition) {
            fillMatrix(Board.getObjectsBoard(), Board.getIntegersBoard());
            UIConsole.printMatrix(Board.getObjectsBoard());
            movement = UIConsole.readMovement();
            if (PacMan.movementPacMan(movement, Board.getIntegersBoard(), PacMan.getI(), PacMan.getJ()) == false) {
                condition = false;
            } else {
                condition = checkPacDots(Board.getIntegersBoard());
            }
            
            Random rnd = new Random();
            movementG = (int) (rnd.nextDouble() * 5 + -2);
            Blinky.movementBlinky(movementG, Board.getIntegersBoard(), Blinky.getI(), Blinky.getJ());
            if (Blinky.getI() == PacMan.getI() && Blinky.getJ() == PacMan.getJ()) {
                UIConsole.lost();
                break;
            }
        }

    }

    public static void initializeMatrix(int[][] fixedIntegerBoard, int[][] integersBoard) {

        for (int i = 0; i < integersBoard.length; i++) {
            for (int j = 0; j < integersBoard[0].length; j++) {
                integersBoard[i][j] = fixedIntegerBoard[i][j];
            }
        }
    }

    public static void fillMatrix(Square[][] objectsBoard, int[][] integersBoard) {

        for (int i = 0; i < integersBoard.length; i++) {
            for (int j = 0; j < integersBoard[0].length; j++) {
                if (integersBoard[i][j] == 0) {
                    objectsBoard[i][j] = new EmptySquare();
                }
                if (integersBoard[i][j] == 1) {
                    objectsBoard[i][j] = new Wall1();
                }
                if (integersBoard[i][j] == 2) {
                    objectsBoard[i][j] = new Wall2();
                }
                if (integersBoard[i][j] == 3) {
                    objectsBoard[i][j] = new Wall();
                }
                if (integersBoard[i][j] == 4) {
                    objectsBoard[i][j] = new Pill();
                }
                if (integersBoard[i][j] == 5) {
                    objectsBoard[i][j] = new PacMan();
                }
                if (integersBoard[i][j] == 6) {
                    objectsBoard[i][j] = new Blinky();
                }
                if (integersBoard[i][j] == 7) {
                    objectsBoard[i][j] = new Clyde();
                }
                if (integersBoard[i][j] == 8) {
                    objectsBoard[i][j] = new Pinky();
                }
                if (integersBoard[i][j] == 9) {
                    objectsBoard[i][j] = new Inky();
                }
            }
        }
    }

    public static boolean checkPacDots(int[][] boardIntegers) {

        int counter = 0;
        for (int i = 0; i < boardIntegers.length; i++) {
            for (int j = 0; j < boardIntegers[0].length; j++) {
                if (boardIntegers[i][j] == 3) {
                    counter++;
                }
            }
        }
        Wall.setPacDotsRemaining(counter);
        if (Wall.getPacDotsRemaining() == 0) {
            fillMatrix(Board.getObjectsBoard(), Board.getIntegersBoard());
            UIConsole.printMatrix(Board.getObjectsBoard());
            UIConsole.win();
            return false;
        } else {
            return true;
        }

    }*/
}
