package Data;

public class Fruit extends Square {
    
    private String tipo;
    private String nombre;
    private int posicionX;
    private int posicionY;
    private int tamaño;
    private int tiempo;
    
    public Fruit(){
      
      Fruit cereza = new Fruit();
      Fruit fresa = new Fruit();
      Fruit Naranja = new Fruit();
      Fruit manzana = new Fruit();
      Fruit uva = new Fruit();
      Fruit campana = new Fruit();
      Fruit Llave = new Fruit();
      
  }  

    public Fruit(String tipo, String nombre, int posicionX, int posicionY, int tamaño, int tiempo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tamaño = tamaño;
        this.tiempo = tiempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public String toString() {
        return "F";
    }
    
}
