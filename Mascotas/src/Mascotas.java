public class Mascotas {
    private String nombre;
    private int vida;
    private String clase;
    private double precio;
    private int stock;
    private int vendidas;

    public Mascotas(String nombre, int vida, String clase, double precio, int stock) {
        this.nombre = nombre;
        this.vida = vida;
        this.clase = clase;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double vender(int cantidad){
        if(cantidad <= 50){
            if(cantidad<= stock){
                stock-= cantidad;
                return cantidad * precio;
            }else
                return 0;
        }else
            return 0;
    }

    public boolean comprar(int cantidad){
        if (cantidad >= 5){
            stock -= cantidad;
            return true;
        }else
            return false;
    }

    public int getVendidas() {
        return vendidas;
    }

    public void setVendidas(int vendidas) {
        this.vendidas = vendidas;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", clase='" + clase + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", vendidas=" + vendidas +
                '}';
    }
}
