package UI;

import Data.*;

public interface UI {

    public void printWelcome(Player player1, Player player2);

    public int askMovement(Board board, char player);

    public int askMenuOption();

    public void printError(String error);

    public void printBoard(Board board);

    public void printWinner(Player player);

    public void printTie();

    public void printMenu();
    
}
