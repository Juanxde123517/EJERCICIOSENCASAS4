package Software;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        if (direccionIP == null || !direccionIP.contains(".")) {
            throw new IllegalArgumentException("Direccion IP invalida");
        }

        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
        }
    }

    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }
}
