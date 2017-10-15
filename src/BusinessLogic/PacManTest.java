package BusinessLogic;

import UI.*;

public class PacManTest {

    public PacManTest() {
    }

    public static void main(String[] args) {

        boolean cond = true;
        int option;

        PacManUI.welcome();

        while (cond) {
            PacManUI.mainMenu();
            option = PacManUI.readOption();
            switch (option) {
                case 1:
                    Methods.startGame();
                    break;
                case 2:
                    PacManUI.controls();
                    break;
                case 3:
                    PacManUI.about();
                    break;
                case 0:
                    cond = false;
                    break;
                default:
                    PacManUI.invalidOption();
                    break;
            }
        }
        PacManUI.farewell();

    }

}
