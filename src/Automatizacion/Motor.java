package Automatizacion;

public class Motor {
    private int id;
    private String nombre;
    private double potencia;
    private boolean encendido;

    private static int totalMotores = 0;
    private static int motoresEncendidos = 0;

    public Motor(String nombre, double potencia) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        if (potencia < 0) {
            throw new IllegalArgumentException("Potencia invalida");
        }

        totalMotores++;
        this.id = totalMotores;
        this.nombre = nombre;
        this.potencia = potencia;
        this.encendido = false;
    }

    public void encender() {
        if (!this.encendido) {
            this.encendido = true;
            motoresEncendidos++;
        }
    }

    public void apagar() {
        if (this.encendido) {
            this.encendido = false;
            motoresEncendidos--;
        }
    }

    public static int getTotalMotores() {
        return totalMotores;
    }

    public static int getMotoresEncendidos() {
        return motoresEncendidos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPotencia() {
        return potencia;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
