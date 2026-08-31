package ejercicio2_empleados;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private long valorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, long valorHora) {
        // El salario base no aplica para este tipo de empleado, se pasa en 0
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }

    public long getValorHora() { return valorHora; }
    public void setValorHora(long valorHora) { this.valorHora = valorHora; }

    // Sobreescritura de calcularSalario(): horasTrabajadas x valorHora
    @Override
    public long calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
