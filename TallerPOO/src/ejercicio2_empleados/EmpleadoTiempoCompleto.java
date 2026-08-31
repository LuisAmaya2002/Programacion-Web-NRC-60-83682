package ejercicio2_empleados;

public class EmpleadoTiempoCompleto extends Empleado {

    private long bonificacion;

    public EmpleadoTiempoCompleto(String nombre, long salario, long bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    public long getBonificacion() { return bonificacion; }
    public void setBonificacion(long bonificacion) { this.bonificacion = bonificacion; }

    // Sobreescritura de calcularSalario(): salario + bonificación
    @Override
    public long calcularSalario() {
        return salario + bonificacion;
    }
}
