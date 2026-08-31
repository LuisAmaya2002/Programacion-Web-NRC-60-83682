package ejercicio2_empleados;

public class Empleado {

    protected String nombre;
    protected long salario;

    public Empleado(String nombre, long salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public long getSalario() { return salario; }
    public void setSalario(long salario) { this.salario = salario; }

    // Método base, será sobreescrito por las clases hijas
    public long calcularSalario() {
        return salario;
    }
}
