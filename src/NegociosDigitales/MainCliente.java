package NegociosDigitales;


public class MainCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana Perez", "ana@correo.com");
        Cliente c2 = new Cliente("Carlos Lopez", "carlos@correo.com");
        Cliente c3 = new Cliente("Maria Torres", "maria@correo.com");

        System.out.println("Total de clientes: "
                + Cliente.getTotalClientes());

        System.out.println("Cliente activo: " + c1.isActivo());

        c1.desactivar();
        System.out.println("Cliente despues de desactivar: "
                + c1.isActivo());

        c1.activar();
        System.out.println("Cliente despues de activar: "
                + c1.isActivo());
    }
}
