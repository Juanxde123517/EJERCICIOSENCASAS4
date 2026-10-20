package NegociosDigitales;


public class MainPedido {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Carlos", 120.50);
        Pedido p2 = new Pedido("Ana", 80.00);
        Pedido p3 = new Pedido("Maria", 50.00);

        System.out.println("Total de pedidos: "
                + Pedido.getTotalPedidos());

        System.out.println("Estado inicial: " + p1.getEstado());

        p1.confirmar();
        p2.confirmar();

        System.out.println("Estado del pedido 1: " + p1.getEstado());
        System.out.println("Ventas totales: "
                + Pedido.getVentasTotales());

        p1.confirmar();

        System.out.println("Ventas despues de confirmar nuevamente: "
                + Pedido.getVentasTotales());
    }
}
