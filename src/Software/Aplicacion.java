package Software;

public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        if (version == null || version.isEmpty()) {
            throw new IllegalArgumentException("Version invalida");
        }

        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public void iniciar() {
        this.ejecutando = true;
    }

    public void cerrar() {
        this.ejecutando = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }
}
