package Software;

public class MainAplicacion {
    public static void main(String[] args) {
        Aplicacion a1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion a2 = new Aplicacion("SistemaInventario", "2.0");

        System.out.println("Total de aplicaciones: "
                + Aplicacion.getTotalAplicaciones());

        System.out.println("Estado inicial: " + a1.isEjecutando());

        a1.iniciar();
        System.out.println("Despues de iniciar: " + a1.isEjecutando());

        a1.cerrar();
        System.out.println("Despues de cerrar: " + a1.isEjecutando());

        System.out.println("ID de la segunda aplicacion: " + a2.getId());
    }
}
