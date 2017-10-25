package Data;

public class Pill {
    
    private Square squareP;
    private String symbol;
    private String image;
    
    /*Pill es la clase que agrupa los pacdocts, las píldoras de poder y las frutas, es decir, lo que el PacMan se
    puede comer como no se que tipo de atributo se coloca para identificar que hay varios tipos de pastillas
    */

    public Pill(Square squareP, String symbol, String image) {
        this.squareP = squareP;
        this.symbol = symbol;
        this.image = image;
    }

    public Square getSquare() {
        return squareP;
    }

    public void setSquare(Square square) {
        this.squareP = square;
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

}
