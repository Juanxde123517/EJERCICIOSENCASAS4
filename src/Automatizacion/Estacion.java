package Automatizacion;

public class Estacion {
    private int id;
    private String ubicacion;
    private String variable;
    private double lectura;

    private static int totalEstaciones = 0;

    public Estacion(String ubicacion, String variable) {
        if (ubicacion == null || ubicacion.isEmpty()) {
            throw new IllegalArgumentException("Ubicacion invalida");
        }
        if (variable == null || variable.isEmpty()) {
            throw new IllegalArgumentException("Variable invalida");
        }

        totalEstaciones++;
        this.id = totalEstaciones;
        this.ubicacion = ubicacion;
        this.variable = variable;
        this.lectura = 0;
    }

    public void actualizarLectura(double nuevaLectura) {
        this.lectura = nuevaLectura;
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getVariable() {
        return variable;
    }

    public double getLectura() {
        return lectura;
    }

    public static int getTotalEstaciones() {
        return totalEstaciones;
    }
}
