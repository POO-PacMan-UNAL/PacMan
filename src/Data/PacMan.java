package Data;

import UI.*;

public class PacMan extends Square {

    private final static int initialI = 10;
    private final static int initialJ = 13;
    private static int i = 10;
    private static int j = 13;

    public static int getInitialI() {
        return initialI;
    }

    public static int getInitialJ() {
        return initialJ;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        PacMan.i = i;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        PacMan.j = j;
    }

    public static boolean movementPacMan(String movement, int[][] integersBoard, int i, int j) {

        if (movement.equalsIgnoreCase("w")) {
            if (integersBoard[i - 1][j] == 1 || integersBoard[i - 1][j] == 2) {
                PacManUI.hitWall();
            } else {
                integersBoard[i - 1][j] = 5;
                integersBoard[i][j] = 0;
                setI(i - 1);
            }
            return true;
        } else if (movement.equalsIgnoreCase("s")) {
            if (integersBoard[i + 1][j] == 1 || integersBoard[i + 1][j] == 2) {
                PacManUI.hitWall();
            } else {
                integersBoard[i + 1][j] = 5;
                integersBoard[i][j] = 0;
                setI(i + 1);
            }
            return true;
        } else if (movement.equalsIgnoreCase("a")) {
            if (integersBoard[i][j - 1] == 1 || integersBoard[i][j - 1] == 2) {
                PacManUI.hitWall();
            } else {
                integersBoard[i][j - 1] = 5;
                integersBoard[i][j] = 0;
                setJ(j - 1);
            }
            return true;
        } else if (movement.equalsIgnoreCase("d")) {
            if (integersBoard[i][j + 1] == 1 || integersBoard[i][j + 1] == 2) {
                PacManUI.hitWall();
            } else {
                integersBoard[i][j + 1] = 5;
                integersBoard[i][j] = 0;
                setJ(j + 1);
            }
            return true;
        } else if (movement.equalsIgnoreCase("q")) {
            setI(initialI);
            setJ(initialJ);
            return false;
        } else {
            PacManUI.invalidOption();
            return true;
        }

    }

    @Override
    public String toString() {
        return "e";
    }

}
