package ejercicio2_empleados;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Random random = new Random();

        String[] nombres = {"Pepito Perez", "Ana Gomez", "Luis Torres", "Sofia Ramirez",
                "Diego Castro", "Paula Nino", "Mateo Rojas", "Daniela Vargas",
                "Jorge Silva", "Carla Mendez"};

        // Crear al menos 10 empleados aleatorios (mezcla de los dos tipos)
        for (int i = 0; i < 10; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];

            if (random.nextBoolean()) {
                long salario = (random.nextInt(10) + 1) * 500000L;
                long bonificacion = (random.nextInt(5) + 1) * 100000L;
                listaEmpleados.add(new EmpleadoTiempoCompleto(nombre, salario, bonificacion));
            } else {
                int horas = (random.nextInt(4) + 1) * 20; // 20, 40, 60 u 80 horas
                long valorHora = 60000L;
                listaEmpleados.add(new EmpleadoPorHoras(nombre, horas, valorHora));
            }
        }

        System.out.println("===== Salarios calculados =====");
        int contador = 1;
        for (Empleado emp : listaEmpleados) {
            if (emp instanceof EmpleadoTiempoCompleto etc) {
                System.out.println("Empleado " + contador + ": \"" + etc.getNombre() +
                        "\", Salario Actual: \"" + etc.calcularSalario() +
                        "\", Bonificación: " + etc.getBonificacion());
            } else if (emp instanceof EmpleadoPorHoras eph) {
                System.out.println("Empleado " + contador + ": \"" + eph.getNombre() +
                        "\", Salario Actual: \"" + eph.calcularSalario() +
                        "\", Cantidad horas trabajadas: " + eph.getHorasTrabajadas() +
                        ". Valor de la hora: " + eph.getValorHora());
            }
            contador++;
        }
    }
}
