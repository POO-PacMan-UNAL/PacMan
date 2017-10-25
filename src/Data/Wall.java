package Data;

public class Wall {
        
    private Square squareW;
    private String symbol;
    private String image;

    public Wall(Square squareW, String symbol, String image) {
        this.squareW = squareW;
        this.symbol = symbol;
        this.image = image;
    }

    public Square getSquare() {
        return squareW;
    }

    public void setSquare(Square square) {
        this.squareW = square;
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
