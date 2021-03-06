package Data;

public class Ghost {
    
    private Square squareG;
    private String nombre;
    private String symbol;
    private String image;

    public Ghost(Square squareG, String nombre, String symbol, String image) {
        this.squareG = squareG;
        this.nombre = nombre;
        this.symbol = symbol;
        this.image = image;
    }

    public Square getSquare() {
        return squareG;
    }

    public void setSquare(Square square) {
        this.squareG = square;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
