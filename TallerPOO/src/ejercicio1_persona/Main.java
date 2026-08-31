package ejercicio1_persona;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Random random = new Random();

        String[] nombres = {"Carlos", "Maria", "Juan", "Laura", "Andres",
                "Camila", "Felipe", "Valentina", "Santiago", "Isabella"};

        // Crear al menos 10 personas con datos aleatorios
        for (int i = 0; i < 10; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(60) + 1; // edad entre 1 y 60 años
            String documento = String.valueOf(1000000000L + random.nextInt(900000000));

            Persona persona = new Persona(nombre, edad, documento);
            listaPersonas.add(persona);
        }

        System.out.println("===== Información de las personas =====");
        for (Persona p : listaPersonas) {
            p.mostrarInformacion();
        }

        System.out.println("\n===== Verificación de mayoría de edad =====");
        mostrarMayoresDeEdad(listaPersonas);
    }

    // Método que recorre la lista e imprime si cada persona es mayor de edad
    public static void mostrarMayoresDeEdad(ArrayList<Persona> personas) {
        for (Persona p : personas) {
            if (p.esMayorDeEdad()) {
                System.out.println("Nombre: " + p.getNombre() + " Es mayor de edad");
            } else {
                System.out.println("Nombre: " + p.getNombre() + " No es mayor de edad");
            }
        }
    }
}
