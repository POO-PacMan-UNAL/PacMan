package Data;

public class PacDot extends Square {

    private static int pacDotsRemaining = 0;

    public static int getPacDotsRemaining() {
        return pacDotsRemaining;
    }

    public static void setPacDotsRemaining(int pacDotsRemaining) {
        PacDot.pacDotsRemaining = pacDotsRemaining;
    }

    @Override
    public String toString() {
        return "°";
    }

}
