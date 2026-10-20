package NegociosDigitales;


public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int stock) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Datos invalidos");
        }

        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public static int getTotalProductos() {
        return contadorProductos;
    }
}

