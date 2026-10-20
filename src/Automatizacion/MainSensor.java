package Automatizacion;

public class MainSensor {
    public static void main(String[] args) {
        Sensor s1 = new Sensor("Temperatura", "C");
        Sensor s2 = new Sensor("Presion", "Pa");
        Sensor s3 = new Sensor("Humedad", "%");

        System.out.println("Cantidad de sensores: "
                + Sensor.getCantidadSensores());

        System.out.println("ID: " + s1.getId());
        System.out.println("Tipo: " + s1.getTipo());
        System.out.println("Unidad: " + s1.getUnidad());
        System.out.println("Lectura inicial: " + s1.getLectura());
    }
}
