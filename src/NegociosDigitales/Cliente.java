package NegociosDigitales;


public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private boolean activo;

    private static int contadorClientes = 0;

    public Cliente(String nombre, String correo) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        if (correo == null || !correo.contains("@")) {
            throw new IllegalArgumentException("Correo invalido");
        }

        contadorClientes++;
        this.id = contadorClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = true;
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    public static int getTotalClientes() {
        return contadorClientes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isActivo() {
        return activo;
    }
}
