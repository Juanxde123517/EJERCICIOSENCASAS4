package Automatizacion;

public class Sensor {
    private int id;
    private String tipo;
    private String unidad;
    private double lectura;

    private static int cantidadSensores = 0;

    public Sensor(String tipo, String unidad) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo invalido");
        }
        if (unidad == null || unidad.isEmpty()) {
            throw new IllegalArgumentException("Unidad invalida");
        }

        cantidadSensores++;
        this.id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
        this.lectura = 0;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public double getLectura() {
        return lectura;
    }

    public static int getCantidadSensores() {
        return cantidadSensores;
    }
}
