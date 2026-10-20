package Software;


public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;

    private static int contadorUsuarios = 0;

    public Usuario(String username, String correo) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username invalido");
        }
        if (correo == null || !correo.contains("@")) {
            throw new IllegalArgumentException("Correo invalido");
        }

        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getTotalUsuarios() {
        return contadorUsuarios;
    }
}
