package ejercicio1_persona;

public class Persona {

    // Atributos privados (Encapsulamiento)
    private String nombre;
    private int edad;
    private String documento;

    // Constructor que inicializa los tres atributos
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    // Métodos get y set
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    // Método que muestra la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Documento: " + documento);
    }

    // Método que valida si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}
