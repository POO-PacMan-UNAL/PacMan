package Data;

import UI.*;

public class PacMan {

    /*private final static int initialI = 10;
    private final static int initialJ = 13;
    private static int i = 10;
    private static int j = 13;*/

    private Square squarePM;
    private String symbol;
    private String image;
    private boolean alive;

    public PacMan(Square squarePM, String symbol, String image, boolean alive) {
        this.squarePM = squarePM;
        this.symbol = symbol;
        this.image = image;
        this.alive = alive;
    }

    public Square getSquarePM() {
        return squarePM;
    }

    public void setSquarePM(Square squarePM) {
        this.squarePM = squarePM;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
            
    /*public static boolean movementPacMan(String movement, int[][] integersBoard, int i, int j) {

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

    }*/

}
