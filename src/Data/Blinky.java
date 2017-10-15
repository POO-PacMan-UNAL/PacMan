package Data;

import java.util.Random;

public class Blinky extends Ghost {

    private static int[] vector = new int[1];
    private static int movementG2;
    private static int movementG;
    private static int i = 16;
    private static int j = 25;

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Blinky.i = i;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Blinky.j = j;
    }

    public static void movementBlinky(int getMovementG, int[][] boardIntegers, int i, int j) {

        if (getMovementG == -1) {
            if (boardIntegers[i - 1][j] == 1 || boardIntegers[i - 1][j] == 2) {
                Random rnd = new Random();
                movementG2 = (int) (rnd.nextDouble() * 5 + -2);
                Blinky.movementBlinky(movementG2, Board.getIntegersBoard(), Blinky.getI(), Blinky.getJ());
            } else {
                vector[0] = boardIntegers[i - 1][j];
                boardIntegers[i - 1][j] = 6;
                boardIntegers[i][j] = vector[0];
                setI(i - 1);
                Board.setIntegersBoard(boardIntegers);
            }

        } else if (getMovementG == 1) {
            if (boardIntegers[i + 1][j] == 1 || boardIntegers[i + 1][j] == 2) {
                Random rnd = new Random();
                movementG2 = (int) (rnd.nextDouble() * 5 + -2);
                Blinky.movementBlinky(movementG2, Board.getIntegersBoard(), Blinky.getI(), Blinky.getJ());
            } else {
                vector[0] = boardIntegers[i + 1][j];
                boardIntegers[i + 1][j] = 6;
                boardIntegers[i][j] = vector[0];
                setI(i + 1);
                Board.setIntegersBoard(boardIntegers);
            }

        } else if (getMovementG == 0) {
            if (boardIntegers[i][j - 1] == 1 || boardIntegers[i][j - 1] == 2) {
                Random rnd = new Random();
                movementG2 = (int) (rnd.nextDouble() * 5 + -2);
                Blinky.movementBlinky(movementG2, Board.getIntegersBoard(), Blinky.getI(), Blinky.getJ());
            } else {
                vector[0] = boardIntegers[i][j - 1];
                boardIntegers[i][j - 1] = 6;
                boardIntegers[i][j] = vector[0];
                setJ(j - 1);
                Board.setIntegersBoard(boardIntegers);
            }

        } else if (getMovementG == 2) {
            if (boardIntegers[i][j + 1] == 1 || boardIntegers[i][j + 1] == 2) {
                Random rnd = new Random();
                movementG2 = (int) (rnd.nextDouble() * 5 + -2);
                Blinky.movementBlinky(movementG2, Board.getIntegersBoard(), Blinky.getI(), Blinky.getJ());
            } else {
                vector[0] = boardIntegers[i][j + 1];
                boardIntegers[i][j + 1] = 6;
                boardIntegers[i][j] = vector[0];
                setJ(j + 1);
                Board.setIntegersBoard(boardIntegers);
            }
        }

    }

    public int getMovementG() {
        return movementG;
    }

    public void setMovementG(int movementG) {
        Blinky.movementG = movementG;
    }

    @Override
    public String toString() {
        return "♥";
    }

}
