package Automatizacion;

public class MainEstacion {
    public static void main(String[] args) {
        Estacion e1 = new Estacion("Laboratorio 1", "Temperatura");
        Estacion e2 = new Estacion("Laboratorio 2", "Humedad");
        Estacion e3 = new Estacion("Planta", "Presion");

        System.out.println("Total de estaciones: "
                + Estacion.getTotalEstaciones());

        System.out.println("Lectura inicial: " + e1.getLectura());

        e1.actualizarLectura(25.5);
        System.out.println("Lectura actualizada: " + e1.getLectura());

        e2.actualizarLectura(60.0);
        System.out.println("Lectura de e2: " + e2.getLectura());

        System.out.println("Variable de e1: " + e1.getVariable());
    }
}
