package Software;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("mlopez", "mlopez@correo.com");
        Usuario u3 = new Usuario("agarcia", "agarcia@correo.com");
        Usuario u4 = new Usuario("crojas", "crojas@correo.com");

        System.out.println("Total de usuarios: "
                + Usuario.getTotalUsuarios());

        System.out.println("ID del primer usuario: " + u1.getId());
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Correo: " + u1.getCorreo());
        System.out.println("Usuario activo: " + u1.isActivo());
    }
}
