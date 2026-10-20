package Software;

public class MainServidor {
    public static void main(String[] args) {
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor s3 = new Servidor("ServidorArchivos", "192.168.1.22");
        Servidor s4 = new Servidor("ServidorCorreo", "192.168.1.23");
        Servidor s5 = new Servidor("ServidorDNS", "192.168.1.24");

        System.out.println("Total de servidores: "
                + Servidor.getTotalServidores());

        System.out.println("Servidores activos al inicio: "
                + Servidor.getServidoresActivos());

        s1.activar();
        s2.activar();
        s1.activar();

        System.out.println("Servidores activos despues de activar: "
                + Servidor.getServidoresActivos());

        s1.desactivar();

        System.out.println("Servidores activos despues de desactivar: "
                + Servidor.getServidoresActivos());

        System.out.println("Estado del servidor 1: " + s1.isActivo());
        System.out.println("Estado del servidor 2: " + s2.isActivo());
    }
}
