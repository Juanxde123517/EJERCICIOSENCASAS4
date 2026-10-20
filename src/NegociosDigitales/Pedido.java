package NegociosDigitales;


public class Pedido {
    private int numero;
    private String cliente;
    private double total;
    private String estado;

    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public Pedido(String cliente, double total) {
        if (cliente == null || cliente.isEmpty()) {
            throw new IllegalArgumentException("Cliente invalido");
        }
        if (total < 0) {
            throw new IllegalArgumentException("Total invalido");
        }

        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    public void confirmar() {
        if (this.estado.equals("Pendiente")) {
            this.estado = "Confirmado";
            ventasTotales += this.total;
        }
    }

    public static int getTotalPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }
}
