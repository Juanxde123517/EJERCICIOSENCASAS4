package NegociosDigitales;


public class MainProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Mouse", 25.50, 10);
        Producto p2 = new Producto("Teclado", 35.00, 15);
        Producto p3 = new Producto("Monitor", 200.00, 5);
        Producto p4 = new Producto("Audifonos", 20.00, 8);
        Producto p5 = new Producto("Laptop", 800.00, 3);

        System.out.println("Total de productos: "
                + Producto.getTotalProductos());

        System.out.println("ID: " + p1.getId());
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: " + p1.getPrecio());
        System.out.println("Stock: " + p1.getStock());
    }
}
