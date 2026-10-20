package Automatizacion;

public class MainMotor {
    public static void main(String[] args) {
        Motor m1 = new Motor("Motor principal", 15.5);
        Motor m2 = new Motor("Motor secundario", 10.0);
        Motor m3 = new Motor("Motor auxiliar", 5.0);

        System.out.println("Total de motores: "
                + Motor.getTotalMotores());

        m1.encender();
        m2.encender();

        System.out.println("Motores encendidos: "
                + Motor.getMotoresEncendidos());

        m1.encender();
        System.out.println("Despues de encender nuevamente m1: "
                + Motor.getMotoresEncendidos());

        m1.apagar();
        System.out.println("Despues de apagar m1: "
                + Motor.getMotoresEncendidos());

        System.out.println("Estado de m3: " + m3.isEncendido());
    }
}
